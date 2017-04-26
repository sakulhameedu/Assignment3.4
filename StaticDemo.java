public class StaticDemo{
   public static void main(String args[]){
     Student s1 = new Student(); //Creating New object
     s1.showData();
     Student s2 = new Student();
     s2.showData();
     Student s3 = new Student();
     s3.showData();
  }
}

class Student {
int a; //initialized to zero
static int b; //initialized to zero only when class is loaded not for each object created.

  Student(){
   //Constructor incrementing static variable b
   a++;   //Incrementing non static varible 
   b++;  //Incrementing  Static variable 
  }

   public void showData(){
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
   }


}
