package lk.ruh.example.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("search")
public class MainController {

    @Autowired
    PhoneResource phoneResource;

    @PostMapping("seachByName")
    public ResponseEntity<Object> serchByName(
            @RequestParam String search
    ) {

        return new ResponseEntity<Object>(phoneResource.search(search), HttpStatus.ACCEPTED);
    }

    @PostMapping("save")
    public ResponseEntity<Object> save(
            @RequestParam String name,
            @RequestParam String brand
    ) {
        return new ResponseEntity<Object>(phoneResource.save(name, brand), HttpStatus.ACCEPTED);
    }
}
