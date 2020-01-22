package com.rangamgari.limitService.controller;

import com.rangamgari.limitService.Configuration;
import com.rangamgari.limitService.domain.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

  @Autowired
  private Configuration configuration;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfiguration() {
    return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
  }
}
