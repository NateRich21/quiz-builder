package org.launchcode.quizbuilder.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("builder")
public class BuilderController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Build a Quiz");
        model.addAttribute()


    }

}
