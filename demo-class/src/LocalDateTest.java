import java.time.LocalDate;

public class LocalDateTest {

  int year ;
  int month;
  int day;
  //constructor
  public LocalDateTest (int year, int month, int day){
    this.year =year ;
    this.month =month;
    this.day=day;
  }
  public static LocalDateTest of (int year,int month,int day){
    return new LocalDateTest(year, month, day);
  }
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2023,12,23);//不用理年月日點save
    System.out.println(date.getMonth());//DECEMBER
    System.out.println(date.getDayOfWeek());//SUNDAY
    
    

    LocalDate date2= LocalDate.of(2024,2,27);
    //System.out.println(date2.isAfter(date));//True

    LocalDateTest date3 = LocalDateTest.of(2024, 1, 3);
    System.out.println(date3.isBetweemn(date, date2));

    System.out.println(date.compareTo(date2)==-1);//True
    System.out.println(date2.compareTo(date)==1);//True
    System.out.println(LocalDate.now());//print today

    LocalDate date4 = LocalDate.parse("2022-10-01");
    System.out.println(date4);//same as date4.toString(), 會自動轉toString
    System.out.println(date4.getYear());

  }
  
  public boolean isBetweemn(LocalDate date1, LocalDate date2) {
    //isAfter, isBefore
    //this.year ; this.month ; this.day
    LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);//**
    if (date1.isEqual(thisDate) || date2.isEqual(thisDate))//唔包相關日子, 要tickout
      return true;
    if (date2.isAfter(thisDate) && date1.isBefore(thisDate))
      return true;
    return false;

  }
}
