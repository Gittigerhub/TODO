package com.muzik.todo.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {        // 어플리케이션 환경설정용 클래스로 쓸거라 변수명 이렇게 설정함

    // 여기에 작성하는 모든 메소드는 시스템에 등록 @Bean

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();   // 자동으로 modelmapper 생성
    }

}
