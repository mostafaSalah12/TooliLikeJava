package com.algorithmz.tooli.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.algorithmz.tooli.model.ObjectViewings;

/**
 * Created by Mostafa Salah 
 */
public interface ObjectViewingRepository extends MongoRepository<ObjectViewings, String> {

    public List<ObjectViewings> findByObjectIdAndObjectTypeId_ObjectTypeIdAndActingUserId_UserId(String objectId, Short objectType, long userId);

    public long countByObjectIdAndObjectTypeId_ObjectTypeId(String objectId, Short objectType);

}
