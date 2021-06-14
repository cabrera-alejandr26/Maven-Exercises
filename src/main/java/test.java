import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something...");
        String userInput = sc.nextLine();


        if(!StringUtils.isNumeric(userInput)){
            System.out.println("You are using no numbers...");
            System.out.println("YOUR LETTER CASE HAS BEEN SWAPPED!");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println("REVERSE MAGIC!");
            System.out.println(StringUtils.reverse(userInput));
        }
        else{
            System.out.println("You are using numbers...");
        }

    }
}
