package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneSortByPriceAsc implements Comparator<Phone> {

  @Override
  public int compare(Phone o1, Phone o2){
    return o1.getPrice() > o2.getPrice() ? 1:-1;
  }

  public static void main(String[] args) {
    List<Phone> phones = new ArrayList<>(List.of(new Phone("iphone 13",199),new Phone("iphone 15",1199),new Phone("iphone 12",179)));

    Collections.sort(phones,new PhoneSortByPriceAsc());
    System.out.println(phones);
  }

}