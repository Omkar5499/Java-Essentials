package com.company;

public class Main {

    public static void main(String[] args) {
	 Employee e1 =  new Employee();
                Employee e2 =  new Employee();

               e1.name = "Danesh Pagdiwalla";
                e1.age = 22;
                e1.city = "Pune";

               e2.name = "Ankit Sharma";
                e2.age = 25;
                e2.city = "Pimpri";


                e1.displayDetails();
               e2.displayDetails();
            }
    }

