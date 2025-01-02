package com.src.main.currencyconversionserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionResource {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/qty/{qty}")
    public CurrencyConversion currencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable int qty) {
        return new CurrencyConversion(from,to,qty,10, 10*qty,"100000".toString());
    }
}
