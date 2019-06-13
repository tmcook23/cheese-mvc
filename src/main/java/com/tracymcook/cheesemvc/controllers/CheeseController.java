package com.tracymcook.cheesemvc.controllers;

import com.tracymcook.cheesemvc.models.Cheese;
import com.tracymcook.cheesemvc.models.CheeseData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese") // this changes the request path to /cheese
public class CheeseController {



    // Request path: cheese/
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", CheeseData.getAll());
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
    public String processAddCheeseForm(@ModelAttribute Cheese newCheese) { // needs to match name in the form

        /* Code that's being implicitly run by SpringBoot
        *
        * Create a new object using the default constructor:
        * Cheese newCheese = new Cheese();
        *
        * newCheese.setName(Request.getParameter("name"));
        * newCheese.setDescription(Request.getParameter("description"));
        * // this is why the names need to match
        */

        CheeseData.add(newCheese);

        // Redirect to cheese/
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds) {

        for (int cheeseId : cheeseIds) {
            CheeseData.remove(cheeseId);
        }

        return "redirect:";
    }

}
