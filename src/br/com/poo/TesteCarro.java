package br.com.poo;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		carro.acelerar(10);
		System.out.println("A velocidade do carro atual é de: " + carro.getVel());
		carro.buzinar();
		carro.frer(9);
		System.out.println("A velocidade do carro atual é de: " + carro.getVel());	
		carro.setNome("C4");	
		System.out.println(carro.getNome());
	
	
	
	
	
	}
	

}
