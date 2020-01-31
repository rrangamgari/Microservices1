package com.rangamgari.currencyConversionService.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface LotteryCheck {
  /**
   * @param lotteryGameDay - integer that identifies the game
   * @param numbers - customer supplied numbers to check. Let's assume we have 5 winning numbers per
   *     game.
   * @return true if customer is a winner, false otherwise
   */
  public boolean checkLotteryResult(Integer lotteryGameDay, Integer... numbers);
}

public class Test implements LotteryCheck {
  /**
   * @param lotteryGameDay - integer that identifies the game
   * @param numbers - customer supplied numbers to check. Let's assume we have 5 winning numbers per
   *     game.
   * @return true if customer is a winner, false otherwise
   */
  private Map<Integer, List<Integer>> getSampleData() {
    HashMap<Integer, List<Integer>> hm = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(9);
    list.add(15);
    list.add(17);
    list.add(19);
    hm.put(5, list);
    return hm;
  }

  @Override
  public boolean checkLotteryResult(Integer lotteryGameDay, Integer[] numbers) {
    List<Integer> list = getSampleData().get(lotteryGameDay);
    int tempVal = 0;
    for (Integer i : list) {
      for (int k = 0; k < numbers.length; k++) {
        if (i == numbers[k]) {
          tempVal++;
        }
      }
    }
    if (tempVal == numbers.length) {
      return true;
    }
    return false;
  }
  public static void main(String[] args){
      Test t = new Test();
      Integer[] nuIntegers= new Integer[5];
      nuIntegers[0]=3;
      nuIntegers[1]=9;
      nuIntegers[2]=15;
      nuIntegers[3]=17;
      nuIntegers[4]=19;
       System.out.println(t.checkLotteryResult(5,nuIntegers));

  }
}
