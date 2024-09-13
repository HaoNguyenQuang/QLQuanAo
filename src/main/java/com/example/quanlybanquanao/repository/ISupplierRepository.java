package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierRepository extends JpaRepository<SupplierEntity, String> {
}
