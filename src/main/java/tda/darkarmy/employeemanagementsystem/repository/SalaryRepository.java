package tda.darkarmy.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.employeemanagementsystem.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
