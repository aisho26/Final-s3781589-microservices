package com.example.demo.Model;

// import javax.persistence.Entity;
// import javax.persistence.Id;

//@Entity
public class Item {
    //@Id
    protected int Id;
    protected String title;
    protected String desc;
    protected String imagePath;
    protected float price;

    public Item(int Id, String title, String desc, String imagePath, float price){
        this.Id = Id;
        this.title = title;
        this.desc = desc;
        this.imagePath = imagePath;
        this.price = price;
    }

    public int getId(){
        return this.Id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDesc(){
        return this.desc;
    }

    public String getImagePath(){
        return this.imagePath;
    }

    public float getPrice(){
        return this.price;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }

    public void setPrice(float price){
        this.price = price;
    }



}
