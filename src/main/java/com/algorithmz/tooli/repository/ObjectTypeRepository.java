package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.LookupObjectTypes;

/**
 * Created byMostafa Salah.
 */
@Repository
public interface ObjectTypeRepository extends MongoRepository<LookupObjectTypes, String> {

}
