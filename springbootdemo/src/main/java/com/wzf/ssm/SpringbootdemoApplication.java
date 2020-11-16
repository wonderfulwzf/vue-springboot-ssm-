package com.wzf.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

@SpringBootApplication
@MapperScan(basePackages = "com.wzf.ssm.mapper")
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
    //解决跨域
    @Bean
    public CorsWebFilter corsFilter() {
        //1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        //2) 是否发送Cookie信息
        config.setAllowCredentials(Boolean.TRUE);
        //1) 允许的域,不要写*，否则cookie就无法使用了
        //config.addAllowedOrigin("http://xxx.xxx.com");
        /*   config.addAllowedOrigin("http://api.xxx.com");*/
        config.addAllowedOrigin("*");
        //3) 允许的请求方式
        config.addAllowedMethod("*");
        // 4）允许的头信息
        config.addAllowedHeader("*");
        // 4）有效时间
        config.setMaxAge(3600L);

        //2.添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config);

        //3.返回新的CorsFilter.
        return new CorsWebFilter(source);
    }

}
