package com.rangamgari.currencyExchangeService.controller;

import com.rangamgari.currencyExchangeService.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
  @Autowired private Environment environment;

  @GetMapping("/currency-exchange/{from}/to/{to}")
  public Currency convertCurrencyStr(
      @PathVariable("from") String from, @PathVariable("to") String to) {
    System.out.println(from);
    return new Currency(from, to, 70L, Long.parseLong(environment.getProperty("local.server.port")), 1900L);
  }
}
