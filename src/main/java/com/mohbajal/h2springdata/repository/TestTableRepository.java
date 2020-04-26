package com.mohbajal.h2springdata.repository;

import com.mohbajal.h2springdata.controllers.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Long> {

}
