import java.util.*;

public class Quiz_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Storming Quiz !!!\n");
        System.out.println("Rules :");
        System.out.println("1. There will be 5 questions in the quiz.");
        System.out.println("2. Out of 4 options only one is correct.");
        System.out.println("3. You will be given only 15 sec to answer each question.");
        System.out.println("4. +4 for correct, -1 for wrong , 0 if you fail to answer within time.");
        System.out.println("5. Timer will start as soon as the question will be displayed.\n");
        System.out.println("\t LETS START \n");
        String Questions[] = {
                "Which wildlife sanctuary is home to the famous Bengal tiger and is located in the Indian state of rajasthan.",
                "Which Indian festival is known as the Festival of Light and is celebrated with decorative lamps, fireworks, and sweets?",
                "What is the name of the highest mountain peak in India and the world's third-highest peak?",
                " The Indian national emblem, the Ashoka Chakra, is inspired by which historical artifact?",
                "Which traditional Indian fabric is known for its intricate patterns and is often used for clothing and accessories?" };
        String options[] = { "1)Sundarbans\n2)Kaziranga\n3)Bandipur\n4)Ranthambore\n",
                "1)Navratri\n2)Diwali\n3)Makar Sankranti\n4)Durga Puja\n",
                "1)Mt. Kanchenjunga\n2)Mt Everest\n3)Nanda Devi\n4)Mt. Annapurna\n",
                "1)Sarnath Lion Capital\n2)Great Stupa Of Sanchi\n3)Ajanta Caves\n4)Khajuraho Temples\n",
                "1)Khadi\n2)Silk\n3)Wool\n4)cotton\n" };
        int score = 0;
        int answers[] = { 4, 2, 1, 1, 1 };
        int users_input[] = new int[5];
        System.out.println("Press 1 to begin--");
        int k = sc.nextInt();
        switch (k) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Q" + (i + 1) + ".");
                    System.out.println(Questions[i]);
                    System.out.println(options[i]);
                    long t1 = System.currentTimeMillis() / 1000;
                    System.out.print("Enter answer:");
                    users_input[i] = sc.nextInt();
                    long t2 = System.currentTimeMillis() / 1000;

                    if ((t2 - t1) <= 15 && (answers[i] == users_input[i])) {
                        score += 4;
                        System.out.println("Time took : " + (t2 - t1) + "s\n");
                    } else if ((t2 - t1) <= 15 && (answers[i] != users_input[i])) {
                        score -= 1;
                        System.out.println("Time took : " + (t2 - t1) + "s\n");
                    } else {
                        System.out.println("Time took : " + (t2 - t1) + "s");
                        System.out.println("This answer will not be evaluated because of over time.\n");
                    }
                    t1 = 0;
                    t2 = 0;
                }
                System.out.println("\nScore : " + score + "/20");
                System.out.println("\nCorrect Ans.   Your Ans.");
                for (int i = 0; i < 5; i++) {
                    System.out.println("\t" + answers[i] + "\t" + users_input[i]);
                }
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
        sc.close();
    }
}
