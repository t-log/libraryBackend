package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String homeLibraryPage(){return "Home Library Page";}

    @PostMapping("/add")
    public String addLibraryPage(){return "Add Library Page";}

    @PostMapping("/search")
    public String searchLibraryPage(){return "Search Library Page";}



}
