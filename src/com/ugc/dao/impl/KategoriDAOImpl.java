package com.ugc.dao.impl;

import com.ugc.dao.KategoriDAO;
import com.ugc.model.Kategori;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Repository("kategoriDAOImpl")
public class KategoriDAOImpl implements KategoriDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveOrUpdate(Kategori kategori) {
        
        sessionFactory.getCurrentSession().saveOrUpdate(kategori);
       
    }

    public void delete(Kategori kategori) {
        sessionFactory.getCurrentSession().delete(kategori);
    }

    public List<Kategori> getKategoris() {
        return sessionFactory.getCurrentSession().createQuery("from Kategori").list();
    }

    public Kategori kategori(String kategori) {
        return (Kategori) sessionFactory.getCurrentSession().getNamedQuery("Barang.findByKdBrng").setParameter("kdBrng", kategori).uniqueResult();
    }

    public Kategori getKategori(String kategori) {
        return (Kategori) sessionFactory.getCurrentSession().getNamedQuery("Barang.findByKdBrng")
                .setParameter("kdBrng", kategori).uniqueResult();
    }


}
