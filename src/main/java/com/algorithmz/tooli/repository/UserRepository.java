package com.algorithmz.tooli.repository;

 import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.Users;

/**
 * Created by Mostafa Salah
 */
@Repository
public interface UserRepository extends MongoRepository<Users, String> {

    public Users findByEmail(String email);
}
