package com.mohbajal.h2springdata.controllers;

import com.mohbajal.h2springdata.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private TestTableService testTableService;

    @GetMapping("/all")
    List<TestTable> getData() {
        return testTableService.getAllData();
    }

    @PutMapping("/update/{testTableId}")
    public void updateEmployee(@RequestBody TestTable updatedTestTable,
                               @PathVariable(name="testTableId")Long testTableId) {
        TestTable tt = testTableService.getTestTable(testTableId);
        if (tt != null) {
            testTableService.updateData(tt, updatedTestTable);
        }
    }

}
