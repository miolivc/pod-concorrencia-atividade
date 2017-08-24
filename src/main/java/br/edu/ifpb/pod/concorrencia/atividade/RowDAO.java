/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.concorrencia.atividade;

import java.sql.SQLException;

/**
 *
 * @author miolivc
 */
public interface RowDAO {
    
    void add(Row row);
    void addList(GeradorChavePrimaria key, String name) throws SQLException;
}
