package com.zghurska;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resources {

    public static List<Users> generateUsers (){
        List<Users> result = new ArrayList<>();
        for(int i = 0; i < 1; i++) {
            result.add(new Users(555,"Vasya","Pupkin",0));
            result.add(new Users(666,"Sveta","Pupkina",90));
            result.add(new Users(777,"Petya","Pupkin",70));
        }
        return result;
    }

    public static List<Products> generateProducts() {
        List<Products> result = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            result.add(new Products(222, "Banana", 25));
            result.add(new Products(333, "Apple", 15));
            result.add(new Products(111, "Orange", 35));
        }
        return result;
    }
    static Products getProducts() {
        Scanner scanner = new Scanner(System.in);
        int idProducts = scanner.nextInt();
        Products finded = null;
        for (Products test : generateProducts()) {
            if (test.getID() == idProducts) {
                finded = test;
                break;
            }

            try {
                if (finded == null) {
                    throw new NullPointerException("Exception: The Product not found");
                } else
                    System.out.println("The Product cost: " + finded.getPRICE());
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }

        return finded;
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

         try {
             if (finded.getAMOUNT_MONEY() < AddProducts.getProducts().getPRICE()) {
                 throw new NullPointerException("Exception: The Users does not have enough money");
             } else
                 System.out.println("Yours money: " + finded.getAMOUNT_MONEY());
         } catch (NullPointerException e){
             System.out.println(e.getMessage());
         }

        return finded;
    }

    static Users getPurchase(){
        Users finded = getUsers();
       // if(finded.getID()== getUsers().getID()) finded.getAMOUNT_MONEY() = finded.getAMOUNT_MONEY()


        return getUsers();
    }
}
