package com.example.Sinara.Service;

import java.util.List;

public class RequestMetricsDTO {
    private long totalRequests;
    private double averageTimeMs;
    private List<BuyChocolateDTO> buyChocolateDTOS;


    public RequestMetricsDTO() {}

    public long getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(long totalRequests) {
        this.totalRequests = totalRequests;
    }

    public double getAverageTimeMs() {
        return averageTimeMs;
    }

    public void setAverageTimeMs(double averageTimeMs) {
        this.averageTimeMs = averageTimeMs;
    }

    public List<BuyChocolateDTO> getBuyChocolateDTOs(){
        return buyChocolateDTOS;
    }

    public void setBuyChocolateDTOS(List<BuyChocolateDTO> elements){
        this.buyChocolateDTOS = elements;
    }




    @Override
    public String toString() {
        return "RequestMetricsDTO{" +
                "totalRequests= " + totalRequests +
                ", averageTimeMs= " + averageTimeMs +
                '}';
    }
}
