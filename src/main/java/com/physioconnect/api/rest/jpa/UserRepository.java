package com.physioconnect.api.rest.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.physioconnect.api.rest.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
