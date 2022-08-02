package com.zghurska;

import java.util.List;
import java.util.Scanner;

import static com.zghurska.AddProducts.generateProducts;
import static com.zghurska.AddUsers.generateUsers;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Please choose, what do you want to do?");
        System.out.println("1 - Display list of users");
        System.out.println("2 - Display list of products");
        System.out.println("3 - Buy products");
        System.out.println("4 - Display list of user products by user ID");
        System.out.println("5 - Display list of users that buy bought products by product ID");

       int inputNumber = scanner.nextInt();

        switch (inputNumber){
            case 1:
                List<Users> users = generateUsers();
                for (Users usersList : users) {
                    System.out.println(usersList);
                }
                AddUsers.generateUsers();
                break;
            case 2:
                List<Products> products = generateProducts();
                for (Products productsList : products){
                    System.out.println(productsList);
                }
                AddProducts.generateProducts();
                break;
            case 3:
                System.out.println("Please, input your ID and than ID products, which you want to buy");
              //  Purchase.getPurchase();
                AddProducts.getProducts();

                //возможность покупки товара
                /*
                для покупки товара необходимо ввести ИД покупателя,
                а также ввести ИД товара, который будет куплен
                 */
                 // 1!! если у юзера нехватает денег на покупку выдать ексепшн
                // если покупка была успешной то выдать об этом сообщение
                //обязательно нужно списать деньги за купленный товар с кошелька
                //после покупки, вся инфа о юзере и его покупках должна где то хранится (колекции)
            case 4: //показать список юзера по айди, с его покупками, если их нет, то ничего не показывать
            case 5: //показать список юзеров, по айди товаров
                break;
            default:
                System.out.println("Ops, something wrong!");
        }
    }
}
