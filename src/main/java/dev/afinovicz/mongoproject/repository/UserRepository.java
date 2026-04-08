package dev.afinovicz.mongoproject.repository;

import dev.afinovicz.mongoproject.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
}
