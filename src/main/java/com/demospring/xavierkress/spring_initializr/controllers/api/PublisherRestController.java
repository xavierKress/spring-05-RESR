package com.demospring.xavierkress.spring_initializr.controllers.api;

import com.demospring.xavierkress.spring_initializr.model.Publisher;
import com.demospring.xavierkress.spring_initializr.repositories.PublisherRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/publishers")
public class PublisherRestController {

    private PublisherRepository publisherRepository;

    public PublisherRestController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping(value="/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Get all publisher")
    public ResponseEntity getPublishers(){
        return new ResponseEntity(publisherRepository.findAll(), HttpStatus.OK);
    }



    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Publisher setPublisher(@RequestBody Publisher newPublisher) {
        System.out.println(newPublisher);
        return publisherRepository.save(newPublisher);
    }

    @DeleteMapping("/{id}")
    void deletePublisher(@PathVariable Long id) {
        publisherRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    Publisher replacePublisher(@RequestBody Publisher newPublisher, @PathVariable Long id) {

        Optional<Publisher> publisher = publisherRepository.findById(id);
        if(publisher.isPresent()) {
            Publisher p = publisher.get();
            p.setName(newPublisher.getName());
            return publisherRepository.save(p);
        }
        return null;
    }

}
