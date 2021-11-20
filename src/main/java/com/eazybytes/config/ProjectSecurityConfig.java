package com.eazybytes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * /myAccount - Secured
     * /myBalance - Secured
     * /myLoans - Secured
     * /myCard - Secured
     * /notices - Not Secured
     * /contact - Not Secured
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests((requests) -> {
            requests
//                    .antMatchers("/myAccount").authenticated()
//                    .antMatchers("/myBalance").authenticated()
//                    .antMatchers("/myLoans").authenticated()
//                    .antMatchers("/myCard").authenticated()
//                    .antMatchers("/notices").permitAll()
//                    .antMatchers("/contact").permitAll();
                    .anyRequest().denyAll();
        });
        http.formLogin();
        http.httpBasic();
    }
}
