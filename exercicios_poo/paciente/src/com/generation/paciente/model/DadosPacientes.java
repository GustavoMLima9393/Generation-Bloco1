package com.generation.paciente.model;

public class DadosPacientes
{
	private int id;
	private String cpf;
	private String nome;
	private String endereço;
	private String email;
	private int telefone;
	private String suspeita;
	private String convenio;
	
	public DadosPacientes(int id, String cpf, String nome, String endereço, String email, int telefone, String suspeita,
			String convenio) 
	{
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
		this.suspeita = suspeita;
		this.convenio = convenio;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public String getSuspeita() {
		return suspeita;
	}

	public void setSuspeita(String suspeita) {
		this.suspeita = suspeita;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public void visualizar()
	{
		System.out.println("\n*********************");
		System.out.println("Código do paciente: " + id);
		System.out.println("*********************");
		System.out.println("CPF do paciente: " + cpf);
		System.out.println("Nome do paciente: " + nome);
		System.out.println("Endereço do paciente: " + endereço);
		System.out.println("E-mail do paciente: "+ email);
		System.out.println("Telefone do paciente: " + telefone);
		System.out.println("Suspeita de enfermidade: " + suspeita);
		System.out.println("Convênio médico: " + convenio);
	}
}
