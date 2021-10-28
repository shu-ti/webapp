package com.example.webapp.repo;
import com.example.webapp.model.User_Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User_Authentication, Integer> {

}
