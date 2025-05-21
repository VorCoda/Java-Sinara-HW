package com.example.Sinara.Service;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/chocolate")
public class ChocolateController {

    private final ChocolateBuyingService chocolateService;

    public ChocolateController(ChocolateBuyingService chocolateService) {
        this.chocolateService = chocolateService;
    }

    @PostMapping("/buy")
    public BuyStatusDto buyChocolate(@RequestParam String type) {
        ChocolateType chocolateType = ChocolateType.valueOf(type.toUpperCase());


        return new BuyStatusDto("bought", chocolateType);
    }

}
