package com.nightmarket.shop.dto;

import com.nightmarket.shop.model.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ProductDTO {
    private static Long id;
    private static String name;
    private static int categoryId;
    private static double price;
    private static double weight;
    private static String description;
    private static String imageName;

    public static void setId(Long id) {
        ProductDTO.id = id;
    }

    public static void setName(String name) {
        ProductDTO.name = name;
    }

    public static void setCategoryId(int categoryId) {
        ProductDTO.categoryId = categoryId;
    }

    public static void setWeight(double weight) {
        ProductDTO.weight = weight;
    }

    public static void setPrice(double price) {
        ProductDTO.price = price;
    }

    public static void setDescription(String description) {
        ProductDTO.description = description;
    }

    public static void setImageName(String imageName) {
        ProductDTO.imageName = imageName;
    }

    public static Long getId() {
        return ProductDTO.id;
    }

    public String getName() {
        return ProductDTO.name;
    }

    public int getCategoryId() {
        return  ProductDTO.categoryId;
    }

    public static double getPrice() {
        return ProductDTO.price;
    }

    public static double getWeight() {
        return ProductDTO.weight;
    }

    public static String getDescription() {
        return ProductDTO.description;
    }

    public static String getImageName() {
        return ProductDTO.imageName;
    }
}
