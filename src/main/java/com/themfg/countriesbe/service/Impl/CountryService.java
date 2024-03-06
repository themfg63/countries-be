package com.themfg.countriesbe.service.Impl;

import com.themfg.countriesbe.entity.Country;
import com.themfg.countriesbe.exception.CountryAlreadyExistsException;
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

    @Override
    public Country insertCountry(Country country){
        //ülke kodu kontrolü
        Country existingCountry = countryRepository.findByCode(country.getCode()).orElseThrow(()-> new CountryAlreadyExistsException("Bu koda sahip bir ülke daha önce eklenmiştir! "));
    }
}

/*
git status -> yapılan değişikleri gösterir
git add . -> bütün değişikler eklenir eklenen yenilikler görülmez
git add * -> bütün değişikleri ekler ve eklenen şeyleri görürüz
tekrar git status
git branch -> hangi branchlerin olduğunu gösterir
git branch -D "branch adı" -> branch silmek için kullanılır
git checkout -b ders4 main -> yeni bir branch oluşturmak için kullanılır. (main dalında ders4 adlı yeni bir branch)
git commit -m "istenilen mesaj" -> githuba commit etme işlemi (tırnak içerisine istenilen mesaj yazılacak)
git push -> githuba gönderme
git push -u origin ders4 -> ders4 isimli bir branch oluştur ve bu yapılan değişikliklerin tamamını o branche yolla
 */