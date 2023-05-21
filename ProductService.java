package product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if (p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }
    public List<Product> getProductWithText(String text){
        List<Product> product = new ArrayList<>();
        for (Product p : products){
            if (p.getName().toLowerCase().contains(text.toLowerCase()) || p.getPlace().toLowerCase().contains
                    (text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase())){
                product.add(p);
            }
        }
        return product;
    }
    public List<Product> getProductWithPlace(String place){
        String str = place.toLowerCase();
        List<Product> productList = new ArrayList<>();
        products.stream().filter(p -> p.getPlace().toLowerCase().contains(str)).forEach(productList :: add);
        return productList;
    }
    public List<Product> outOfWarrantyProducts(){
        List<Product> outOfWarranty = new ArrayList<>();
        // Assuming warranty is valid till 2023
        products.stream().filter(p -> p.getWarranty() < 2023).forEach(outOfWarranty :: add);
        return outOfWarranty;
    }
}
