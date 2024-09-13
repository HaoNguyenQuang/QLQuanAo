package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.VoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVoucherRepository extends JpaRepository<VoucherEntity, String > {
}
