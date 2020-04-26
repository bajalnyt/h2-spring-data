package com.mohbajal.h2springdata.controllers;

import com.mohbajal.h2springdata.model.TestTable;
import com.mohbajal.h2springdata.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestTableMvcController {

    @Autowired
    TestTableService service;

    @RequestMapping("/alldata.html")
    public String getAllEmployees(Model model)
    {
        List<TestTable> list = service.getAllData();

        model.addAttribute("testtables", list);
        return "alldata";
    }
}
