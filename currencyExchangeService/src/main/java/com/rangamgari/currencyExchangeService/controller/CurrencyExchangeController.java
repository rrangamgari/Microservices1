package com.rangamgari.currencyExchangeService.controller;

import com.rangamgari.currencyExchangeService.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CurrencyExchangeController {


  @GetMapping("/currency-exchange-service/{from}/to/{to}")
  public Currency convertCurrencyStr(@PathVariable("from") String from, @PathVariable("to") String to) {
    System.out.println(from);
    return new Currency(from, to);
  }
}
