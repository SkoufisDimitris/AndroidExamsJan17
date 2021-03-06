package com.example.user.skoufisjan17;

public class Merchant {

    private String id;
    private String legalName;
    private String category;
    private String address;
    private String imageUrl;
    private String review;

    public Merchant(String id, String legalName, String category, String address, String review) {
        this.id = id;
        this.legalName = legalName;
        this.category = category;
        this.address = address;
        this.review = review;
    }

    public String getId() {
        return id;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getCategory() {
        return category;
    }

    public String getAddress() {
        return address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReview() {
        return review;
    }
}
