package com.example.Sber.valueLombok.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class LombokEntity {
    Long id;
    String name;
    Gender gender;
    Long age;
    Boolean active;
}
