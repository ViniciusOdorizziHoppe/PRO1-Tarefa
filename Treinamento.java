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
public class Treinamento {
     
    private int identificadorDeTreinamento;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private Date dataRealizacao;

    public int getIdentificadorDeTreinamento() {
        return identificadorDeTreinamento;
    }

    public void setIdentificadorDeTreinamento(int identificadorDeTreinamento) {
        this.identificadorDeTreinamento = identificadorDeTreinamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
    
    
}
