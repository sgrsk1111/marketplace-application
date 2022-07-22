package com.zghurska;

import java.util.ArrayList;
import java.util.List;

public class AddProducts {
    public static List<Products> generateProducts (){
        List<Products> result = new ArrayList<>();
        for(int i = 0; i < 1; i++) {
            result.add(new Products(222,"Banana",25));
            result.add(new Products(333,"Apple",15));
            result.add(new Products(111,"Orange",35));
        }
        return result;
    }
}
