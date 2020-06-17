package com.example.PractialTestWCD.controller;

import com.example.PractialTestWCD.entity.Product;
import com.example.PractialTestWCD.repository.ProductRepository;
import com.example.PractialTestWCD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class ProductController{
    @Autowired
    ProductRepository productRepository;
    @RequestMapping("/listProduct")
    public  String index(Model model){
        List<Product> product = (List<Product>) productRepository.findAll();
        model.addAttribute("product",product);
        return "/product";
    }
}
