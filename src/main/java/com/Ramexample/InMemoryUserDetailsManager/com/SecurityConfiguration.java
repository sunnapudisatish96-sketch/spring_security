package com.Ramexample.InMemoryUserDetailsManager.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsSevice(PasswordEncoder encoder) {
        UserDetails user1 = User.withUsername("Satish")
                .password(encoder.encode("user123"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("Ramesh")
                .password(encoder.encode("Admin123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, admin);
    }

    @Bean
    public SecurityFilterChain fileterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/public").permitAll()
                    .anyRequest().authenticated()
            )
            .httpBasic(withDefaults())      
            .formLogin(withDefaults());   

        return http.build();
    }
}
