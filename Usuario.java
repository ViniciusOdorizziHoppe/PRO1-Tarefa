/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.usuario;

/**
 *
 * @author aluno
 */
public class Usuario {

    private int IdentificadoreUsuario;
    private String login;
    private String senha;
    private String perfil;

    public int getIdentificadoreUsuario() {
        return IdentificadoreUsuario;
    }

    public void setIdentificadoreUsuario(int IdentificadoreUsuario) {
        this.IdentificadoreUsuario = IdentificadoreUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    

}
