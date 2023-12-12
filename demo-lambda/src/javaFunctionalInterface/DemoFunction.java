package javaFunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) {
      //<T,R>
      //R apply(T t);R 同T可以一樣或唔同
      //R 入, T 出
      //R-> String / T -> Integer
      //Integer convert to Integer?? OK

      //R apply(T t)
      Function<Integer, String> convertFunction = x -> {
        return String.valueOf(x);
      }; 
      System.out.println(convertFunction.apply(10));

      //R apply (T t, U u)
      BiFunction<String, String,String> concat = (s1,s2) -> {
        return s1.concat(s2);
      };
      System.out.println(concat.apply("Hello"," World"));

      //Example
      Map<String, Integer> nameLengthMap = new HashMap<>();
      nameLengthMap.put("John", 10);
      nameLengthMap.put("Mary", 1000);
      System.out.println(nameLengthMap.get("Tommy"));//null
      //mappingFunction -> computeIfAbsent
      //"Tommy" -> s ->s.length() -> 5
      System.out.println(nameLengthMap.computeIfAbsent("Tommy", s -> s.length() ));//5

      System.out.println(nameLengthMap.size());//3 -> 有put "Tommy" 入去nameLengthMap
      //學lambda 係因為要識用function -> 先可以用到其他的Function

      //寫formula的方式

      System.out.println(nameLengthMap.computeIfAbsent("Mary", s -> s.length() ));//1000

      System.out.println(nameLengthMap.get("Mary"));

      //Merge
      //find old value of Mary -> 1000 ->v1
      //new value 4 -> v2
      nameLengthMap.merge("Mary", 4, (v1, v2) -> v1*v2) ; //1000 * 4

      System.out.println(nameLengthMap.get("Mary"));//4000
      //if no old value 
      nameLengthMap.merge("Jenny", 7, (v1,v2)-> v1*v2);
      System.out.println(nameLengthMap.get("Jennyy"));//7




  } 
  
}
