/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.service;

import com.valensi.model.BarangData;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class BarangService {
    
    @PersistenceContext
    private EntityManager em;

    public BarangService() {
    }
    
    public List<BarangData> findAll(){
        List<BarangData> bd;
        bd = this.getEm().createNamedQuery("BarangData.findAll").getResultList();
        return bd;
    }
    
    public BarangData findById(Integer barangId){
        return getEm().find(BarangData.class, barangId);
    }
    
    @Transactional
    public void register(BarangData brgData){
        //save employee
        this.getEm().persist(brgData);
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
