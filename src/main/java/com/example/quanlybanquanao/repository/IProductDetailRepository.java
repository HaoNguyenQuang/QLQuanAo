package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.ProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDetailRepository extends JpaRepository<ProductDetailEntity, String> {
}
