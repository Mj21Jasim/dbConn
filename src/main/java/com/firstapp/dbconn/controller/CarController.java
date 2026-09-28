package com.firstapp.dbconn.controller;


import com.firstapp.dbconn.dto.*;
import com.firstapp.dbconn.service.CarService;
import com.firstapp.dbconn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarController {


    @Autowired
    CarService carService;

    @PostMapping("/add")
    Car addCar(@RequestBody Car car){
        return carService.addCar(car);


    }



    @PostMapping("/takeOrder")
    Response processOrder(@RequestBody AllProductRequest allProductRequest){


        for(ProductRequest pr: allProductRequest.getAllProducts()){
            System.out.println("productid: "+ pr.getProductId());
            System.out.println("Quantity: "+ pr.getQuantity());
        }


        return null;
    }

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    Products addProduct(@RequestBody Products products){
        return productService.addProduct(products);

    }

}


