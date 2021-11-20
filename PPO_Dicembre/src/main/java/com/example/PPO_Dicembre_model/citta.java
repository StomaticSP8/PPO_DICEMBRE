package com.example.PPO_Dicembre_model;

public class citta {
	private String nome;
private  String numero_abitanti;
	
	public citta (String nome,  String numero_abitanti) {
		this.nome=nome;
		this.numero_abitanti=numero_abitanti;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero_abitanti() {
		return numero_abitanti;
	}

	public void setNumero_abitanti(String numero_abitanti) {
		this.numero_abitanti = numero_abitanti;
	}

}
