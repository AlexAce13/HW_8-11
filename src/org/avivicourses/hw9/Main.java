package org.avivicourses.hw9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.setDeveloper(Developer.TRAINEE);
        for (Developer developer : Developer.values()){
            if (developer.getRate() == payment.getDeveloper().getRate()){
                System.out.println(payment.getDeveloper().toString());
            }
        }
//        scan();
        dual();
    }
    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rate: ");
        int val = scanner.nextInt();

        for (Developer developer : Developer.values()){
            if(val == developer.getRate()){
                System.out.println(developer.name());
            }
        }
    }

    public static void dual() {
        int val1;
        int val2;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        if (scanner.hasNextInt()){
            val1 = scanner.nextInt();
        } else {
            val1 = 0;
            System.out.println("You entered an incorrect value.");
        }
        System.out.println("Enter second value: ");
        if(scanner.hasNextInt()){
            val2 = scanner.nextInt();
        } else {
            val2 = 0;
            System.out.println("You entered an incorrect value.");
        }
        sum = val1 + val2;
        System.out.println("The sum: " + sum);

    }

};

