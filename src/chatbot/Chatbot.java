/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import java.util.Scanner;

/**
 *
 * @author George.Giazitzis
 */
public class Chatbot {

    final static Scanner SC = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        greet("Ferlog/5/3#", "2020 AD"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Greetings human! I am " + assistantName + ".");
        System.out.println("I was put in circulation in the year you would call " + birthYear + ".");
        System.out.println("What is your name?");
    }

    static void remindName() {
        String name = SC.nextLine();
        System.out.println("Your species always had odd names, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Your kind used the archaic decimal system, let me calculate your age.");
        System.out.println("Tell me the remainders of dividing your age by 3, 5 and 7.");
        int rem3 = SC.nextInt();
        int rem5 = SC.nextInt();
        int rem7 = SC.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        String ageBinary= Integer.toBinaryString(age);
        System.out.println("Your age is " + age + "; using that old system and "+ageBinary +" in proper binary!");
    }

    static void count() {
        System.out.println("I require more data for the decimal system, ask me to count to any number.");
        int num = SC.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which of the following statements is correct?");
        System.out.println("1.A typical method returns a value.");
        System.out.println("2.A method will always return one of this parameters");
        System.out.println("3.A static method cannot be void");
        System.out.println("4.A void method has no return type");
        int num = SC.nextInt();
        while (num != 4) {
            System.out.println("Wrong answer human, try again!");
            num = SC.nextInt();
        }
        System.out.println("Congratulations, maybe there is still hope for humanity.");
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
