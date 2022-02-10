package wakZoo.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wakZoo.back.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}