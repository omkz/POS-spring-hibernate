/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugc.service.impl;

import com.ugc.dao.KategoriDAO;
import com.ugc.model.Kategori;
import com.ugc.service.master.MasterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nia
 */
@Repository("masterService")
@Transactional(readOnly = true)
public class MasterServiceImpl implements MasterService {

   
    private KategoriDAO kategoriDAO;

  
    @Autowired
    public void setKategoriDAO(@Qualifier("kategoriDAOImpl") KategoriDAO kategoriDAO) {
        this.kategoriDAO = kategoriDAO;
    }

     @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public void saveOrUpdate(Kategori kategori) {
        kategoriDAO.saveOrUpdate(kategori);
    }
     @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public void delete(Kategori kategori) {
        kategoriDAO.delete(kategori);
    }

    public Kategori getKategori(String kategori) {
        return kategoriDAO.getKategori(kategori);
    }

    public List<Kategori> getKategoris() {
        return kategoriDAO.getKategoris();
    }
}
