import java.util.Scanner;

Class main { //Where almost everything happens
  public static void main(String[] args){
    //Variables I am going to use:
    int Num = 0; 
    int PassLeft = 1;
    int ChancesLeft = 1;
    
    //The array in which all the passwords are stored (The two passwords currently stored are examples)
    Int[] Pass = {123, 456};
    
    //The array in which all the filled in passwords are stored
    Int[] UserPass = {}
    
    scanner reader = new Scanner(System.in); //Allows the program to get user input
    System.out.println("Enter password:"); 
    UserPass[num] = reader.nextInt; 
    
    while (PassLeft != -1){ //As long as you are not done yet
      if (Pass[num] == UserPass[num]) {//Checks whether the filled in password is the same one as the password in the program
        Num = Num + 1; //Advances to the next pass
        PwLeft = PwLeft - 1; //One step closer to authentication
      }
      else {
        if (Num == 1||2 && ChancesLeft == 1) { //Checks if you have the right to try again
        ChancesLeft = ChancesLeft - 1;
        }
        else {
          PwLeft = PwLeft + 1; //One step farther away from authentication
        }
      }//else
    }//while
  }//function
  
  private void FinalCheck(PwLeft) {//Only does one thing: check if all the required blocks are done, this class is the most important one in the program
    if (PwLeft === -1) {
    System.out.println("Authentication succesfull");
    }
  }//function
}//class
