package com.zghurska;

import java.util.*;

import static java.lang.Math.subtractExact;

public class Resources {

   static Map<Integer, List<String>> usersPurchases = new HashMap<Integer, List<String>>();
   static Map<Integer, List<String>> productsToUsers = new HashMap<Integer, List<String>>();

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
            }
        }
                try {
                    if (finded.getID() != idProducts) {
                        throw new NullPointerException("Exception: The Product not found");
                    } else{
                        System.out.println("Item found, price: " + finded.getPRICE());
                    }
                } catch (NullPointerException e){
                    System.out.println(e.getMessage());
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
            }
        }

         try {
             if (finded.getAMOUNT_MONEY() < getProducts().getPRICE()) {
                 throw new NullPointerException("Exception: The Users does not have enough money");
             } else{
                 System.out.println("Users found. Yours money before purchase: " + finded.getAMOUNT_MONEY());
             }
         } catch (NullPointerException e){
             System.out.println(e.getMessage());
         }

        return finded;
    }

    static void getPurchase(){
        System.out.println("STORE PURCHASE");
        int keyUser = 0;
        for(Map.Entry<Integer, List<String>> store : usersPurchases.entrySet()){
            if (store.getKey() == getUsers().getID()){
                keyUser= getUsers().getID();
                System.out.println(keyUser);
                List<String> myPurchase = new ArrayList<String>();
                myPurchase = store.getValue();
                System.out.println(myPurchase);
                myPurchase.add(String.valueOf(getProducts().getID()));
                System.out.println(myPurchase);
                usersPurchases.put(keyUser,myPurchase);
            }

            if (keyUser == 0){
                System.out.println("I will create new purchases list " + getUsers().getID());
                usersPurchases.put(getUsers().getID(), new ArrayList<String>(Integer.parseInt(String.valueOf(getProducts().getID()))));
            }

            System.out.println(usersPurchases);
        }

        int keyProduct = 0;
        for(Map.Entry<Integer, List<String>> store : productsToUsers.entrySet()){
            if (store.getKey()== getProducts().getID()){
                keyProduct= getProducts().getID();
                System.out.println(keyProduct);
                List<String> myPurchaseProduct = new ArrayList<String>();
                myPurchaseProduct = store.getValue();
                System.out.println(myPurchaseProduct);
                myPurchaseProduct.add(String.valueOf(getUsers().getID()));
                System.out.println(myPurchaseProduct);
                usersPurchases.put(keyProduct,myPurchaseProduct);
            }

            if (keyProduct == 0){
                usersPurchases.put(getProducts().getID(), new ArrayList<String>(Integer.parseInt(String.valueOf(getUsers().getID()))));
            }

            System.out.println(usersPurchases);
        }
    }

     static void updateWalletUsers (){
        System.out.println("Yours balance update");
         Users finded = getUsers();
         Products findedProduct = getProducts();
         finded.setAMOUNT_MONEY(subtractExact(finded.getAMOUNT_MONEY(),findedProduct.getPRICE()));
    }
}
