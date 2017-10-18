/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "BARANG_DATA")
@NamedQueries({
    @NamedQuery(name = "BarangData.findAll", query = "SELECT b FROM BarangData b")
    , @NamedQuery(name = "BarangData.findByBarangId", query = "SELECT b FROM BarangData b WHERE b.barangId = :barangId")
    , @NamedQuery(name = "BarangData.findByBarangNama", query = "SELECT b FROM BarangData b WHERE b.barangNama = :barangNama")
    , @NamedQuery(name = "BarangData.findByBarangJenis", query = "SELECT b FROM BarangData b WHERE b.barangJenis = :barangJenis")
    , @NamedQuery(name = "BarangData.findByBarangHarga", query = "SELECT b FROM BarangData b WHERE b.barangHarga = :barangHarga")
    , @NamedQuery(name = "BarangData.findByBarangStok", query = "SELECT b FROM BarangData b WHERE b.barangStok = :barangStok")
    , @NamedQuery(name = "BarangData.findByBarangKondisi", query = "SELECT b FROM BarangData b WHERE b.barangKondisi = :barangKondisi")})
public class BarangData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BARANG_ID")
    private Integer barangId;
    @Column(name = "BARANG_NAMA")
    private String barangNama;
    @Column(name = "BARANG_JENIS")
    private String barangJenis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BARANG_HARGA")
    private Double barangHarga;
    @Column(name = "BARANG_STOK")
    private Integer barangStok;
    @Column(name = "BARANG_KONDISI")
    private String barangKondisi;

    public BarangData() {
    }

    public BarangData(Integer barangId) {
        this.barangId = barangId;
    }

    public Integer getBarangId() {
        return barangId;
    }

    public void setBarangId(Integer barangId) {
        this.barangId = barangId;
    }

    public String getBarangNama() {
        return barangNama;
    }

    public void setBarangNama(String barangNama) {
        this.barangNama = barangNama;
    }

    public String getBarangJenis() {
        return barangJenis;
    }

    public void setBarangJenis(String barangJenis) {
        this.barangJenis = barangJenis;
    }

    public Double getBarangHarga() {
        return barangHarga;
    }

    public void setBarangHarga(Double barangHarga) {
        this.barangHarga = barangHarga;
    }

    public Integer getBarangStok() {
        return barangStok;
    }

    public void setBarangStok(Integer barangStok) {
        this.barangStok = barangStok;
    }

    public String getBarangKondisi() {
        return barangKondisi;
    }

    public void setBarangKondisi(String barangKondisi) {
        this.barangKondisi = barangKondisi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (barangId != null ? barangId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BarangData)) {
            return false;
        }
        BarangData other = (BarangData) object;
        if ((this.barangId == null && other.barangId != null) || (this.barangId != null && !this.barangId.equals(other.barangId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.model.BarangData[ barangId=" + barangId + " ]";
    }
    
}
