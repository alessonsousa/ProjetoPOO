
package com.mycompany.projetopoo;

public class Aluno extends Pessoa {
    private String identidade;
    private String cpf;
    private Pessoa resp;

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getResp() {
        return resp;
    }

    public void setResp(Pessoa resp) {
        this.resp = resp;
    }
    
    
}
