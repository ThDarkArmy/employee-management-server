package tda.darkarmy.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.employeemanagementsystem.model.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
}
