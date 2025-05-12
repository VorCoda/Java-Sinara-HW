package com.example.Sinara.Security;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/public/api")
    public StatusDto publicApi() {
        return new StatusDto("Welcome");
    }

    @RolesAllowed("ADMIN")
    @GetMapping("/admin/api")
    public UserDto adminApi(Authentication authentication) {
        return new UserDto(authentication.getName(), authentication.getAuthorities().toString());
    }

    @RolesAllowed("SUPPORT")
    @GetMapping("/support/api")
    public UserDto supportApi(Authentication authentication) {
        return new UserDto(authentication.getName(), authentication.getAuthorities().toString());
    }
}
