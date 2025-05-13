package org.example.pharmacyappliquation.repository;

import org.example.pharmacyappliquation.model.Produit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

    List<Produit> findByQuantiteGreaterThan(int quantite);
}


// jpa repository
//crud
//orm
