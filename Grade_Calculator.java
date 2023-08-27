import java.util.*;

public class Grade_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your Marks to know your Percentage & Grade....\n");
        System.out.println("Enter your marks in each subject (out of 100)");
        System.out.println("\nMaths");
        int m = sc.nextInt();
        System.out.println("\nScience");
        int s = sc.nextInt();
        System.out.println("\nEnglish");
        int e = sc.nextInt();
        System.out.println("\nHindi");
        int h = sc.nextInt();
        System.out.println("\nSocial Studies");
        int st = sc.nextInt();
        System.out.println("\nComputer");
        int c = sc.nextInt();
        int total = m + s + e + h + st + c;
        double perc = total / 6.0;
        System.out.println("\nTotal Marks : 600");
        System.out.println("Marks obtained : " + total);
        System.out.println("Your Percentage : " + perc + "%");
        if (perc >= 90) {
            System.out.println("Grade : A+");
        } else if (perc >= 80 && perc < 90) {
            System.out.println("Grade : A");
        } else if (perc >= 70 && perc < 80) {
            System.out.println("Grade : B");
        }

        else if (perc >= 60 && perc < 70) {
            System.out.println("Grade : c");
        }

        else if (perc >= 50 && perc < 60) {
            System.out.println("Grade : D");
        }

        else if (perc >= 40 && perc < 50) {
            System.out.println("Grade : E");
        }

        else if (perc < 40) {
            System.out.println("Grade : F");
        }
        sc.close();
    }
}