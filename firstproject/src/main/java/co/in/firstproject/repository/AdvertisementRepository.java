package co.in.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.in.firstproject.entity.Advertisement;

@Repository  
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {}

