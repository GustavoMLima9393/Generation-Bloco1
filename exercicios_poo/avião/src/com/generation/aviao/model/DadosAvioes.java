package com.generation.aviao.model;

public class DadosAvioes 
{
	private String fabricante;
	private String modelo;
	private String matricula;
	private String empresa;
	private int capacidade;
	private String regioes;
	private String manutencao;
	
	public DadosAvioes(String fabricante, String modelo, String matricula, String empresa, int capacidade, String regioes,
			String manutencao) 
	{
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.matricula = matricula;
		this.empresa = empresa;
		this.capacidade = capacidade;
		this.regioes = regioes;
		this.manutencao = manutencao;
	}
	
	public String getFabricante() 
	{
		return fabricante;
	}
	public void setFabricante(String fabricante) 
	{
		this.fabricante = fabricante;
	}
	
	public String getModelo() 
	{
		return modelo;
	}	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public String getMatricula() 
	{
		return matricula;	
	}
	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}

	public String getEmpresa() 
	{
		return empresa;
	}
	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}
	
	public int getCapacidade() 
	{
		return capacidade;
	}
	public void setCapacidade(int capacidade) 
	{
		this.capacidade = capacidade;
	}

	public String getRegioes() 
	{
		return regioes;
	}
	public void setRegioes(String regioes) 
	{
		this.regioes = regioes;
	}

	public String getManutencao() 
	{
		return manutencao;
	}
	public void setManutencao(String manutencao) 
	{
		this.manutencao = manutencao;
	}
	public void visualizar()
	{
		System.out.println("\n*********************");
		System.out.println("Fabricante da aeronave: " + fabricante);
		System.out.println("Modelo da aeronave: " + modelo);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Empresa: " + empresa);
		System.out.println("Capacidade de tripulantes: "+ capacidade);
		System.out.println("Regiões de operação: " + regioes);
		System.out.println("Empresa de manutenção: " + manutencao);

	}
}
