/**
 * 
 */
package controleProdutos;

import java.util.Date;

/**
 * @author AdrianoSantos
 *
 */
public class ControleProdutos {

	//Atributos da classe ControleProdutos
		private String nome;
		private String descricao;
		private String cor;
		private double quantidade;
		private double valorCompra;
		private Date dataCadastro;
		
		//Set Nome
		public void setNome (String nome)
		{
		  this.nome = nome;
		}				
		//Get Nome
		public String getNome ()
		{
		 return this.nome;
		 
		}
		
		
		
		//Get Decrição
		public void setDescricao (String descricao)
		{
	    this.descricao = descricao;
		}				
		//Set Descrição
		public String getDescricao ()
		{
		return this.descricao;
		}	
		
		
		
		//Set Cor
		public void setCor (String cor)
		{
		 this.cor = cor;
		}						
		//Get Cor
		public String getCor ()
		{
		return this.cor;
		}
		
		
		//Set Quantidade
		public void setQuantidade1 (double quantidade)
		{
	   this.quantidade = quantidade;
	    }						
				
		
		//set - Quantidade
		public void setQuantidade (double valor)
		{
			this.quantidade = valor;
		}
		
		
		
		//set - Valo Compra
		public void setValorCompra (double valor)
		{
			this.valorCompra = valor;
		}
		
		//Get Valor Compra
		public double getValorCompra ()
	    {
		  return this.valorCompra;
		
	    }
		
		//set - Valo Compra
		public void setdataCadastro (Date data)
		{
		this.dataCadastro = data;
		}
				
		//Get Valor Compra
		public Date getdataCadastro ()
		{
	     return this.dataCadastro;				
	    }
		
		

		
		//Retorna o salario mensal do professor
		public String getVerificarEstoque (String produto) 
		{
			double valor = 0;
        	String mensagem = null;
			
			//Calcula a quantidade
			valor = this.quantidade + valor;
			
			if(valor == 0) {
	         mensagem =	"Não há estoque para esse produto.";
						} else { mensagem = "Produto em estoque, temos(s) "+valor+" unida(s).";
				}
			
			return mensagem;
		}
		
		
		//Valor Comprado 
		public double gerarValorVenda (double preco) {
			double valor = 0;
			
			valor = this.valorCompra * 1.5;
			
			return valor;
		}	
		
	
		//Valor data
		public Date getProduto (Date data) {
			
			data = new Date();
			
			return data;
		}

			
}
