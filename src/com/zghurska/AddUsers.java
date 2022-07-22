package com.zghurska;

import java.util.ArrayList;
import java.util.List;

public class AddUsers {

public static List<Users> generateUsers(){
   List<Users> result = new ArrayList<>();
   for (int i = 0; i<10; i++){
       Users users = generateNewUsers();
       result.add(users);
   }
   return result;
}
public static Users generateNewUsers(){
    int id = 0;
    String firstName = "";
    String lastName = "";
    int countMoney = 0;
    return new Users(id,firstName,lastName,countMoney);
}
}
