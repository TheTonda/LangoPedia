package com.codeveloper.adepterwithcardview;

public class Language {
    private String Title;
    private int Thumbnail;

    public Language(String title,int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }


    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        this.Title = title;
    }

    public void setThumbnail(int thumbnail) {
        this.Thumbnail = thumbnail;
    }


}
