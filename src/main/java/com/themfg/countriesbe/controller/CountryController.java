package com.themfg.countriesbe.controller;

import com.themfg.countriesbe.dto.CountryDto;
import com.themfg.countriesbe.entity.Country;
import com.themfg.countriesbe.mapper.ICountryMapper;
import com.themfg.countriesbe.service.Interface.ICountryService;
import com.themfg.countriesbe.util.constants.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Api.Country.BASE_URL)
@RequiredArgsConstructor
public class CountryController {

    private final ICountryService countryService;
    private final ICountryMapper countryMapper;
    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping("/")
    public ResponseEntity<CountryDto> insertCountry(@RequestBody CountryDto countryDto){     //dışarıdan atılan bir post requestinde body olarak CountryDto nesnesi verilmesi gerekir.
      Country mappedCountry = countryMapper.toCountry(countryDto);
      Country country = countryService.insertCountry(mappedCountry);
      return ResponseEntity.ok(countryMapper.fromCountry(country));
    }

    @PostMapping(Api.Country.INSERT_ALL)
    public List<Country> insertCountries(){
        return countryService.insertCountries();
    }


}
