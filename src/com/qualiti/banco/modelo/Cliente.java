package com.qualiti.banco.modelo;



public class Cliente extends Pessoa implements Comparable<Cliente>{
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public int compareTo(Cliente o) {
		return getNome().compareTo(o.getNome());
	}
	
	public static void main(String[]args){
		Cliente[] clientes = new Cliente[2];
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Zé Maria");
		

		Cliente cli2 = new Cliente();
		cli2.setNome("Ana");
		
		clientes[0] = cli1;
		clientes[1] = cli2;
		
		for(Cliente cli : clientes){
			System.out.println(cli.getNome());
		}
		
	}
	
	
	
}
