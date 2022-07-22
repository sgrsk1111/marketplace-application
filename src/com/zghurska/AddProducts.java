package com.zghurska;

import java.util.ArrayList;
import java.util.List;

public class AddProducts {
    public static List<Products> generateProducts(){
        List<Products> result = new ArrayList<>();
        while (true){
            Products products = generateNewProducts();
            result.add(products);
        }
    }
    private static Products generateNewProducts(){
        int id = 0;
        String nameProducts = "";
        int price = 0;
        return new Products(id, nameProducts,price);
    }
}
