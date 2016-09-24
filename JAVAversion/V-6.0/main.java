import java.util.Scanner;
import java.util.*;
import java.lang.Integer;

class main { //The overall wrapper
  static int PassLeft = 2; //A variable used in multiple functions, so it has to be declared outside both
  
  public static void main(Stringn[] args){ //Where the largest part of the process happens
    //Variables used
    int Num = 0;
    int TriesLeft = 1;
    
    while (PassLeft != 0) {
      //A list that stores all user passwords
      List<Integer> Pass = new ArrayList<Integer>();
      Pass.add(123);
      Pass.add(456);
      
      //A list in which all input is stored
      List<Integer> UserPass = new ArrayList<Integer>();
      
      Scanner reader = new Scanner(System.in); //Asks for password and stores it in UserPass on place Num
      System.out.println("Enter password:");
      UserPass.add(Num, reader.nextInt());
      System.out.println("UserPass = " + UserPass); //EXTRA for monitoring
      
      if (UserPass.get(Num) == Pass.get(Num) {
        Num = Num + 1;
      }
      else {
        PassLeft = PassLeft + 1;
      };
    }; //While
  }; //Function
}; //Main
