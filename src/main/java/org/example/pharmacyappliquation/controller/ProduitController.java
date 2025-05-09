package org.example.pharmacyappliquation.controller;


import org.example.pharmacyappliquation.DTO.ProduitDto;
import org.example.pharmacyappliquation.model.Produit;
import org.example.pharmacyappliquation.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/produit")
public class ProduitController {
    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public Iterable<ProduitDto> getAllProduits() {
        return produitService.findAll();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {

        return produitService.addProduit(produit);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduit(  @PathVariable  Long id) {
        produitService.deleteProduit(id);
    }
    @PutMapping("/update")
    public void updateProduit(@RequestBody Produit produit) {
        produitService.updateProduit(produit);

    }
}
