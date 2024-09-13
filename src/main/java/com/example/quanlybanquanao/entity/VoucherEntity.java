package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "voucher")
public class VoucherEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "title")
    String title;

    @Column(name = "start_date")
    LocalDateTime startDate;

    @Column(name = "end_date")
    LocalDateTime endDate;

    @Column(name = "value")
    Integer value;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "create_at")
    LocalDateTime createAt;

    @Column(name = "update_at")
    LocalDateTime updateAt;

    @Column(name = "create_by")
    String createBy;

    @Column(name = "update_by")
    String updateBy;

    @PreUpdate
    protected void onUpdate() {updateAt = LocalDateTime.now();}
}
