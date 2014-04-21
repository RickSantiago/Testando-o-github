package br.com.rick.POO;

public class Conta 
{
	String Cliente;
	double saldo;
	
	void exibeSaldo()
	{
		System.out.println(Cliente + " Seu saldo é " + saldo);
	}
	
	 void saca(double valor)
	{
		saldo -= valor;
	}
	void deposito(double valor)
	{
		saldo+= valor;
	}
	 void transferePara(Conta destino, double valor)
	{
		saca(valor);
		{
			
		}
		destino.deposito(valor);
		
	}
}
