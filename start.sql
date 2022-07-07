CREATE TYPE Student (
    student_name text,
    student_address text,
    student_grade int
);

CREATE TABLE Students (
    student_id PRIMARY KEY,
    student_info set<frozen<Student>>,
    average_of_class int
);