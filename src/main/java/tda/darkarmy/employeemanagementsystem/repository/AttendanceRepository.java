package tda.darkarmy.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.employeemanagementsystem.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
