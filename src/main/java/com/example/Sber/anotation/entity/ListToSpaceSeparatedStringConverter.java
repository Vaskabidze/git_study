package com.example.Sber.anotation.entity;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToSpaceSeparatedStringConverter implements AttributeConverter<List<String>, String> {
    private final static String SPACE = " ";

    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        if (CollectionUtils.isEmpty(attribute)) {
            return "";
        }
        return String.join(SPACE, attribute);
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (!StringUtils.hasText(dbData)) {
            return Collections.emptyList();
        }
        return Stream.of(dbData.split(SPACE)).filter(s -> !s.isBlank()).map(String::trim).collect(Collectors.toList());
    }
}
