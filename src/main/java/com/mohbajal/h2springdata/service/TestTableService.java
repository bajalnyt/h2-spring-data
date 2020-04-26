package com.mohbajal.h2springdata.service;

import com.mohbajal.h2springdata.controllers.TestTable;
import com.mohbajal.h2springdata.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestTableService {

    @Autowired
    TestTableRepository testTableRepository;

    public List<TestTable> getAllData() {
        return testTableRepository.findAll();
    }

    public void updateData(TestTable tt, TestTable updatedTestTable) {
        tt.setPriority(updatedTestTable.getPriority());
        testTableRepository.save(tt);
    }

    public TestTable getTestTable(Long testTableId) {
        Optional<TestTable> optEmp = testTableRepository.findById(testTableId);
        return optEmp.orElse(null);
    }
}
