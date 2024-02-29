package ch.m183.BrokenAccessControllDemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

  // Custom user details service
  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails user = User.withUsername("user")
            .password(passwordEncoder().encode("password"))
            .roles("USER")
            .build();
    UserDetails admin = User.withUsername("admin")
            .password(passwordEncoder().encode("password"))
            .roles("ADMIN")
            .build();
    return new InMemoryUserDetailsManager(user, admin);
  }

  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
            .authorizeHttpRequests(authorizeRequests ->
                    authorizeRequests
                            .requestMatchers(HttpMethod.GET, "/").permitAll()
                            .requestMatchers(HttpMethod.GET, "/home").hasRole("USER")
                            .requestMatchers(HttpMethod.GET, "/authenticated").authenticated()
                            .requestMatchers(HttpMethod.GET, "/admin").hasAnyRole("USER", "ADMIN") // This is the vulnerability
                            .anyRequest().authenticated()
            )
            .userDetailsService(userDetailsService())
            .formLogin(withDefaults());
    return http.build();
  }
}
