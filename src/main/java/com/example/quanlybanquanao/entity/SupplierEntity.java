package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "supplier")
public class SupplierEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "name")
    String name;

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
