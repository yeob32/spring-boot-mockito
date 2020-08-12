package com.example.demo;

import com.example.demo.user.User;
import com.example.demo.user.repository.DefaultUserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                User user = new User(1L, "yeob32");

                System.out.println("create user : " + user);
                DefaultUserRepository.userMap.put(user.getId(), user);
            }
        };
    }
}
