package com.zghurska;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddProducts {

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
                System.out.println("Okay, we found this products");
                finded = test;
                break;
            } else {
                System.out.println("Please, re-enter the product ID");
                getProducts();
            }
        }
        return finded;
    }
}
