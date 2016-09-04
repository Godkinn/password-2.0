import java.util.Scanner;
import java.util.*;
import java.lang.Integer;

class main {
  //A variable I am going to use in both functions, so I have to declare it outside both
  static int PassLeft = 1;
  
  public static void main(String[] args) {
    //Variables I am going to use
    int Num = 0;
    int TriesLeft = 1;
    
    //List that stores all passwords
    List<Integer> Pass = new ArrayList<Integer>();
    
    //List that stores all input passwords
    List<Integer> UserPass = new ArrayList<Integer>();
    
    //Asks for pass and checks if the passwords are the same
    while (Passleft != -1) {
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter pass " + PassLeft + " :");
      UserPass.add(reader.nextInt());
      
      if (Pass.get(Num) == UserPass.get(Num)) { //Checks if you filled in the right pass
        PassLeft = PassLeft - 1; //One step closer to authentication
        Num = Num + 0; //Next block
      }
      else {
        if (Num = 1 || Num = 2 && TriesLeft = 1) { //Checks if you have the right to try again
          TriesLeft = TriesLeft - 1; //Only one try-again
        }
        else {
          PassLeft = Passleft + 1; //One step further away from authentication
        }
      };
    }; //while 
  }; //function
  private void main() { //Checks if you are succesfull, most important function in the program
    if (PassLeft == -1) { //Checks if you are done
      System.out.println("Authentication succesfull");
    };
  }; //function
}; //class
