package ca.ciccc.wmad202.assignment5.problem2;

import java.util.ArrayList;

public class Problem2 {
    public static void run(){
        ArrayList<Integer> priceList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<String>();

        Invoice apple = new Invoice("apple", 100);
        priceList.add(apple.productPrice);
        nameList.add(apple.productName);
        Invoice grape = new Invoice("grape", 150);
        priceList.add(grape.productPrice);
        nameList.add(grape.productName);
        Invoice orange = new Invoice("orange", 80);
        priceList.add(orange.productPrice);
        nameList.add(orange.productName);

        for(int i = 0; i < priceList.size(); i++){
            System.out.print(nameList.get(i) + " " + priceList.get(i));
            if(i != priceList.size() - 1){
                System.out.print(" , ");
            }
        }
        System.out.println("");

        System.out.println("The total price: " + Invoice.totalPrice(priceList));
    }
}
