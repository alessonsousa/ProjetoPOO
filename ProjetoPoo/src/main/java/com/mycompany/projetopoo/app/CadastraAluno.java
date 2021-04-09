package com.mycompany.projetopoo.app;


import com.mycompany.projetopoo.Aluno;
import java.util.Scanner;


public class CadastraAluno {
    
    public void CAluno() {
        String nome;
        
        Aluno aluno = new Aluno();
        
        

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nome = ler.next();
        
       aluno.getNome() = nome;
        
        System.out.println("Depois" + nome);
          
        
       

    }

}