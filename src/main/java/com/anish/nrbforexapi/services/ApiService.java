package com.anish.nrbforexapi.services;

import com.anish.nrbforexapi.model.ApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiService {
    private final WebClient webClient;

    public ApiService() {
        this.webClient = WebClient.builder().baseUrl("https://www.nrb.org.np/api/forex/v1/").build();
    }

    public Mono<ApiResponse> callExternalApi(String from, String to) {

        System.out.println("callExternalApi() method called");
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/rates")
                        .queryParam("per_page", 99)
                        .queryParam("page", 1)
                        .queryParam("from", from)
                        .queryParam("to", to)
                        .build())
                .retrieve()
                .bodyToMono(ApiResponse.class);
    }
}
