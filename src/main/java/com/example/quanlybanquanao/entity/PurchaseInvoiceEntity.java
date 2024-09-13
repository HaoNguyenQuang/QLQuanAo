package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pucharse_invoice")
public class PurchaseInvoiceEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "staff_id")
    String staffId;

    @Column(name = "supplier_id")
    String supplierId;

    @Column(name = "date_of_entry")
    LocalDateTime dateOfEntry;

    @Column(name = "total")
    Double total;

}
