package javaFunctionalInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCompartor {
  
  public static void main(String[] args) {
    //int Compare (T t1, T t2)
    Comparator<Customer> sortByNam = (c1, c2) -> c1.getName().compareTo(c2.getName());
    Comparator<Customer> sortByJoinDate = (c1,c2) -> c1.getJoinDate().isBefore(c2.getJoinDate()) ? 1 : -1;//true-> 1 , false -> -1
    Comparator<Customer> sortByNameAndThenJoinDate = sortByNam.thenComparing(sortByJoinDate);

    Customer s1 = new Customer("John",LocalDate.of(2000, 1, 20));
    Customer s2 = new Customer("Mary",LocalDate.of(2010, 11, 20));
    Customer s3 = new Customer("John",LocalDate.of(2011, 1, 20));
    Customer s4 = new Customer("Jenny",LocalDate.of(2012, 1, 20));
    List<String> customers = new ArrayList<>(List.of(s1,s2,s3,s4));
    Collections.sort(customers, sortByNameAndThenJoinDate);
    System.out.println(customers);




  }
}
