import java.util.Scanner;

public class V0.2{ //Where everything happens
  public static void main(String[] args){
    //Variables I am going to use
    Num = 0;
    PassLeft = 1;
    TriesLeft = 1;
    
    //Array in which all the passwords are stored (filled in are two examples)
    int[] Pass = {123, 456);
    
    //Array in which all the userPasswords are stored
    int[] UserPass = {};
    
    Scanner reader = new scanner(System.in); //Allows me to get user input
    System.out.println("Enter Password:"); //Asks for user input
    UserPass[num] = reader.nextInt();
    
    while (PassLeft == -1) { //As long as you are not done
      if (UserPass[num] == Pass[num]) { //Checks if the right password is filled in
        Num = Num + 1; //Advances to next block
        PassLeft = PassLeft - 1; //One block closer to authentication
      };
      else {
        if (Num == 1||2 && TriesLeft == 1) { //Checks if you have the right to try again
          TriesLeft = TriesLeft - 1; //Can't try again
        };
        else {
          PassLeft = PassLeft + 1; //One block farther away from authentication
        };
      };
    }//while
  };//function
  private static void FinalCheck() { //Checks if you are logged in, the most important function in the program
    if (PassLeft == -1) {
      System.out.println("Authentication succesfull");
    };
  };//function
  return 0;
};//main
