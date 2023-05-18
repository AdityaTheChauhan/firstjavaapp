
import java.util.Scanner;

public class FirstLetterUppercaseNoDigits 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isValid = true;

        // Check first letter is uppercase and not a digit
        char firstChar = input.charAt(0);
        if (!Character.isUpperCase(firstChar) && Character.isDigit(firstChar)) 
        {
            isValid = false;
        }

        // Check all other characters are lowercase or digits
        for (int i = 1; i < input.length(); i++) 
        {
            char currentChar = input.charAt(i);
            if (!Character.isLowerCase(currentChar) && Character.isDigit(currentChar)) 
            {
                isValid = false;
                break;
            }
        }

        if (isValid) 
        {
            System.out.println("The string is valid.");
        } 
        else 
        {
            System.out.println("The string is not valid.");
        }
    }
}

/*
import java.util.Scanner;

public class FirstLetterUppercaseNoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isValid = true;

        // Check first letter is uppercase and not a digit
        char firstChar = input.charAt(0);
        if (!Character.isUpperCase(firstChar) || Character.isDigit(firstChar)) {
            isValid = false;
        }

        // Check all other characters are lowercase or digits
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isLowerCase(currentChar) && !Character.isDigit(currentChar)) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }
}*/