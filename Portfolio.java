package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long creationDate;


    @Column(nullable = false)
    private long clientId;

    protected Portfolio() {

    }

    public Portfolio(Long creationDate, Long clientId) {
        this.creationDate = creationDate;
        this.clientId = clientId;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getCreationDate(){
        return creationDate;
    }

    public void setPortfolioId(Long PortfolioId){
        this.portfolioId = PortfolioId;
    }

    public void setClientId(Long ClientId) {
        this.clientId = ClientId;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }
}
