package com.example.Sber.anotation.controller;

import com.example.Sber.anotation.service.BaseService;
import com.example.Sber.anotation.entity.SberIdBase;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BaseController {

    private final BaseService baseService;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "ok";
    }

    @PostMapping("/save")
    public Long saveSberIdBase(@RequestBody @Validated SberIdBase sberIdBase) {
        return baseService.saveSberIdBase(sberIdBase);
    }

    @GetMapping("/{id}")
    public SberIdBase findById(@PathVariable Long id) {
        return baseService.findById(id);
    }


}
