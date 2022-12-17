package com.example.Sber.valueLombok.entity;

public enum Gender {
    MAN("Мужик"),
    WOMAN("Не мужик");

    private final String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
