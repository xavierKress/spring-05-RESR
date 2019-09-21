package com.demospring.xavierkress.spring_initializr.controllers;

import com.demospring.xavierkress.spring_initializr.repositories.BookRepository;
import com.demospring.xavierkress.spring_initializr.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publisher")
    public String getBooks(Model model){
        model.addAttribute("publishers", publisherRepository.findAll());

        return "publisher";
    }
}
