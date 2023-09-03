package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private long purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(Long portfolioId, String name, String category,Long purchasePrice, Long purchaseDate, Long quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public Long getPurchasePrice(){
        return purchasePrice;
    }

    public Long getPurchaseDate(){
        return purchaseDate;
    }

    public Long getQuantity(){
        return quantity;
    }

    public void setPortfolioId(Long PortfolioId){
        this.portfolioId = PortfolioId;
    }

    public void setSecurityId(Long SecurityId) {
        this.securityId = SecurityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(Long PurchasePrice) {
        this.purchasePrice = PurchasePrice;
    }

    public void setPurchaseDate(Long purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
