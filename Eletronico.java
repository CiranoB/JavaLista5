package Familia52;

public class Eletronico {
	private String categoria;
	private String modelo;
	private int memoriaRam;
	private int memoriaInterna;
	
	public Eletronico (String categoria, String modelo, int memoriaRam, int memoriaInterna) {
		this.categoria = categoria;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.memoriaInterna = memoriaInterna;
	}
	
	public void imprimirInfo() {
		System.out.println("Categoria do produto: "+categoria);
		System.out.println("Modelo do produto: "+modelo);
		System.out.println("Quantidade de memória RAM: "+memoriaRam);
		System.out.println("Quantidade de memória interna:  "+memoriaInterna);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}
	
	
	
}
