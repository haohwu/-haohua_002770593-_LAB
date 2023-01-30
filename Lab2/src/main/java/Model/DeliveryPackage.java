/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class DeliveryPackage {

    int packageId;
    double packageweight;
    ArrayList<Product> productList;
    Customer customer;

    public DeliveryPackage() {
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageweight() {
        return packageweight;
    }

    public void setPackageweight(double packageweight) {
        this.packageweight = packageweight;
    }

    public ArrayList<Product> getProduct() {
        return productList;
    }

    public void setProduct(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product createProduct(int productId, String productName, double price) {
        Product product = new product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(price);

        this.productList.add(product);

        return product;
    }

    public Product findProduct(int pid) {
        for (Product prod : this.productList) {
            if (prod.getProductId() == pid){
                return prod;
            }           
        }
        return null;
    }

}
