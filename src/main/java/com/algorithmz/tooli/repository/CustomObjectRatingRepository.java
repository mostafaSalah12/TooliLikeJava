package com.algorithmz.tooli.repository;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import com.algorithmz.tooli.model.ObjectRatings;


public class CustomObjectRatingRepository {

	@Autowired
	private  MongoOperations operations;
	
	
	
	public Double getInvoiceFor(String objectId, Short objectType) {

		AggregationResults<Double> results = operations.aggregate(newAggregation(ObjectRatings.class, //
				match(where("rating.objectId").is(objectId).and("rating.objectTypeId.objectTypeId").is("objectTypeId")), //
				group(new String[] {null}) //
				
						.avg("rating.rating").as("avgRating")
						), Double.class);

		return results.getUniqueMappedResult();
	}

	
	
	
}
