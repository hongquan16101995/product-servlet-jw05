package com.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.model.Product;

public class ProductDAO {
    private String SELECT_ALL_PRODUCT = "select * from product;";

    public ProductDAO() {}

    private static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/btvn_c05_product?useSSL=false";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(URL, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection; 
    }

    public ArrayList<Product> findAll() {
        ArrayList<Product> products = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                double price = Double.parseDouble(resultSet.getString("price"));
                int quantity = Integer.parseInt(resultSet.getString("quantity"));
                products.add(new Product(id, name, quantity, price));
            }
        } catch (Exception e) {
            System.out.println("Có lỗi:" + e.getMessage());
        }
        return products;
    }
}