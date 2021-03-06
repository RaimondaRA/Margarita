package com.example.margarita;

public class Margarita {
    private String id;
    private String name;
    private String tags;
    private String category;
    private String glass;

    public Margarita(String idDrink, String strDrink, String strTags, String strCategory, String strGlass) { //Konstruktorius
        this.id = idDrink;
        this.name = strDrink;
        this.tags = strTags;
        this.category = strCategory;
        this.glass = strGlass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "Margarita{" +
                "Drink ID='" + id + '\'' +
                ", Drink Name='" + name + '\'' +
                ", Tags='" + tags + '\'' +
                ", Category=" + category +
                ", Glass Type=" + glass +
                '}';
    }
}
