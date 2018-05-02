package com.librarygif.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private int categoryId;
    private LocalDate dateUpload;
    private String userName;
    private boolean favorite;

    public Gif(String name, int categoryid, LocalDate dateUpload, String userName, boolean favorite) {
        this.name = name;
        this.categoryId = categoryid;
        this.dateUpload = dateUpload;
        this.userName = userName;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(LocalDate dateUpload) {
        this.dateUpload = dateUpload;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
