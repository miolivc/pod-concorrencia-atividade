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
public class Application {
    public static GeradorChavePrimaria key = new GeradorChavePrimaria();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int count = 0;
        
        GerenciadorRow row1  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row1).start();
        
        GerenciadorRow row2  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row2).start();
        
        GerenciadorRow row3  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row3).start();
        
        GerenciadorRow row4  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row4).start();
        
        GerenciadorRow row5  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row5).start();
        
        GerenciadorRow row6  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row6).start();
        
        GerenciadorRow row7  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row7).start();
        
        GerenciadorRow row8  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row8).start();
        
        GerenciadorRow row9  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row9).start();
        
        GerenciadorRow row10  = new GerenciadorRow(("Thread-"+ (++count)),  key);
        new Thread(row10).start();
        
    }
    
}
