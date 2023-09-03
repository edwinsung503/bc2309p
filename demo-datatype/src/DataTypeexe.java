public class DataTypeexe {
 public static void main (String[]args) {
  String boxes = "Hello Edwin";
  System.out.println(boxes);// Hello Edwin
  System.out.println("boxes");//boxes

  String strs;
  boxes = "Wellcome to Camps";
  strs = "Wellcome everyone";
  System.out.println(boxes); // Wellcome to Camps
  System.out.println(strs);//Wellcome everyone

  int x = 12;
  int salaries = 1200;
  x =24;
  System.out.println(x); //24
  x = x +10;
  System.out.println(x);//34

  x = x - 4;
  System.out.println(x);//30

  salaries = salaries + x ;
  System.out.println(salaries);//1230

  int z = salaries / 3 ;
  System.out.println(z); //410

  int k = z * 4;
  System.out.println(k); //1640

  int sum = x + salaries + z + k;
  System.out.println(sum); // 30 + 1200 + 410 + 1640 = 3280

  int result = sum + 100 / 4 ; // 845
  System.out.println(result);

  int j = 1 ; 
  j = j + 2;
  j +=2;
  j++ ;
  ++j ;
  System.out.println(j); // 7

  String surname = "Edwin";
  surname = surname + " Sung";
  System.out.println(surname);// Edwin Sung

  String surnames = "Edward";
  String lastnames = "Chan";

  String name = surnames + lastnames;
  System.out.println(name);// Edward Chan
  System.out.println("name: " + name);// name: Edward Chan

  double d = 0.45;
  d = 4.134; // 4.134
  d = d + 0.2 - 0.12 * 3 ;
  System.out.println(d);//4.294

  double d2 = 5;
  System.out.println(d2);// 5.0

  boolean a = false;
  boolean isLeft = true;
  System.out.println(a+" is "+isLeft);// false is true

  char t = 'j';
  char o = '@';
  System.out.println(t+" with "+ o);// j with @

  short sh1 = 1290;
  int r2 = sh1 + 1203 ;//2493

  long l1 = 120000;
  l1 -= 20000; // 100000
  System.out.println(l1);

  l1 /= 5 ;
  System.out.println(l1); //20000

  String k2 = "Peggy";
  k2 += " is a girl";// Peggy is a girl
  System.out.println(k2);

  
 }
}
