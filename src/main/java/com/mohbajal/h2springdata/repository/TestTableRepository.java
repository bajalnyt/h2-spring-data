package com.mohbajal.h2springdata.repository;

import com.mohbajal.h2springdata.model.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Long> {


    List<TestTable> findAllByOrderByPriorityAsc();
}
