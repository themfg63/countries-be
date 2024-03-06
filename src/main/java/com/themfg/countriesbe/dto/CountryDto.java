package com.themfg.countriesbe.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {
    private Long id;
    private String code;
    private String name;
    private String nativeName;
    private String capital;
    private String continent;
    private String currency;
    private String language;
    private String flag;
    private int phone;
}
