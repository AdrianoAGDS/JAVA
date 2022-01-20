package controleProdutos;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {
	


	public static void main(String[] args) throws ParseException {
		//Instancia da Classe Scanner
		Scanner input = new Scanner(System.in);
		
		//Instancia da Classe Professor
		ControleProdutos ControleProdutos = new ControleProdutos();
		
		System.out.println("Digite o nome do Produto: ");
		ControleProdutos.setNome (input.next());

		System.out.println("Cor do Produto: ");
		ControleProdutos.setCor (input.next());
		
		System.out.println("Quantidade: ");
		ControleProdutos.setQuantidade(input.nextDouble());

		System.out.println("Descrição do Produto: ");
		ControleProdutos.setDescricao (input.next());		
		
		System.out.println("Valor da Compra: ");
		ControleProdutos.setValorCompra (input.nextDouble());	
		
				
		System.out.println ("############# RESUMO GERAL DE PRODUTOS ##############");
		System.out.println("Produto: "+ControleProdutos.getNome());
		System.out.println("Cor do Produto: "+ ControleProdutos.getCor());
		System.out.println("Disponivel em Estoque: " + ControleProdutos.getVerificarEstoque(null));
		System.out.println("Valor Comprado: R$"+ ControleProdutos.getValorCompra());
		System.out.println("Data da Compra:"+ ControleProdutos.getProduto(null));
		System.out.println("Valor de Venda: R$"+ ControleProdutos.gerarValorVenda(0));
		System.out.println("Descrição do Produto:"+ ControleProdutos.getDescricao());
		System.out.println("#################################################");
		
		
	}

}
