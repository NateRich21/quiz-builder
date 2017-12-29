package org.launchcode.quizbuilder.controllers;


import org.launchcode.quizbuilder.models.QuestionInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("builder")
public class BuilderController {

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String dipslayAddForm(Model model) {
        model.addAttribute("title", "Build a Quiz");
        return "builder/add-q-form";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processAddForm(@ModelAttribute @Valid QuestionInterface newQuestion,
                                 @RequestParam String qType) {
        `
    }
}
