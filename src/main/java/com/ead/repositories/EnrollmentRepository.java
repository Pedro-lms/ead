package com.ead.repositories;

import com.ead.model.Enrollment;
import com.ead.model.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
