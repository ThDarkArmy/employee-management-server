package tda.darkarmy.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.employeemanagementsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
