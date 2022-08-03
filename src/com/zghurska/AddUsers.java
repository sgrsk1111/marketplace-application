package com.zghurska;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddUsers {

    public static List<Users> generateUsers (){
        List<Users> result = new ArrayList<>();
        for(int i = 0; i < 1; i++) {
            result.add(new Users(555,"Vasya","Pupkin",0));
            result.add(new Users(666,"Sveta","Pupkina",90));
            result.add(new Users(777,"Petya","Pupkin",70));
        }
        return result;
    }

     static Users getUsers() {
        Scanner scanner = new Scanner(System.in);
        int idUsers = scanner.nextInt();
        Users finded = null;
        for (Users test : generateUsers()) {
            if (test.getID() == idUsers) {
                finded = test;
                break;
            }
        }

        return finded;
    }

    static Users getPurchase(){







                try {
                    if (getUsers().getAMOUNT_MONEY() < AddProducts.getProducts().getPRICE())
                        System.out.println("Your not enough money to buy");
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }




        return getUsers();
    }
}
