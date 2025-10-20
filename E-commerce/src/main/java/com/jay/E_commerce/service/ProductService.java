package com.jay.E_commerce.service;


import com.jay.E_commerce.model.Product;
import com.jay.E_commerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    //constructor injection
    private final ProductRepo Repo;
    public ProductService(ProductRepo Repo) {
        this.Repo = Repo;
    }

    //Getting all the products from repository
    public List<Product> getAllProducts() {
        return Repo.findAll();
    }


    //getting specific product from repo usind id
    public Product getProductById(int id) {
        return Repo.findById(id).orElse(new  Product());
    }

    //cutting down the image into name type and date so that we can store it in the database
    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());

        return Repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
         product.setImageDate(imageFile.getBytes());
         product.setImageName(imageFile.getOriginalFilename());
         product.setImageType(imageFile.getContentType());

        return Repo.save(product);
    }

    public void deleteProduct(int id) {
        Repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return   Repo.searchProducts(keyword);
    }
}
