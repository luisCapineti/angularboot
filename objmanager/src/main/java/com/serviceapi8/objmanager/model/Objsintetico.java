package com.serviceapi8.objmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Objsintetico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String trabajo;
    private String telefono;
    private String imgUrl;
    @Column(nullable = false,updatable = false)
    private String objCode;

    public Objsintetico(Long id, String name, String email, String trabajo, String telefono, String imgUrl, String objCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.trabajo = trabajo;
        this.telefono = telefono;
        this.imgUrl = imgUrl;
        this.objCode = objCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObjCode() {
        return objCode;
    }

    public void setObjCode(String objCode) {
        this.objCode = objCode;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    @Override
    public String toString(){
        return "objSintetico{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trabajo='" + trabajo + '\''+
                ", telefono='" + telefono + '\''+
                ", imageUrl='" + imgUrl + '\''+
                '}';
    }
}
