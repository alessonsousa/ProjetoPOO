package com.mycompany.projetopoo.app;


import com.mycompany.projetopoo.Aluno;
import com.mycompany.projetopoo.controle.AlunoControle;
import java.util.Scanner;


public class CadastraAluno {
    
    public void CAluno() {
        String nome;
        String matricula; 
        Scanner ler = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        
    
        System.out.println("Digite o nome do aluno: ");
                nome = ler.nextLine();
                System.out.println("Digite a matricula: ");
                matricula = ler.nextLine();
        
                alunos[Aluno.qtde] = AlunoControle.cadastrarAluno(nome, matricula);

        
       

    }

}