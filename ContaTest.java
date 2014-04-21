package br.com.rick.POO;

public class ContaTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Bem vindo vamos testar um codigo?");
		System.out.println("-------------------------------------------------- ");
		Conta vrConta = new Conta();
		
		vrConta.Cliente = "Ricardo";
		vrConta.saldo = 10_000.00;
		vrConta.exibeSaldo();
		
		Conta vrDestino = new Conta();
		vrDestino.Cliente = "Rick";
		vrDestino.saldo = 8_000.00;
		vrDestino.exibeSaldo();
		
		
		
		
	}

}
