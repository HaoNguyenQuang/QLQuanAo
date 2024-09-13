package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IColorRepository extends JpaRepository<ColorEntity, String> {
}
