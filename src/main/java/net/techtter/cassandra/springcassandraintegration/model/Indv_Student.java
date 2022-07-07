package net.techtter.cassandra.springcassandraintegration.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import org.springframework.data.cassandra.repository.Query;

@Getter
@Setter
@UserDefinedType("student_info")
public class Indv_Student {
    @Column("student_name")
    private String student_name;
    @Column("student_address")
    private String student_address;
    @Column("student_grade")
    private int student_grade;

    //@Column("avg_grade")
    //public int AvgFinder(avg_value = "studentdetails.student_grade"){};

    //@Query("SELECT AVG(studentdetails.student_grade) FROM Cohort;")
    //private int avg_grade(){return avg_grade();};
}


