package com.bootcamp.javacode.model;

public class RealCalculator {

  private Calculators calculators;

  public RealCalculator(){
    this.calculators = new Calculators();
  }
  //dependency injection
  public RealCalculator(Calculators calculators){
    this.calculators = calculators;
  }
  
  //Unit Test : From calculate() method perspective, 
  //we dont need to know what exactly add() method performs
  //method B call Method A -> 因為method A 已經test 左無問題, 所以我唔使關心method A 
  //When P = 10, and assume add(p,p/2) return 2, then calculate() return
  public  int calculate(int p) {// UNIT
    return calculators.addition(p,p/2) + p+4;
  }

  public int sleep(int second){
    int result = calculators.addition(second, second / 2);

    for (int i=0; i<5; i++){ // 0 -4 
      result += i*2;
      // 0*2 + 1*2 + 2*2 + 3*2 + 4*2 = 36
    }
    return  result;
  }
  
}
