package com.example.Sber.anotation.controller;

import com.example.Sber.anotation.entity.SberIdBase;
import com.example.Sber.anotation.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findAll")
    public List<SberIdBase> findAll() {
        return baseService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        baseService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Success");
    }
}
