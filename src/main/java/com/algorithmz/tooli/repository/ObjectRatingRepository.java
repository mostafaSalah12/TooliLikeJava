package com.algorithmz.tooli.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.ObjectRatings;


/**
 * Created by Mostafa Salah.
 */
@Repository
public interface ObjectRatingRepository extends MongoRepository<ObjectRatings, String> {

	 
    public ObjectRatings findByObjectIdAndObjectTypeId_ObjectTypeIdAndUserId_UserId(String objectId, String objectType, String userId);

    public long countByObjectIdAndObjectTypeId_ObjectTypeId(String objectId, Short objectType);

    @Query("db.test.aggregate([ {'$match' : {$and: [{'rating.objectId': {'$eq': :objectId}}, {'rating.objectTypeId.objectTypeId' : {'$eq' : :objectTypeId}}]}}, {'$group':{'_id': null, 'avg_raating': {'$avg': '$rating.rating'}}}]) ")
    public Double getAverageRatingByObjectId(@Param(value = "objectId") String objectId, @Param(value = "objectTypeId") Short objectTypeId);


    
    
    
//  @Query("SELECT avg (rating.rating) FROM ObjectRatings rating WHERE  rating.objectId = :objectId AND rating.objectTypeId.objectTypeId = :objectTypeId")

    
   /*  @Query("SELECT avg (rating.rating) FROM ObjectRatings rating WHERE  rating.objectId = :objectId AND rating.objectTypeId.objectTypeId = :objectTypeId")
    @Query("db.test.aggregate([ {'$match' : {$and: [{'rating.objectId': {'$eq': :objectId}}, {'rating.objectTypeId.objectTypeId' : {'$eq' : :objectTypeId}}]}}, {'$group':{'_id': null, 'avg_raating': {'$avg': '$rating.rating'}}}]) ")
    public Double getAverageRatingByObjectId(@Param(value = "objectId") String objectId, @Param(value = "objectTypeId") Short objectTypeId);

    * */ 
    
    
    
 /*
  db.domain.aggregate(
    {
	$match : {_id:{$lt:10}}
    },
    { 
	$group : {_id : null, total : { $avg : 1 }}
    },
    {
	$sort : {total : -1}
    }
);
  * */   
 
}













