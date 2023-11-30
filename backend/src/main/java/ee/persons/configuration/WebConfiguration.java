package ee.persons.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.security.web.SecurityFilterChain;
import java.util.Collections;

import static ee.persons.common.Constants.PATTERN_CORS;
import static ee.persons.common.Constants.SYMBOL_ASTERISK;

@Configuration
public class WebConfiguration {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Collections.singletonList(SYMBOL_ASTERISK));
        configuration.setAllowedMethods(Collections.singletonList(SYMBOL_ASTERISK));
        configuration.setAllowedHeaders(Collections.singletonList(SYMBOL_ASTERISK));
        configuration.setAllowCredentials(false);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(PATTERN_CORS, configuration);
        return source;
    }
}