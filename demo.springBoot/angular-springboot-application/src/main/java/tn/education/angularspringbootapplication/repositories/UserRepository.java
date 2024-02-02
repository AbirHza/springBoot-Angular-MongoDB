package tn.education.angularspringbootapplication.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.education.angularspringbootapplication.entities.User;

public interface UserRepository extends MongoRepository<User,String> {
}
