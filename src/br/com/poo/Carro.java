package br.com.poo;

public class Carro {
	
	//Atributos
	private String nome;
	private String marca;
	private int ano;
	private int vel;
	
	//methods
	
	public void acelerar(int aceleracao) {
		System.out.println("Acelerando");
		this.vel += aceleracao;
	}
	
	public void frer(int reduzir) {
		System.out.println("Freando ");
		this.vel -= reduzir;
	}
	
	public void buzinar() {
		System.out.println("Buzinado");
	}
	
	//Getters e Setters
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVel() {
		return this.vel;
	}
	
	
	
	
	
}
