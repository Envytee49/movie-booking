package com.example.mbs.repositories.city;

import com.example.mbs.models.city.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
