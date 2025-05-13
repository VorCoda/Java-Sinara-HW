package com.example.Sinara.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chocolate")
public class ChocolateController {

    private final ChocolateBuyingService chocolateService;

    public ChocolateController(ChocolateBuyingService chocolateService) {
        this.chocolateService = chocolateService;
    }

    @PostMapping("/buy")
    public BuyChocolateDTO buyChocolate(@RequestParam String type) {
        ChocolateType chocolateType = ChocolateType.valueOf(type.toUpperCase());
        chocolateService.recordPurchase(chocolateType);

        int updatedCount = chocolateService.getPurchaseCounts().get(chocolateType);

        return new BuyChocolateDTO(chocolateType, updatedCount);
    }

    @GetMapping("/stats")
    public List<BuyChocolateDTO> getChocolateStats() {
        return chocolateService.getPurchaseCounts().entrySet().stream()
                .map(entry -> {
                    BuyChocolateDTO dto = new BuyChocolateDTO();
                    dto.setType(entry.getKey());
                    dto.setCount(entry.getValue());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
