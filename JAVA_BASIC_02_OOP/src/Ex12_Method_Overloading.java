class Human2 {
   String name;
   int age;
}

class Test3 {
   Human2 add(Human2 h) {
      Human2 man = h;
      man.age = 100;
      man.name = "아무개";
      return man; 
   }
   
   Human2 add(Human2 h, Human2 h2) {
      Human2 h3 = new Human2();
      h3.age = h.age + h2.age;
      return h3;
   }
}

public class Ex12_Method_Overloading {

   public static void main(String[] args) {
      Test3 test3 = new Test3();
      
//      Human2 h = test3.add(test3.add(new Human2(), test3.add(new Human2()));
      
//      System.out.println(h.age);
      
      
   }

}
