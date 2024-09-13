package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, String> {
}
