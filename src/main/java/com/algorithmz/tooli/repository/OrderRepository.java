/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.Orders;

/**
 *
 * @author Mostafa salah
 */
@Repository
public interface OrderRepository extends MongoRepository<Orders, String> {

}
