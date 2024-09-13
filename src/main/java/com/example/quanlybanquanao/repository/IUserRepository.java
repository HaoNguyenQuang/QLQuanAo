package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, String > {
}
