package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length; i++) {
            if (products[i] != null) {
                Product temp = products[i];
                products[i] = products[i - 1];
                products[i - 1] = temp;
            }
        }
        return products;
    }
}
