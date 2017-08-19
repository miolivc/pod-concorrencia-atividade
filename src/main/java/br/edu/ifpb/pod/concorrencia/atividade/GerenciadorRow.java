/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.concorrencia.atividade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miolivc
 */
public class GerenciadorRow implements Runnable {
    private GeradorChavePrimaria key;
    private String name;
    private RowDAO dao;

    public GerenciadorRow(String name, GeradorChavePrimaria key) throws SQLException, ClassNotFoundException {
        this.name = name;
        this.key = key;
        this.dao = new RowPostgres();
    }
    
    @Override
    public void run() {
        try {
            dao.addList(new Row(key.generate(), name, System.currentTimeMillis()));
        } catch (SQLException ex) {
            Logger.getLogger(GerenciadorRow.class.getName()).log(Level.SEVERE, null, ex);
        }
//        if( key.get() <= 100000 ) {
//            dao.add(new Row(key.generate(), name, System.currentTimeMillis()));
//            this.run();
//        }
//        for (int i = 0; i < 100000; i++) {
//            dao.add(new Row(key.generate(), name, System.currentTimeMillis()));
//        }
        
    }
    
}
