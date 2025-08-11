package lab30_july;

import java.util.*;

class Products {
    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class productssubclass implements Comparator<Products> {

    @Override
    public int compare(Products p1, Products p2) {
        return Double.compare(p1.price, p2.price);  // Ascending order by price
    }

    public static void main(String[] args) {
        List<Products> productList = new ArrayList<>();

        productList.add(new Products("Refrigerator", 20000.00));
        productList.add(new Products("Cooler", 6000.00));
        productList.add(new Products("Washing Machine", 30000.00));
        productList.add(new Products("Heater", 1000.00));

        Collections.sort(productList, new productssubclass());

        for (Products pro : productList) {
            System.out.println(pro);
        }
    }
}
