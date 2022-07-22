package com.zghurska;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddUsers {

private static final Random RANDOM = new Random();
private static final int UPPER_BOUND = 10000;


//метод для проверки нулевых значений в ФИ и кошельке
public static List<Users> dataValidation(){

    return ;
}

public static List<Users> generateUsers(){
   List<Users> result = new ArrayList<>();
   while (true){
       Users users = generateNewUsers();
       result.add(users);
   }
}
private static Users generateNewUsers(){
    int id = RANDOM.nextInt(UPPER_BOUND);
    String firstName = "";
    String lastName = "";
    int countMoney = 0;
    return new Users(id,firstName,lastName,countMoney);
}
}
