package com.stepupacademy.checkpointspring.controller;

import com.stepupacademy.checkpointspring.entity.Pays;
import com.stepupacademy.checkpointspring.service.PaysService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateUpdateListPaysController
{
    @Autowired
    private PaysService paysService;

    @GetMapping("/lists")
    public String createUpdateListGet(Model model)
    {
        List<Pays> paysList = new ArrayList<>();
        paysList = paysService.findAll();
        model.addAttribute("paysList", paysList);

        return "paysList";
    }
    

}
