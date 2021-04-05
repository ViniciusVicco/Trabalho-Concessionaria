package br.models;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import br.enums.Carroceria;



public class Veiculo implements Cloneable {
	private Integer id;
	@NotNull
	private String modelo;
	@NotNull
	private String marca;
	@NotNull
	private String cor;
	@Past(message = "A data não pode ser superior a data atual")
	private LocalDate ano;
	@NotNull
	private String versao;
	private Carroceria carroceria;
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public LocalDate getAno() {
		return ano;
	}
	public void setAno(LocalDate ano) {
		this.ano = ano;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano
				+ ", versao=" + versao + ", categoria=" + carroceria + "]";
	}

	public Veiculo getClone() {
		try {
			return (Veiculo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
}
