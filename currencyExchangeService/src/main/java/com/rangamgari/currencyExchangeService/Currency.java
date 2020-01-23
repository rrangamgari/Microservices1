package com.rangamgari.currencyExchangeService;

import java.io.Serializable;

public class Currency implements Serializable {
  private Long id;
  private String from;
  private String to;
  private Long conversionMultiple;
  private Long port;

  public Currency(String from, String to, Long conversionMultiple, Long port, Long id) {
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.port = port;
    this.id = id;
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

  public void setConversionMultiple(Long conversationMultiple) {
    this.conversionMultiple = conversationMultiple;
  }

  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }
}
