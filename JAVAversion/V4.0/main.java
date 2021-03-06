import java.util.Scanner;

class main {
  public static void main(String[] args) {
    //Variables used
    int Num = 0;
    int PassLeft = 1;
    int TriesLeft = 1;
    
    //Array that stores all passwords
    int[] Pass = {123, 456};
    
    //Array that stores all input passwords
    int[] UserPass = {};
    
    while(PassLeft != -1) { //As long as you are not done
      scanner reader = new Scanner(System.in); //Allows user input
      System.out.println("Enter password " + Num + " :"); //Asks user input
      UserPass[Num] = reader.nextInt();
    
      if (UserPass[Num] == Pass[Num]) { //Checks if you filled in the right passwords
        Num = Num + 1; //Next block
        PassLeft = PassLeft - 1; //One step closer to authentication
      }
      else {
        if (Num == 1||2 && TriesLeft == 1){ //Checks if you have the right to try again
          TriesLeft = TriesLeft - 1; //Only one time
        }
        else {
          PassLeft = PassLeft + 1; //One step farther away from authentication
        }
      }
    }//while
  }//function
  private static void LastCheck(){ //Checks if you are done, most important function in the program
    if (PassLeft == -1){
      System.out.println("Authentication succesfull");
    }
  }//function
}//class
