package com.generation.produto.model;

public class DadosProdutos 
{
	private String produto;
	private String fabricante;
	private String modelo;
	private String camera;
	private String memoriaint;
	private String memoriaram;
	
	public DadosProdutos(String produto, String fabricante, String modelo, String camera, String memoriaint,
			String memoriaram) 
	{
		super();
		this.produto = produto;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.camera = camera;
		this.memoriaint = memoriaint;
		this.memoriaram = memoriaram;
	}
	public String getProduto() 
	{
		return produto;
	}
	public void setProduto(String produto) 
	{
		this.produto = produto;
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
	
	public String getCamera() 
	{
		return camera;
	}
	public void setCamera(String camera) 
	{
		this.camera = camera;
	}
	
	public String getMemoriaint() 
	{
		return memoriaint;
	}
	public void setMemoriaint(String memoriaint) 
	{
		this.memoriaint = memoriaint;
	}
	
	public String getMemoriaram() {
		return memoriaram;
	}
	public void setMemoriaram(String memoriaram) 
	{
		this.memoriaram = memoriaram;
	}
	public void visualizar()
	{
		System.out.println("\n*********************");
		System.out.println("Tipo de produto: " + produto);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Modelo: " + modelo);
		System.out.println("Câmera: " + camera);
		System.out.println("Memória Interna: "+ memoriaint);
		System.out.println("Memória RAM: " + memoriaram);
	}
}
