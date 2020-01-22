package com.rangamgari.limitService.domain;

public class LimitConfiguration {
  private int minimum;
  private int maximum;

  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }

  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }

  public LimitConfiguration(int min, int max) {
    this.maximum = max;
    this.minimum = min;
  }
}
