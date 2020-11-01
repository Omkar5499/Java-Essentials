package Day8.Q3;

import java.util.Scanner;

public class Avengers {

    Scanner sc = new Scanner(System.in);

    String name,power,weapon,planet;
    int age;

    public void getDetails(){

        System.out.print("Avenger: ");
        name = sc.nextLine();
        System.out.print("Power: ");
        power = sc.nextLine();
        System.out.print("Weapon: ");
        weapon = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Planet: ");
        planet = sc.nextLine();


    }

    public void displayDetails(){

        System.out.println("Avenger: "+name);
        System.out.println("Power: "+power);
        System.out.println("Weapon: "+weapon);
        System.out.println("Age: "+age);
        System.out.println("Planet: "+planet);

    }

}
