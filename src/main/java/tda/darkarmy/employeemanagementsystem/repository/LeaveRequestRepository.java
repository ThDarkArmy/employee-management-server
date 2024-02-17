package tda.darkarmy.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.employeemanagementsystem.model.LeaveRequest;
import tda.darkarmy.employeemanagementsystem.model.User;

import java.util.List;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    List<LeaveRequest> findByUser(User user);
}
