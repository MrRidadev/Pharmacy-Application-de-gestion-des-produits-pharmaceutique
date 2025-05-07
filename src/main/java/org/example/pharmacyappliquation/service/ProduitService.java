package org.example.pharmacyappliquation.service;

import org.example.pharmacyappliquation.model.Produit;
import org.example.pharmacyappliquation.repository.ProduitRepository;
import org.hibernate.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public Iterable<Produit> findAll() {
        return produitRepository.findAll();
    }
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public void deleteProduit(long id) {
        produitRepository.deleteById(id);
    }

    public void updateProduit(Produit produit) {
        produitRepository.save(produit);
    }
}
