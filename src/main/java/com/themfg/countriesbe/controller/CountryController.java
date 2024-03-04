package com.themfg.countriesbe.controller;

import com.themfg.countriesbe.entity.Country;
import com.themfg.countriesbe.service.Interface.ICountryService;
import com.themfg.countriesbe.util.constants.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Api.Country.BASE_URL)
@RequiredArgsConstructor
public class CountryController {

    private final ICountryService countryService;
    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping(Api.Country.INSERT_ALL)
    public List<Country> insertCountries(){
        return countryService.insertCountries();
    }



}
