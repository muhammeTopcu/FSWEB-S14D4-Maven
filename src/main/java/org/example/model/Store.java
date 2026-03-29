package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 50.0, "Bitter chocolate");
        products[1] = new Coke("Coca Cola", 20.0, "Cold drink");
        products[2] = new Bread("White Bread", 10.0, "Fresh bread");

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}