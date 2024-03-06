package com.themfg.countriesbe.repository;

import com.themfg.countriesbe.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
    Optional<Country> findByCode(String code);
}
