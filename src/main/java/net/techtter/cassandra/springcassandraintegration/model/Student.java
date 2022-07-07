package net.techtter.cassandra.springcassandraintegration.model;

import com.datastax.driver.core.DataType;
import com.datastax.driver.mapping.annotations.Frozen;
import lombok.*;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.repository.Query;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

@Table("Cohort")
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    @PrimaryKey
    private int id;

    @Frozen
    @Column
    @CassandraType(type = DataType.Name.UDT, userTypeName = "student_info")
    private  Indv_Student student_info;

    //@Column("student_info")
    //private  Set<Indv_Student> studentDetails;

    @Column("avg_class")
    private int avg_class;

    //@Query(value = "SELECT * FROM Cohort;")
    //private int avgNums;

    public void setAvg_class(int avg_class){
        this.avg_class = avg_class;
    }
}

