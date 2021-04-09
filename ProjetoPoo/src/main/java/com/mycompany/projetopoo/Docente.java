
package com.mycompany.projetopoo;

public class Docente extends Pessoa{
    private String id_profissional;
    private Cargo cargo;
    private Disciplina formacao;

    public String getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(String id_profissional) {
        this.id_profissional = id_profissional;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Disciplina getFormacao() {
        return formacao;
    }

    public void setFormacao(Disciplina formacao) {
        this.formacao = formacao;
    }
    
    
}
