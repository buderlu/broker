package com.example.registration.Repository;



import com.example.registration.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {


        User findByEmail(String email);
}
