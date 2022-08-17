package com.generation.funcionario.model;

public class DadosFuncionario 

{
	private int id;
	private String nome;
	
	public DadosFuncionario(int id, String nome, String cpf, String endereco, String email, int telefone, int numCtps) 
	{

		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.numCtps = numCtps;
	}
	private String cpf;
	private String endereco;
	private String email;
	private int telefone;
	private int numCtps;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public int getNumCtps() {
		return numCtps;
	}
	public void setNumCtps(int numCtps) {
		this.numCtps = numCtps;
	}
	public void visualizar()
	{
		System.out.println("\n*********************");
		System.out.println("N�mero do funcion�rio: " + id);
		System.out.println("*********************");
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("CPF do funcion�rio: " + cpf);
		System.out.println("Endere�o do funcion�rio: " + endereco);
		System.out.println("E-mail do funcion�rio: "+ email);
		System.out.println("Telefone do paciente: " + telefone);
		System.out.println("N�mero CTPS: " + numCtps);
	}
}

