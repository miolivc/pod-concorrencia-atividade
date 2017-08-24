/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.concorrencia.atividade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miolivc
 */
public class RowPostgres implements RowDAO {
    
    private final Connection connection;

    public RowPostgres() throws SQLException, ClassNotFoundException {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void add(Row row) {
        String sql = "INSERT INTO TB_DADOS(ID, WHO, CREATE_IN) VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, row.getId());
            stmt.setString(2, row.getWho());
            stmt.setLong(3, row.getCreateIn());
            if (stmt.executeUpdate() != 1) throw new SQLException("Erro ao inserir no banco de dados!");
        } catch (SQLException ex) {
            Logger.getLogger(RowPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void addList(GeradorChavePrimaria key,String name) throws SQLException {
        String sql = "INSERT INTO TB_DADOS(ID, WHO, CREATE_IN) VALUES(?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        for (int i = 0; i < 100000; i++) {
            Row row = new Row(key.generate(), name, System.currentTimeMillis());
            stmt.setInt(1, row.getId());
            stmt.setString(2, row.getWho());
            stmt.setLong(3, row.getCreateIn());
            stmt.addBatch();
        }
        stmt.executeBatch();
    } 
    
}
