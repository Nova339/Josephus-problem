//This is the main file of the Josephus problem

import java.util.*;

public class josephusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //initialize scanner object
        LinkedList<Integer> list  = new LinkedList<Integer>(); //initialize linklist object

        int numOfPeople;  //number of nodes created for the list
        int skip; //skip value for kills (Inclusive)


        System.out.println("Welcome to the Josephus Problem.");

        do { //checks that range is between 1 - 100
            System.out.println("How many people in the circle (1 - 100)?");
            numOfPeople = in.nextInt();
        }while (numOfPeople > 100 || numOfPeople <= 0);

        System.out.println("\nEnter the number of people to skip (Inclusive) between eliminations: ");
        skip = in.nextInt();

        System.out.println("\nRunning : ");

        list.eliminations(numOfPeople, skip);

        in.close();
    }
}
