package com.example.Sber.valueLombok.controller;

import com.example.Sber.valueLombok.entity.LombokEntity;
import com.example.Sber.valueLombok.service.LombokService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LombokController {
    private final LombokService lombokService;

    @GetMapping("/getLombok")
    public LombokEntity getLombokEntity(){
        return lombokService.getLombokEntity();
    }

}
