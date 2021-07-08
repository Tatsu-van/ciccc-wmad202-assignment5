package ca.ciccc.wmad202.assignment5.problem2;

import java.util.ArrayList;

public class Invoice {
    // Initialize variables
    String productName;
    int productPrice;


    // Constructor
    public Invoice(String name, int price) {
//        setProductName(name);
//        setProductPrice(price);
        // Assign variables to each value
        this.productName = name;
        this.productPrice = price;
    }

//    // Setter
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public void setProductPrice(int productPrice) {
//        this.productPrice = productPrice;
//    }
//
//    // Getter
//    public String getProductName() {
//        return productName;
//    }
//
//    public int getProductPrice() {
//        return productPrice;
//    }

    public static int totalPrice(ArrayList<Integer> priceList) {
        int totalPrice = 0;
        for (int i = 0; i < priceList.size(); i++) {
            totalPrice += Integer.parseInt(String.valueOf(priceList.get(i)));
        }
        return totalPrice;
    }
}

