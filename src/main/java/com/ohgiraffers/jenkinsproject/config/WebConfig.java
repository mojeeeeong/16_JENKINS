package com.ohgiraffers.jenkinsproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* My. 어노테이션 주석처리하면 CORS 처리 안된다. POJO가 된다. */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        /* My. 백엔드에서 CORS를 신경쓰고 있다. */
        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:5173")

                /* Ingress 적용 이전 프론트 워커노드 포트에 대한 CORS 처리 */
//                .allowedOrigins("http://localhost:30000")

                /* Ingress 적용 이후 CORS 불필요로 인한 경로 제거 */
                .allowedOrigins()
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
