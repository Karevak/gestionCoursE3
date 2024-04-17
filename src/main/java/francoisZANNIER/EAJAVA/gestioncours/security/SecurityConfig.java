package francoisZANNIER.EAJAVA.gestioncours.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Autowired
    private UserDetailsService uds;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private JwtInterceptor jwtInterceptor;

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(uds);
        authenticationProvider.setPasswordEncoder(encoder);
        return authenticationProvider;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        return http
        .csrf(AbstractHttpConfigurer::disable)
        .sessionManagement(httpSecuritySessionManagementConfigurer ->
                httpSecuritySessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))                .authorizeHttpRequests(
                a -> a
                        .requestMatchers("/login","/cours/liste","/utilisateur/liste").permitAll()
                        .requestMatchers("/sites","/local/**").hasRole("ADMIN")
                        .anyRequest().authenticated()

        ).addFilterBefore(jwtInterceptor, UsernamePasswordAuthenticationFilter.class)
         .build();
    }
}
