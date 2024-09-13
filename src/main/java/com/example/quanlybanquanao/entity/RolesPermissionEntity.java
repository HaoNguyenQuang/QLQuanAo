package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "role")
public class RolesPermissionEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "role_id")
    String roleId;

    @Id
    @Column(name = "permission_id")
    String permissionId;

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
