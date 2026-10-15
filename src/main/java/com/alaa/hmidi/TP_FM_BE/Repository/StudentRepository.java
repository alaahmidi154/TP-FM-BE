package com.alaa.hmidi.TP_FM_BE.Repository;

import com.alaa.hmidi.TP_FM_BE.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}