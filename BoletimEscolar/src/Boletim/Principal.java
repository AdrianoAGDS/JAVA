package Boletim;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		String m = null;
		
		double valor1 = 0; 
		double valor2 = 0;
		double valor3 = 0;
		double valor4 = 0;
		
		double media = 0;
		
		String a = null;
		
		
		//Instancia da Classe Scanner
		Scanner input = new Scanner(System.in);
		
		//Instancia da Classe Professor
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome: ");
		aluno.setNome (input.next());
		
		System.out.println("Digite o Curso: ");
		aluno.setCurso(input.next());
		
		System.out.println("Matéria:");
		m = input.next();
		
		System.out.println("notaTrabalho:");
		valor1 = input.nextInt();
		
		System.out.println("notaPesquisa:");
		valor2 = input.nextInt();
		
		System.out.println("avaliacaoBimestral:");
		valor3 = input.nextInt();
		
		System.out.println("avaliacaoSemestral:");
		valor4 = input.nextInt();
		
		media = (valor1 + valor2 + valor3 + valor4 )/4;
	
		if (media >= 6) {
			  a = "Aluno Aprovado";
					
		} else {
			 a = "Aluno Reprovado";
		}
		
		
		
		System.out.println ("############# BOLETIM ESCOLAR ##############");
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Curso: "+aluno.getCurso());
		System.out.println("Matéria: "+m);
		System.out.println("Média: "+media);
		System.out.println("Status Final: "+a);
		System.out.println("#################################################");
		
		
	}

}
