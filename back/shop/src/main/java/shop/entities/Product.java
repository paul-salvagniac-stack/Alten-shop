package shop.entities;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.orm.jpa.EntityScan;

// on veut les setters pour TOUS les attributs
@Setter
// on veut les getters pour TOUS les attributs
@Getter

@EntityScan
public class Product {
    
    private long id;
    private String code;
    private String name;
    private String description;
    private int price;
    private int quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private int rating;
}
