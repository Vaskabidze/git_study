package com.example.Sber.anotation.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "sber_id_base")
public class SberIdBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String sberName;

    @Column(name = "sber_family_name", nullable = false, length = 2)
    private String sberFamilyName;

    @NotEmpty
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Convert(converter = ListToSpaceSeparatedStringConverter.class)
    private List<String> scope;

    private Long age;

    private Boolean active;
}
