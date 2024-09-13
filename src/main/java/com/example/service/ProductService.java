package com.example.service;

import java.util.ArrayList;

import com.example.DAO.ProductDAO;
import com.example.model.Product;

public class ProductService {
    public ArrayList<Product> products;
    private ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
        this.products = new ArrayList<>();
        products.add(new Product(1, "Book", 50, 100000));
        products.add(new Product(2, "Ruler", 20, 50000));
        products.add(new Product(3, "Pen", 40, 10000));
        products.add(new Product(4, "Pen1", 110, 10000));
    }

    public ArrayList<Product> findAll() {
        return this.productDAO.findAll();
    }

    public void createProduct(Product product) {
        this.products.add(product);
    }

    public Product findById(int id) {
        for(Product p : this.products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void updateProduct(Product product) {
        for(Product p : this.products) {
            if (p.getId() == product.getId()) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setQuantity(product.getQuantity());
            }
        }
    }

    public void deleteProduct(int id) {
        for(Product p : this.products) {
            if (p.getId() == id) {
                this.products.remove(p);
                break;
            }
        }
    }
}
