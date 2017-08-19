/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.concorrencia.atividade;

/**
 *
 * @author miolivc
 */
public class GeradorChavePrimaria {
    private int time, finish;
    private volatile static int key = 0; 

    public int get() {
        return key;
    }
    
    public int generate() {
        return key++;
    }
    
}
