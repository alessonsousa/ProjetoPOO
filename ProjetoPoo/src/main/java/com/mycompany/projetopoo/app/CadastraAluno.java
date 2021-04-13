package com.mycompany.projetopoo.app;


import com.mycompany.projetopoo.Aluno;
import com.mycompany.projetopoo.controle.AlunoControle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CadastraAluno {
    
    public void CAluno() {
        
        Scanner ler = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();        
    
        System.out.println("Digite o nome do aluno: ");
               String nome = ler.nextLine();
                System.out.println("Digite a matricula: ");
                String matricula = ler.nextLine();
                
                Aluno a = AlunoControle.cadastrarAluno(nome, matricula);
                alunos.add(a);
                

        
       

    }

}