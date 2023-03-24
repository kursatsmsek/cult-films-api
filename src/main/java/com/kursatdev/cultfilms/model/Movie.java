package com.kursatdev.cultfilms.model;

public class Movie {

    private String title;

    private String overview;

    private Category category;

    private String photoUrl;

    public Movie(String title, String overview, Category category, String photoUrl) {
        this.title = title;
        this.overview = overview;
        this.category = category;
        this.photoUrl = photoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
