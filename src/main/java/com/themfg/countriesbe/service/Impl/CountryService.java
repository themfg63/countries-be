package com.themfg.countriesbe.service.Impl;

import com.themfg.countriesbe.entity.Country;
import com.themfg.countriesbe.initializer.CountryInitializer;
import com.themfg.countriesbe.repository.CountryRepository;
import com.themfg.countriesbe.service.Interface.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public List<Country> insertCountries(){
        return countryRepository.saveAll(CountryInitializer.readCountries());
    }
}
