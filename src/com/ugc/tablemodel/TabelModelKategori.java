/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugc.tablemodel;

import com.ugc.model.Kategori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author omenkzz
 */
public class TabelModelKategori extends AbstractTableModel {

    //private static final long serialVersionUID = -2081036189961494731L;
    //private ArrayList<Kategori> list;
    private List<Kategori> list;

    public TabelModelKategori(List<Kategori> list) {
        this.list = list;
    }

    public TabelModelKategori() {
        
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public int getRowCount() {
        if(list == null){
            return 0;
        }else{
            return list.size();
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        // TODO Auto-generated method stub
        switch (column) {
            case 0:
                return list.get(row).getNama();
            case 1:
                return list.get(row).getKeterangan();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Namaa";
            case 1:
                return "Keterangan";
            default:
                return null;
        }
    }

    public void add(Kategori kategori) {
	list.add(kategori);
	// memberi peringatan ke tabel bahwa data bertambah
	fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }
}
