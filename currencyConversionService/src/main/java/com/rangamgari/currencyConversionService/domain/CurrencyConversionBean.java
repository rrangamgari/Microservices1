package com.rangamgari.currencyConversionService.domain;

import java.io.Serializable;

public class CurrencyConversionBean implements Serializable {
  private Long id;
  private String from;
  private String to;
  private Long conversionMultiple;
  private Long quantity;
  private Long totalCalculatedAmount;
  private Long port;

  public CurrencyConversionBean() {
    super();
  }

  public CurrencyConversionBean(
      Long id, String from, String to, Long conversionMultiple, Long quantity, Long port) {

    super();
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.port = port;
    this.quantity = quantity;
    if (conversionMultiple != null) this.totalCalculatedAmount = conversionMultiple * quantity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Long getConversionMultiple() {
    return conversionMultiple;
  }

  public void setConversionMultiple(Long conversionMultiple) {
    this.conversionMultiple = conversionMultiple;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Long getTotalCalculatedAmount() {
    return totalCalculatedAmount;
  }

  public void setTotalCalculatedAmount(Long totalCalculatedAmount) {
    this.totalCalculatedAmount = totalCalculatedAmount;
  }

  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }
}
