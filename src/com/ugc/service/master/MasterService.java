/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugc.service.master;

import com.ugc.model.Kategori;
import java.util.List;

/**
 *
 * @author nia
 */
public interface MasterService {

    public void saveOrUpdate(Kategori kategori);

    public void delete(Kategori kategori);

    public Kategori getKategori(String kategori);

    public List<Kategori> getKategoris();
}
