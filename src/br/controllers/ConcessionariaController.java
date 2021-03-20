package br.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.enums.Carroceria;
import br.models.Veiculo;

@Named
@ViewScoped
public class ConcessionariaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2128491689568745249L;
	private Veiculo veiculo;
	private List<Veiculo> listaVeiculos;
	private Integer id = 0;
	private boolean disabled = true;

	public Carroceria[] getListaCarroceria() {
		return Carroceria.values();
	}

	
	public void inserir() {
		getVeiculo().setId(id);
		listaVeiculos.add(getVeiculo());
		System.out.println(veiculo.toString());
		limpar();
		id++;
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Inclusão realizada com sucesso", null));
	}

	public void editar(Veiculo vei) {
		setVeiculo(vei);
	}

	public void excluir(Veiculo vei) {
		listaVeiculos.remove(vei);
		limpar();

	}
	
	public void alterar() {
		if(listaVeiculos == null) {
			System.out.print("Lista veiculo ta nula");
		}
		if (veiculo != null || listaVeiculos.size() == 0) {
			int index = listaVeiculos.indexOf(veiculo);
			if (index == -1) {
				System.out.println("Objeto veiculo não foi encontrado");
				System.out.println(listaVeiculos.size());
				return;
			} else {
				getListaVeiculos().set(index, getVeiculo());
			}

		}
		limpar();
		return;
	}	
			

	public void limpar() {
		setVeiculo(null);

	}


	public Veiculo getVeiculo() {
		if (veiculo == null) {
			veiculo = new Veiculo();
		}
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Veiculo> getListaVeiculos() {
		if (listaVeiculos == null) {
			listaVeiculos = new ArrayList<Veiculo>();
		}
		return listaVeiculos;
	}
	public void setListaVeiculos(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}



}
