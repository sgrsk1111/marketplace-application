package com.zghurska;

import java.util.ArrayList;
import java.util.List;

public class AddProducts {
    public static List<Products> generateProducts(){
        List<Products> result = new ArrayList<>();
         for (int i = 0; i<10;i++){
            Products products = generateNewProducts();
            result.add(products);
        }
         return result;
    }
    public static Products generateNewProducts(){
        int id = 0;
        String nameProducts = "";
        int price = 0;
        return new Products(id, nameProducts,price);
    }
}
