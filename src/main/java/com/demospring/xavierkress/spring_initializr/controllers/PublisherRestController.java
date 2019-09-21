package com.demospring.xavierkress.spring_initializr.controllers;

import com.demospring.xavierkress.spring_initializr.repositories.PublisherRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publisher")
public class PublisherRestController {

    private PublisherRepository publisherRepository;

    public PublisherRestController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Get all publisher")
    public ResponseEntity getPublishers(Model model){
        model.addAttribute("books", publisherRepository.findAll());
        return new ResponseEntity(publisherRepository.findAll(), HttpStatus.OK);
    }
}
