package co.in.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.in.firstproject.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {}
