package by.shcherbakov.net.javacode.config;

import by.shcherbakov.net.javacode.country.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    @Autowired
    private ProductService service;
}