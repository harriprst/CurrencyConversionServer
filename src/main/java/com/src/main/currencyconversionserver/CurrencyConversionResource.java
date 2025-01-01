package com.src.main.currencyconversionserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionResource {

    @GetMapping("/currency-conversion")
    public String currencyConversion() {
        return "Currency Conversion Server is running";
    }
}
