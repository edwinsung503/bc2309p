public class Teacher extends Persons {//teacher > child class
  
  //private String name;

  //private int age;//可被重覆使用的attribute

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.setAge(30);
    teacher.setName("Peter");
    System.out.println(teacher);//有左toString method 係person 就唔使打teacher.toString

    //連teacher 都唔可以teacher.age 因為person Private 左
    //要用set/get - 去拎prviate 的野
    //inherance 只限public 的野, 但private 的野繼承唔到
    //依個program 只有1個object
    //用只可用Public

    System.out.println(teacher.getAge());
    System.out.println(teacher.getName());

    
  }
}
