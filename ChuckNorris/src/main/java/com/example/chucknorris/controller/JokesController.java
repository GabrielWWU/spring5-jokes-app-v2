package com.example.chucknorris.controller;

import com.example.chucknorris.service.ChuckNorrisServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final ChuckNorrisServiceImpl chuckNorrisService;

    public JokesController(ChuckNorrisServiceImpl chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model){
        model.addAttribute("joke",chuckNorrisService.getJoke());
        return "index";
    }
}
