package com.example.service;

import java.util.ArrayList;

import com.example.DAO.ProductDAO;
import com.example.model.Product;

public class ProductService {
    private ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
    }

    public ArrayList<Product> findAll() {
        return this.productDAO.findAll();
    }

    public void createProduct(Product product) {
        this.productDAO.createProduct(product);
    }

    public Product findById(int id) {
        return this.productDAO.findOne(id);
    }

    public void updateProduct(Product product) {
        this.productDAO.updateProduct(product);
    }

    public void deleteProduct(int id) {
        this.productDAO.deleteProduct(id);
    }
}
