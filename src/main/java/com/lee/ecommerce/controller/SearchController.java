package com.lee.ecommerce.controller;

import com.lee.ecommerce.response.MultiProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @PostMapping(value = "/search")
    public ResponseEntity<MultiProductResponse> search() {
        return null;
    }
}
