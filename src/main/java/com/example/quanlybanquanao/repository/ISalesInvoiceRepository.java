package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.SalesInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalesInvoiceRepository extends JpaRepository<SalesInvoiceEntity, String> {
}
