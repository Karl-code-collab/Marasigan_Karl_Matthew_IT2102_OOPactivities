import java.util.*;
public class GettingGreater {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        char Greater;

        System.out.println("Getting the Great Value");

        System.out.print("Enter the first Character: ");
        char firstInput=console.next().charAt(0);
        int First = (int) firstInput;

        System.out.print("Enter the Second Character: ");
        char secondInput=console.next().charAt(0);
        int Second = (int) secondInput;

        if (First > Second){
            Greater = firstInput;
        } else {
            Greater = secondInput;
        }


        
        System.out.println("-----------------------------");
        System.out.println("The character with greater value is: " + Greater);
        System.out.println("-----------------------------");
        System.out.println("Showwing the ASCII Codes");
        System.out.println(firstInput + ": " + First);
        System.out.println(secondInput + ": " + Second);
    }
}