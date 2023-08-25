package id.co.askrindo.simpleriskentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import id.co.askrindo.simpleriskentity.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}
