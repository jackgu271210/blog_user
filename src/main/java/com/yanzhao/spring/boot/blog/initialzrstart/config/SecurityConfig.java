package com.yanzhao.spring.boot.blog.initialzrstart.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter{
    /**
     * 自定义配置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/css/**","/js/**","/fonts/**","/index").permitAll() //都可以访问
            .antMatchers("/users/**").hasRole("ADMIN") //需要相应的权限才能访问
            .and()
            .formLogin()  //基于Form表单登录验证
            .loginPage("/login").failureUrl("/login-error");  //自定义登录页面
    }
}
