package com.rangamgari.currencyConversionService.controller;

import com.rangamgari.currencyConversionService.domain.CurrencyConversionBean;
import com.rangamgari.currencyConversionService.proxy.CurrencyExchangeServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {
  @Autowired private Environment env;

  @Autowired private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

  @GetMapping("currency-conversion/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean convertCurrency(
      @PathVariable String from, @PathVariable String to, @PathVariable String quantity) {
    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("from", from);
    uriVariables.put("to", to);
    ResponseEntity<CurrencyConversionBean> responseEntity =
        new RestTemplate()
            .getForEntity(
                "http://localhost:8001/currency-exchange/{from}/to/{to}",
                CurrencyConversionBean.class,
                uriVariables);
    CurrencyConversionBean currencyConversionBean = responseEntity.getBody();
    System.out.println(responseEntity.getBody().getConversionMultiple());
    return new CurrencyConversionBean(
        currencyConversionBean.getId(),
        from,
        to,
        currencyConversionBean.getConversionMultiple(),
        Long.parseLong(quantity),
        Long.parseLong(env.getProperty("local.server.port")));
  }

  @GetMapping("currency-conversion-feign/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean convertCurrencyFeign(
      @PathVariable String from, @PathVariable String to, @PathVariable String quantity) {

    CurrencyConversionBean currencyConversionBean =
        currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
    System.out.println(currencyConversionBean.getConversionMultiple());
    return new CurrencyConversionBean(
        currencyConversionBean.getId(),
        from,
        to,
        currencyConversionBean.getConversionMultiple(),
        Long.parseLong(quantity),
        Long.parseLong(env.getProperty("local.server.port")));
  }
}
