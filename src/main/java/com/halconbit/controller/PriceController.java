package com.halconbit.controller;

import com.halconbit.model.Price;
import com.halconbit.service.implement.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;
    @PostMapping("/save")
    public ResponseEntity savePrice(@RequestBody Price price) {
        System.out.println("LOOK: " + price.getBrand_id()
                + " " + price.getProduct_id()
                + " " + price.getStart_date()
                + " " + price.getPriority()
                + " " + price.getPrice()
                + " " + price.getCurr()
                + " " + price.getEnd_date()
                + " " + price.getPrice_list()
                + " " + price);
        return new ResponseEntity(this.priceService.savePrice(price), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getPrice(@PathVariable("id") Long id) {
        return new ResponseEntity(priceService.getPrice(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updatePrice(@PathVariable("id") Long id, @RequestBody Price price) {
        return new ResponseEntity(priceService.updatePrice(id, price), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePrice(@PathVariable("id") Long id) {
        boolean result = priceService.deletePrice(id);
        if(result) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
