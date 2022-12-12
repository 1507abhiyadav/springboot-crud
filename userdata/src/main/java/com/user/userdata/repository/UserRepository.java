package com.user.userdata.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.userdata.model.UserEO;


@Repository
public interface UserRepository extends MongoRepository < UserEO,String> {

	List<UserEO> objectId(String objectId);

	UserEO getByObjectId(String objectId); 
}
