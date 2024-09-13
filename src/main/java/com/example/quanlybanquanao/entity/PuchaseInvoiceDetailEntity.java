package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "category")
public class PuchaseInvoiceDetailEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "product_detail_id")
    String productDetailId;

    @Column(name = "purchase_invoice_id")
    String purchaseInvoiceId;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "amount")
    Double amount;
}
