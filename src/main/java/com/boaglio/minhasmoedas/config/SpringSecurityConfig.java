package com.boaglio.minhasmoedas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.  authorizeRequests()
                .antMatchers("/","/home","/sobre","/resources/**", "/static/**", "/css/**", "/js/**", "/images/**").permitAll()
                .anyRequest().authenticated()
                .and()
              .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
             .logout()
                .permitAll() ;
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
    	
    	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	UserBuilder users = User.builder().passwordEncoder(encoder::encode);
    	
    	UserDetails user = users.username("admin").password("admin").roles("ADMIN").build();
 
        return new InMemoryUserDetailsManager(user);
    }
 

}
