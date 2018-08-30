package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.algorithmz.tooli.model.LookupLikeStatus;

/**
 * Created by Mostafa Salah
 */
public interface LikeStatusRepository extends MongoRepository<LookupLikeStatus, String> {

}
