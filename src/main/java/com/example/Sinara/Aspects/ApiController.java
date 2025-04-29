package com.example.Sinara.Aspects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class ApiController {

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable Integer userId) {
        return new UserDTO(userId);
    }

}
