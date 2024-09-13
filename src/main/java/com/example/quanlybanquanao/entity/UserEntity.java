package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "fullname")
    String fullname;

    @Column(name = "date_of_birth")
    LocalDateTime dateOfBirth;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "address")
    String address;

    @Column(name = "username")
    String username;

    @Column(name = "avatar")
    String avatar;

    @Column(name = "gender")
    Integer gender;

    @Column(name = "email")
    String email;

    @Column(name = "active")
    Boolean active = true;

    @Column(name = "deleted")
    Boolean deleted = Boolean.FALSE;

    @Column(name = "password_hash")
    String passwordHash;

    @Column(name = "role_id")
    String roleId;

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
