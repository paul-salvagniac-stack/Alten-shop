package shop.exposition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.entities.Product;
import shop.repo.ProductRepo;



/**
 * Service d'exposition REST des produits.
 * URL / exposée.
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    
     @Autowired
    private ProductRepo repository;

     /**
     * GET 1 product
     * @param product id du produit
     * @return Product converti en JSON
     */
    @RequestMapping("/api/product/{id}")
    public Product getProduct(@PathVariable("id") Product product) {
        return product;
    }
    
    /*public Product getClient(@PathVariable("id") Product product) {
        return product;
    }*/

    /**
     * GET all product
     * @return liste de tout les produits en JSON
     */
    public Iterable<Product> getProducts(){
        return repository.findAll();
    }

    /**
     * POST a product
     * @param product produit à ajouter
     * @return produit ajouté
     */
    public Product postProduct(@RequestBody Product product){
        return repository.save(product);
    }

    /**
     * DELETE a product
     * @param id du produit
     */
    public void deleteProduct (Long id){
        repository.deleteById(id);
    }

    /**
     * PATCH detail of a product
     *  @param product id du produit
     * @param description produit
     */
    @RequestMapping("/api/product/{id}")
    public void patchProduct(@PathVariable("id") Product product, String description){
        product.setDescription(description);
    }
}
