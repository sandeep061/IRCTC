package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Product;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
	@PostMapping("/save")
   public ResponseEntity<Product> getProduct(@RequestBody Product prod) {
	   return new ResponseEntity<Product>(prod,HttpStatus.CREATED);
   }
}
