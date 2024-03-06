package com.themfg.countriesbe.service.Interface;

import com.themfg.countriesbe.entity.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountries();
    List<Country> insertCountries();

    Country insertCountry(Country country);
}
