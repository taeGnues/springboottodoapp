package com.springboot.myfirstwebapptodo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {
    // LDAP 혹은 Database를 사용
    // 여기서는 in-memory

    @Bean
    public InMemoryUserDetailsManager createDetailsManager() {
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        String username = "taeseung";
        String password = "1234";

        UserDetails userDetails1 = createNewUser(passwordEncoder, username, password);

        String username2 = "gnues";
        String password2 = "1234";

        UserDetails userDetails2 = createNewUser(passwordEncoder, username2, password2);

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

    private static UserDetails createNewUser(Function<String, String> passwordEncoder, String username, String password) {
        UserDetails userDetails = User.builder()
                                    .passwordEncoder(passwordEncoder)
                                    .username(username)
                                    .password(password)
                                    .roles("USER", "ADMIN")
                                    .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
