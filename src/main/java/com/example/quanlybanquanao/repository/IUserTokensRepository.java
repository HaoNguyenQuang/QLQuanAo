package com.example.quanlybanquanao.repository;

import com.example.quanlybanquanao.entity.UserTokensEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserTokensRepository extends JpaRepository<UserTokensEntity, String > {
}
