package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(length = 80)
    public String name;

    @Column(length = 30)
    public String system;

    @Column(length = 80)
    public String developer;

    @Column(nullable = false)
    public long uploader_id;



//    @Lob
//    @Column
//    public byte[] picture;



    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSystem() {return system;}
    public void setSystem(String system) {this.system = system;}
    public String getDeveloper() {return developer;}
    public void setDeveloper(String developer) {this.developer = developer;}
    public long getUploaderId() {return uploader_id;}
    public void setUploaderId(long uploaderId) {this.uploader_id = uploaderId;}
//    public byte[] getPicture() {return picture;}
//    public void setPicture(byte[] picture) {this.picture = picture;}
}