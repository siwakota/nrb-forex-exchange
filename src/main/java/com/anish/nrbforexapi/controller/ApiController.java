package com.anish.nrbforexapi.controller;

import com.anish.nrbforexapi.model.ApiResponse;
import com.anish.nrbforexapi.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

@Controller
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/getRates")
    public String getRates(
            @RequestParam("iso") String iso,
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            Model model) {

        System.out.printf("FromDate: %s & ToDate: %s\n", from, to);
        System.out.println("getRates() method called");
        Mono<ApiResponse> response = apiService.callExternalApi(from, to);
        model.addAttribute("response", response.block());
        model.addAttribute("iso", iso);
        return "result";
    }
}
