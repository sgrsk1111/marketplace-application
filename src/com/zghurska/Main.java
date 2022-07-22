package com.zghurska;

import java.util.List;
import java.util.Scanner;

import static com.zghurska.AddProducts.generateProducts;
import static com.zghurska.AddUsers.generateUsers;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Please choose, what do you want to do?");
        System.out.println("1 - Display list of users");
        System.out.println("2 - Display list of products");
        System.out.println("3 - Buy products");
        System.out.println("4 - Display list of user products by user ID");
        System.out.println("5 - Display list of users that buy bought products by product ID");

        int inputNumber = scanner.nextInt();

        switch (inputNumber){
            case 1:
                List<Users> users = generateUsers();
                for (Users usersList : users) {
                    System.out.println(usersList);
                }
                AddUsers.generateUsers();
                break;
            case 2:
                List<Products> products = generateProducts();
                for (Products productsList : products){
                    System.out.println(productsList);
                }
                AddProducts.generateProducts();
                break;
            case 3:
            case 4:
            case 5:
                break;
            default:
                System.out.println("Ops, something wrong!");
        }




    }
}
