package com.zghurska;

import java.util.Scanner;
import java.util.stream.Collectors;


public class Purchase {

    static void getInfoAboutMoney(){

        Products checkProducts = (Products) AddProducts.generateProducts()
                .stream()
                .filter(products -> products.getID() == getProducts())
                .collect(Collectors.toList());

        Users checkUsers = (Users) AddUsers.generateUsers()
                .stream()
                .filter(users -> (users.getID() == getPurchase()) && (users.getAMOUNT_MONEY()) > checkProducts.getPRICE())
                .collect(Collectors.toList());

        if( checkProducts.getPRICE() > checkUsers.getAMOUNT_MONEY()){
            try{
               int result = checkProducts.getPRICE() - checkUsers.getAMOUNT_MONEY();
                System.out.println("Your money now" + result);
            } catch (ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println(checkUsers);
        }
    }

    static int getPurchase (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int getProducts (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
