package com.generation.clientes.model;

public class Clientes 
{
	private int id;
	private String cpf;
	private String nome;
	private String endere�o;
	private String email;
	private int telefone;
	
	public Clientes(int id, String cpf, String nome, String endere�o, String email, int telefone)
	{
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endere�o = endere�o;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void visualizar()
	{
		System.out.println("\nC�digo do cliente: " + id);
		System.out.println("CPF do cliente: " + cpf);
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Endere�o do cliente: " + endere�o);
		System.out.println("E-mail do cliente: "+ email);
		System.out.println("Telefone do cliente: " + telefone);

	}
}