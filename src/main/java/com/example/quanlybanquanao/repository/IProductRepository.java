package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductEntity, String> {
}
