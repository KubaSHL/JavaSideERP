package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCardRepository extends JpaRepository<ProductCard, Long> {
}
