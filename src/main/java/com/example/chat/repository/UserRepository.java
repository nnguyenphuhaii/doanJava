/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.chat.repository;

/**
 *
 * @author ZeikoNguyen
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.chat.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
