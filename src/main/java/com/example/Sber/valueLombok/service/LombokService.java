package com.example.Sber.valueLombok.service;

import com.example.Sber.valueLombok.entity.Gender;
import com.example.Sber.valueLombok.entity.LombokEntity;
import org.springframework.stereotype.Service;

@Service
public class LombokService {

    public LombokEntity getLombokEntity() {
        return LombokEntity.builder()
                .id(2L)
                .name("Test")
                .gender(Gender.MAN)
                .age(22L)
                .active(false)
                .build();
    }
}
