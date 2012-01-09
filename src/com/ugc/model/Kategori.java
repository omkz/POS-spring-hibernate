/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugc.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Kategori implements Serializable {

    @GeneratedValue
    @Id
    private Long id;
//    @Column(unique = true, nullable = false)
//    @Size(min = 2,message="tidak boleh kosong")
    private String nama;
    //@Size(min = 2,message="tidak boleh kosong")
    private String Keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    } 
}
