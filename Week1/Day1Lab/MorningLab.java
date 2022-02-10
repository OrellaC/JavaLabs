// Write a Java program that display the larger of two integers
public class MorningLab 
{
    public static void main(String[]args)
    {
        int num1 = 50, num2 = 20;
        if (num1 == num2)
        System.out.println ("both are equal");
        else if (num1 > num2)
        System.out.println (num1 + " is greater");
        else 
        System.out.println (num2 + "is greater");
    }
}

//  Write an if/else statement for the following requirements:
// If student gets 90 or higher: console log  A
// If students get 80 or above: console log B
// If students get 70 or above: console log C
// If students get 55 or above: console log D
// Any grade lower than 55 is F
public class Grade{
    public static void main(String[] args){
        int score;
        char grade;

        if (score >= 90)
        {
           grade = 'A';
        }
        else if (score >= 80)
        {
           grade = 'B';
        }
        else if (score >= 70)
        {
           grade = 'C';
        }
        else if (score >= 50)
        {
           grade = 'D';
        }
        else
        {
           grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }
}
