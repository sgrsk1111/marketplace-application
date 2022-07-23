package com.zghurska;

import java.util.ArrayList;
import java.util.List;

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
}
