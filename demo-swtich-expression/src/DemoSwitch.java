public class DemoSwitch {
  
  public static void main(String[] args) {
    //mainly for enum
    System.out.println(get(Weekday.WEDNESDAY));//"Wednesday"

  }

  public static String get(Weekday weekday){
    //Switch
    String day = "";
    switch (weekday) {
      case MONDAY:
        day = "Monday";
        break;
      case TUESDAY:
        day = "Tuesday";
        break;
      case WEDNESDAY:
        day = "Wednesday";
        break;
      case THURSDAY:
        day = "Thursday";
        break;
      case FRIDAY:
        day = "Friday";
        break;
      default:
    }
    return day;
  }
  //Similar to Lambda expression
  public static String get2(Weekday weekday){
    //Switch
    return switch (weekday){
      case MONDAY -> "Monday";
      case TUESDAY -> "Tuesday";
      case WEDNESDAY -> "Wednesday";
      case THURSDAY -> "Thursday";
      case FRIDAY-> "Friday";
      case SATURADAY -> "Saturaday";
      case SUNDAY -> "Sunday";
    };
  }
  //yield

  public static String get3(Weekday weekday){
    //Switch
    return switch (weekday){
      case MONDAY:
        yield "Monday";
      case TUESDAY:
        yield "Tuseday";
      case WEDNESDAY:
        yield "Wednesday";
      case THURSDAY:
        yield "Thursday";
      case FRIDAY:
        yield "Friday";
      case SATURADAY:
        yield "Saturaday";
      case SUNDAY:
        yield "Sunday";
    };
  }
}
