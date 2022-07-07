package net.techtter.cassandra.springcassandraintegration.repo;

import net.techtter.cassandra.springcassandraintegration.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface StudentRepository extends CassandraRepository<Student, Integer> {

    @Query("SELECT AVG(student_info.student_grade) FROM Cohort ALLOW FILTERING")
    int AvgFinder();
}


