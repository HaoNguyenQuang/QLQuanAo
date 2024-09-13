package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.PurchaseInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseInvoiceRepository extends JpaRepository<PurchaseInvoiceEntity, String> {
}
