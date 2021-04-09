/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo.app;


import com.mycompany.projetopoo.Aluno;
import java.util.Scanner;

public class App {
  
    public static void menu(){
        System.out.println("\tCadastro de clientes");
        System.out.println("1 - CADASTRA ALUNO");
        System.out.println("2 - CADASTRA TURMA");
        System.out.println("3 - MATRICULAR");
        System.out.println("4 - LISTAR ALUNOS");
        System.out.println("5 - LISTAR TURMAS");
        System.out.println("6 - LISTAR MATRICULAS");
        System.out.println("7 - SAIR");
        System.out.println("Opcao: ");
    }

    
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
       
        
        CadastraTurma cadTurma;
        cadTurma = new CadastraTurma();
        
        CadastraAluno cadAluno;
        cadAluno = new CadastraAluno();
        
        ListarAluno listAluno;
        listAluno = new ListarAluno();
        
        ListarTurma listTurma;
        listTurma = new ListarTurma();
        
        ListarMatricula listMatricula;
        listMatricula = new ListarMatricula();
        
        Matricular matricula;
        matricula = new Matricular();
                
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
             cadAluno.CAluno();
             
                break;
                
            case 2:
             cadTurma.CTurma();
          
                break;
                
            case 3:
               matricula.matriculas();
                break;
                
            case 4:
               listAluno.Laluno(alunos);
                break;
                
            case 5:
                listTurma.Lturma();
                break;
                
            case 6:
                listMatricula.Lmatricula();
                break;

            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }

 
}





/*
 public static void main(String[] args){
        Aluno[] alunos = new Aluno[10];
        int opcao = 7;
        Scanner teclado = new Scanner(System.in);
       
        do{

            
            menu();
            opcao = Integer.parseInt(teclado.nextLine());
            
            if(opcao==1){
                System.out.println("Digite o nome do aluno: ");
                String nome = teclado.nextLine();
                System.out.println("Digite a matricula: ");
                String matricula = teclado.nextLine();
              //  System.out.println(Aluno.qtde);
                alunos[Aluno.qtde] = AlunoControle.cadastrarAluno(nome, matricula);
                
            }else if(opcao==4){
                listarAlunos(alunos);
            }
            
        }while(opcao!=7);

    }
    
    public static void menu(){
        System.out.println("Menu\n" +
                        "---------------------------------\n" +
                        "1 – Cadastrar Aluno\n" +
                        "2 – Cadastrar Turma\n" +
                        "3 – Matricular\n" +
                        "4 – Listar Alunos\n" +
                        "5 – Listar Turmas\n" +
                        "6 – Listar Matrículas\n" +
                        "7 – Sair\n" +
                        "---------------------------------\n" +
                        "\n" +
                        "Digite a opção: ");
    }
    
    public static void listarAlunos(Aluno[] alunos){
        System.out.println("\n\n---------LISTANDO OS ALUNOS CADASTRADOS -----------\n");
        for(int i=0; i<Aluno.qtde; i++){
            System.out.println("Nome: " + alunos[i].getNome());
        }
        
    }
    
}
*/