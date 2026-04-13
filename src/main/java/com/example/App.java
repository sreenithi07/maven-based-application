package com.example;

import java.util.*;

class Subject {
    String name;
    int credits;

    Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student ID:");
        String id = sc.nextLine();

        List<Subject> subjects = new ArrayList<>();
        int totalCredits = 0;

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter subject name:");
            String subName = sc.nextLine();

            System.out.println("Enter credits:");
            int credits = sc.nextInt();
            sc.nextLine();

            subjects.add(new Subject(subName, credits));
            totalCredits += credits;
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);

        System.out.println("\nRegistered Subjects:");
        for (Subject s : subjects) {
            System.out.println(s.name + " - " + s.credits + " credits");
        }

        System.out.println("\nTotal Credits: " + totalCredits);

        if (totalCredits >= 15) {
            System.out.println("Status: Eligible");
        } else {
            System.out.println("Status: Not Eligible");
        }

        sc.close();
    }
}
