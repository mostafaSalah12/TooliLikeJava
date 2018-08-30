package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.UsersIndividual;

/**
 * Created by Mostafa Salah
 */
@Repository
public interface IndividualUserRepository extends MongoRepository<UsersIndividual, String> {
    
}
