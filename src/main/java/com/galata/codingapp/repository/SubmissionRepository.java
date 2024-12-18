package com.galata.codingapp.repository;

import com.galata.codingapp.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByUser_UsernameAndTask_Id(String username,Long id);
}
