import java.util.Scanner

class main() { //Container for everything
  public static void main(String[] args) { //Where almost everything happens
    //Variables that are used
    Num = 0;
    PassLeft = 1;
    TriesLeft = 1;
    
    //Array in which the passwords are saved (Two passwords are examples)
    int[] Pass = {123, 456};
    
    //Array in which the inputs are stored
    int[] UserPass = {};
    
    scanner reader = new scanner(system.in); //Allows user input
    System.out.println("Enter password " + Num + " :"); //Asks user input
    UserPass[Num] = reader.nextInt();
    
    while (PassLeft != -1){ //As long as you are not done
      if (Pass[Num] == UserPass[Num]){ //If you filled in the right password
        Num = Num + 1; //Next block
        PassLeft = PassLeft - 1; //One step closer to authentication
      }
      else {
        if (Num == 1||2 && TriesLeft == 1) { //Checks if you are allowed to try again 
          TriesLeft = TriesLeft - 1; //Can't try again
        }
        else {
          PassLeft = PassLeft + 1; //One step farther away from authentication
        }
      }
    }//while
  }//function
  
  private void LastCheck(){ //Checks if you are done, most important function
    if (PassLeft == -1){
      System.out.println("authentication succesfull")
    }
  }//function
}//main
