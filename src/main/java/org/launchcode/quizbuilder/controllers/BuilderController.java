package org.launchcode.quizbuilder.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("builder")
public class BuilderController {

    @RequestMapping(value="")
    public String index(Model model) {

    }

}
