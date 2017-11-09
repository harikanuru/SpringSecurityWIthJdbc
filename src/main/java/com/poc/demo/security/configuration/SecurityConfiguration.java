package com.poc.demo.security.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select username,password, enabled from users where username=?")
				.authoritiesByUsernameQuery("select username, role from user_roles where username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/welcome","/registerUser", "/updateEmp").hasRole("ADMIN")
				.anyRequest().authenticated().and().formLogin().permitAll().and().logout()
				.permitAll();
		http.exceptionHandling().accessDeniedPage("/403");*/
		
	
		
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/welcome").hasRole("ADMIN")
		.antMatchers("/dashboard").hasRole("USER").anyRequest().authenticated().and().formLogin().permitAll().and().logout().logoutUrl("/j_spring_security_logout").
		invalidateHttpSession(true).logoutSuccessUrl("/login").permitAll();
		http.exceptionHandling().accessDeniedPage("/403");
	}


}
