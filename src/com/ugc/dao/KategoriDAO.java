package com.ugc.dao;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.ugc.model.Kategori;

public interface KategoriDAO {

    public void saveOrUpdate(Kategori kategori);

    public void delete(Kategori kategori);

    public Kategori getKategori(String kategori);

    public List<Kategori> getKategoris();

  
}
