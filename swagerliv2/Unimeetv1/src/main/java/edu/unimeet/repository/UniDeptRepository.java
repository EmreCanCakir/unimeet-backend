package edu.unimeet.repository;

import edu.unimeet.entities.UniDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniDeptRepository extends JpaRepository<UniDept, Integer> {

}
