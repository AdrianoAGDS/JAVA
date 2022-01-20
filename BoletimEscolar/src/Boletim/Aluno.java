package Boletim;

public class Aluno {

	//Atributos da classe Boletim
		private String nome;
		private String sobreNome;
		private String curso;
		private double notaTrabalho;
		private double notaPesquisa;
		private double avaliacaoBimestral;
		private double avaliacaoSemestral;
		
		//Retorna o nome completo
		public void setNome (String nome)
		{
			this.nome = nome;
		}
		
		//Get retorna o Nome
		public String getNome ()
		{
			return this.nome;
		}
		
		//Get retorna o Curos
		public String getCurso ()
		{
			return this.curso;
		}
						
		//Retorna o nome do Curso
		public void setCurso (String curso)
		{
			this.curso = curso;
		}
							
		
		//Retorna a media escolar
		public double getMediaEscolar ()
		{
			double valor = 0;
			
			valor = this.notaTrabalho + notaPesquisa + avaliacaoBimestral + avaliacaoSemestral / 4;
					
			return valor;		
 		}
		
	
	
		
		
		//Retorna o Boletim Escolar
		public double getBoletimEscolar (double Boletim)
		{
			double media = 0;
				
			media = this.notaTrabalho + notaPesquisa + avaliacaoBimestral + avaliacaoSemestral / 4;
			
			return media;
		}
}



