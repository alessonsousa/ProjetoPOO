package com.mycompany.projetopoo.app;

import com.mycompany.projetopoo.Aluno;

public class ListarAluno {
    
    public void Laluno(Aluno[] alunos) {
        
        
        
        for (int i = 0; i <  Aluno.qtde; i++) {
            System.out.println("Lista dos alunos\n" + "Nome: " + alunos[i].getNome()+
                            "Matricula: " + alunos[i].getMatricula());
        }
         
        
    }
        
       
    
}
