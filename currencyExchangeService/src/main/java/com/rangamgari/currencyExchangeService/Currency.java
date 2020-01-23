package com.rangamgari.currencyExchangeService;

public class Currency {
  private int id;
  private String from;
  private String to;
  private int converstionMultiple;
  private int port;

  public Currency(String from, String to, int converstionMultiple, int port, int id) {
    this.from = from;
    this.to = to;
    this.converstionMultiple = converstionMultiple;
    this.port = port;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public int getConverstionMultiple() {
    return converstionMultiple;
  }

  public void setConverstionMultiple(int converstionMultiple) {
    this.converstionMultiple = converstionMultiple;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }
}
