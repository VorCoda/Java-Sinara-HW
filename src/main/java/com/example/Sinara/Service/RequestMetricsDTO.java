package com.example.Sinara.Service;

public class RequestMetricsDTO {
    private long totalRequests;
    private double averageTimeMs;


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



    @Override
    public String toString() {
        return "RequestMetricsDTO{" +
                "totalRequests=" + totalRequests +
                ", averageTimeMs=" + averageTimeMs +
                '}';
    }
}
