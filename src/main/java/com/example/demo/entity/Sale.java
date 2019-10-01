package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Sale {
    @Id
    private long saleNo;
    private long salesmanID;
    @OneToMany(mappedBy = "Product")
    private Set<Product> productSet;

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    private long proID;
    private String salesmanName;
    private long dateOfSale;


    public long getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(long saleNo) {
        this.saleNo = saleNo;
    }

    public long getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(long salesmanID) {
        this.salesmanID = salesmanID;
    }

    public long getProID() {
        return proID;
    }

    public void setProID(long proID) {
        this.proID = proID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public long getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(long dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}
