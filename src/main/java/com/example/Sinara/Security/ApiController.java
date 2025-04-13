package com.example.Sinara.Security;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/public/api")
    public String publicApi() {
        return "This is a public API";
    }

    @RolesAllowed("ROLE_ADMIN")
    @GetMapping("/admin/api")
    public String adminApi(Authentication authentication) {
        return "Admin: " + authentication.getName() +
                ", Role: " + authentication.getAuthorities();
    }

    @RolesAllowed("ROLE_SUPPORT")
    @GetMapping("/support/api")
    public String supportApi(Authentication authentication) {
        return "Support: " + authentication.getName() +
                ", Role: " + authentication.getAuthorities();
    }
}
