package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sales_invoice")
public class SalesInvoiceEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "staff_id")
    String staffId;

    @Column(name = "customer_id")
    String customerId;

    @Column(name = "creation_date")
    LocalDateTime creationDate;

    @Column(name = "notes")
    String notes;

    @Column(name = "qr_code")
    String qrCode;

    @Column(name = "invoice_status")
    String invoiceStatus;

    @Column(name = "payment_status")
    String paymentStatus;

    @Column(name = "payment_method")
    String paymentMethod;

    @Column(name = "total")
    Double total;

    @Column(name = "voucher_id")
    String voucherId;

}
