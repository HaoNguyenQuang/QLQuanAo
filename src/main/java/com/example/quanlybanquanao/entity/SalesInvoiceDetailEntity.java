package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sales_invoice_detail")
public class SalesInvoiceDetailEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "product_detail_id")
    String productDetailId;

    @Column(name = "sales_invoice_id")
    String salesInvoiceId;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "amount")
    Double amount;

}
