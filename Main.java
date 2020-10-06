import java.util.Scanner;

/**
 *This program will calculate the factorial of the usersnumber
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for number
    System.out.println("Please enter an integer to calculate the factorial of");

    //creates integers for the factorial
    int usersNumber = input.nextInt();
    //creates an interger for the product
    int product = 1;

    //creaetes accumulator and for loop
    for(int accumulator = usersNumber - 1; accumulator >= 1; accumulator--){
      //finds product for the first time
      if(accumulator == usersNumber - 1){
        product = usersNumber * accumulator;
        //calculates product for reaminaing numbers
      }else{
        product = product * accumulator;
      }
    }
    //prints factorial
    System.out.print(usersNumber + "! = " + product);
  }
}
