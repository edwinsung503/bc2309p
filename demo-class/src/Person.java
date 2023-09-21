public class Person {
  //點樣形容一件事
  int age;

  char gender;//"M" or "F"

  String firstName;

  String lastName;

  int hkid;

  public void setAge(int age){
    this.age = age ;
  }
  public boolean isElderly(){
    if (this.age > 65) {
      return true;
    }
    return false;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }

  public boolean isMale() {
    if (this.gender == 'M') {
      return true;
    }
    return false;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String fullName () {
    return this.firstName+" "+ this.lastName;
  }

  //static method
  public static void main(String[] args) {
    Book book1 = new Book();//book1 is an object
    //-> variable book
    book1.setAuthor("John");
    book1.setNoOfPages(12);
    System.out.println(book1.getAuthor());//John//波問我拎野
    System.out.println(book1.getNoOfPages());//12
    Book book2 = new Book();//book2 is another object
    System.out.println(book2.getAuthor());//無Set, default value: null
    System.out.println(book2.getNoOfPages());//無Set, default value: 0
    //first set author -> this author = String (方便之後引用)
    //Set the object - > book
    //set getauthor -> return this author
    //放個author 入去object
    //ask to get Author -> print

    //object 內的value 可以唔initialize


    Person person = new Person ();
    person.setAge(66);
    System.out.println(person.isElderly());//true
    person.setGender('M');
    System.out.println(person.isMale());//false

    if (person.isElderly()&& !person.isMale()) {
      System.out.println("this is female erderly");//描述緊大過65 係女性的長者- > 寫一個文章- > 易俾人睇
    }
    //身高體重< 要儲data(state), BMI < 用method 去做

    // exe 做個class, 用main call 下佢
    //moblie phone -> color, size, 

    //get , set, new an object, static vs instance method 分別

    System.out.println(book1.toString());//author= john, ofNopages=12
  }
}
