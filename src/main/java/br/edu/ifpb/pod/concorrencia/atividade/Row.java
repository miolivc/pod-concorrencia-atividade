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
public class Row {
    
    private int id;
    private String who;
    private long createIn;

    public Row(int id, String who, long createIn) {
        this.id = id;
        this.who = who;
        this.createIn = createIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public long getCreateIn() {
        return createIn;
    }

    public void setCreateIn(long createIn) {
        this.createIn = createIn;
    }

}
