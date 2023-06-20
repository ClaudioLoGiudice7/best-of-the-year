package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // dice a Spring che questa classe è un Controller
@RequestMapping("/") // a quale rotta rispondono i metodi di questo Controller
public class HomeController {

    @GetMapping() // risponde a richieste di tipo HTTP GET

    public String template(Model model){ // chiediamo a Spring di invocare questo metodo passandogli il Model
        String name = "Claudio";
        model.addAttribute("name", name);
        return "index"; // ritorno il nome del template index.html che si trova nella cartella resources/templates
    }
}