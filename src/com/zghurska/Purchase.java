package com.zghurska;

import java.util.Scanner;


public class Purchase {

    static void getInfoAboutMoney(){
        try{
            Users checkUsers = AddUsers.generateUsers()
                    .stream()
                    .filter(users -> (users.getID() == getPurchase() && (users.getAMOUNT_MONEY()==0)))
                    .findFirst()
                    .orElse(null);
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int getPurchase (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
