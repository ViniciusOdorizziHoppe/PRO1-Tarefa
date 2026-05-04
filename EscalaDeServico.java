/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class EscalaDeServico {
    
    private int identificadorDaEscala;
    private Date data;
    private String turno;
    private String bombeiro;

    public int getIdentificadorDaEscala() {
        return identificadorDaEscala;
    }

    public void setIdentificadorDaEscala(int identificadorDaEscala) {
        this.identificadorDaEscala = identificadorDaEscala;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(String bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    
}
