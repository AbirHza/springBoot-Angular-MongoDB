package tn.education.angularspringbootapplication.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.education.angularspringbootapplication.entities.Role;

public interface RoleRepository extends MongoRepository<Role,String> {
}
