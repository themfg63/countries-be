package com.themfg.countriesbe.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table
@Getter
@Setter
@Builder        //halihazırda içerisinde bulunduğu sınıfın bütün değişkenlerini builder framework'ü ile kurgulayıp geri döndürülmesini sağlar
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long id;

    @Column(unique = true)
    private String code;
    private String name;
    private String nativeName;
    private int phone;
    private String capital;
    private String continent;
    private String currency;
    private String language;
    private String flag;


    //private List<Language> languages;
}
