package com.example.quanlybanquanao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user_tokens")
public class UserTokensEntity {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(generator = "mygen")
    @GenericGenerator(name = "mygen", strategy = "com.example.quanlybanquanao.util.IdGenerator")
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "user_id")
    String userId;

    @Column(name = "token")
    String token;

    @Column(name = "create_at")
    LocalDateTime createAt;

    @Column(name = "expires_at")
    LocalDateTime expiresAt;
}
