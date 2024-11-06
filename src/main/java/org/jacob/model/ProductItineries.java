package org.jacob.model;

public class ProductItineries {
    public Integer id;

    public Integer amount;

    public String location;

    public ProductItineries(Integer id, Integer amount, String location) {
        this.id = id;
        this.amount = amount;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
