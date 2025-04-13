package com.example.Sinara.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class MethodSecurityConfig {
}
