package com.demospring.xavierkress.spring_initializr.controllers;

import com.demospring.xavierkress.spring_initializr.repositories.PublisherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping("/publisher")
    public ResponseEntity getPublishers(Model model){
        model.addAttribute("books", publisherRepository.findAll());
        return new ResponseEntity(publisherRepository.findAll(), HttpStatus.OK);
    }
}
