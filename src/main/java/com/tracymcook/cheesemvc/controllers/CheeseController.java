package com.tracymcook.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese") // this changes the request path to /cheese
public class CheeseController {

    static ArrayList<String> cheeses = new ArrayList<>(); // necessary to make list accessible to our methods

    // Request path: cheese/
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");

        return "cheese/index"; // just the name of the template, not the extension
    }

    // Request path: cheese/add
    @RequestMapping(value = "add", method = RequestMethod.GET) // display of the form
    public String displayAddCheeseForm(Model model) {

        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }

    // Request path: cheese/add
    @RequestMapping(value = "add", method = RequestMethod.POST) // processing of the form
    public String processAddCheeseForm(@RequestParam String cheeseName) { // needs to match name in the form

        cheeses.add(cheeseName);

        // Redirect to cheese/
        return "redirect:";
    }

}
