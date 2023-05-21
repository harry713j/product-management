package product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.addProduct(new Product("Type c", "Cable","Black Drawer",2024));
        service.addProduct(new Product("Mac Studio","Computer","White Table",2023));
        service.addProduct(new Product("Focusrite Mixer","Audio System","White Table",2022));
        service.addProduct(new Product("Asus Vivobook","Laptop","Brown Drawer",2022));
        service.addProduct(new Product("Macbook Pro","Laptop","Brown Drawer",2022));
        service.addProduct(new Product("Asus Rog","Laptop","Black Table",2021));
        service.addProduct(new Product("Wacom Pad","Writing Pad","Black Drawer",2021));
        service.addProduct(new Product("Apple Keyboard","Keyboard","White Table",2024));
        service.addProduct(new Product("Logitech Keyboard","Keyboard","Black Table",2023));
        service.addProduct(new Product("Hdmi Cable","Cable","Black Drawer",2024));
        service.addProduct(new Product("Java Black Book","Cable","Shelf",2024));
        service.addProduct(new Product("Logi Mouse","Mouse","Black Table",2022));
        service.addProduct(new Product("Apple Mouse","Mouse","White Table",2022));
        service.addProduct(new Product("Lenovo Mouse","Mouse","Black Drawer",2023));
        service.addProduct(new Product("BlackBeast","Computer","White Table",2024));

        List<Product> productList = service.getAllProducts();
        productList.forEach(p -> System.out.println(p));
        System.out.println("==============================================================");

        Product p = service.getProduct("Asus Rog");
        System.out.println(p);
        System.out.println("==============================================================");

        List<Product> product = service.getProductWithText("Black");
        product.forEach(e -> System.out.println(e));
        System.out.println("==============================================================");

        List<Product> productsAtPlace = service.getProductWithPlace("white table");
        productsAtPlace.forEach(i -> System.out.println(i));
        System.out.println("==============================================================");

        List<Product> outOfWarrantyProducts = service.outOfWarrantyProducts();
        outOfWarrantyProducts.forEach(product1 -> System.out.println(product1));
    }
}