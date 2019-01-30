package modelo;

import com.qualiti.algoritmos.aula1.Endereco;

public class TesteBanco {

	public static void main(String[] args) {
		
		conta c1 = new Conta();
		c1.setNumero("123");
		c1.setSaldo(9000);
		c1.creditar(1000);
		
		System.out.println(c1.getSaldo());
		

	}

}
