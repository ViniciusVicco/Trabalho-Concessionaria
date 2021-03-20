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
@RequestScoped
public class ConcessionariaController {

	/**
	 * 
	 */
//	private static final long serialVersionUID = -2128491689568745249L;
	private Veiculo veiculo;
	private List<Veiculo> listaVeiculos;
	private Integer id = 0;
	private boolean disabled = true;

//	public Carroceria[] getListaCarroceria() {
//		return Carroceria.values();
//	}

	public void inserir() {
		getVeiculo().setId(id);
		listaVeiculos.add(getVeiculo());
		System.out.println(veiculo.toString());
		limpar();
		id++;
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Inclusão realizada com sucesso", null));
	}

	public void editar() {
		if (veiculo != null || listaVeiculos.size() == 0) {
			int index = getListaVeiculos().indexOf(veiculo);
			if (index == -1) {
				return;
			} else {
				getListaVeiculos().set(index, getVeiculo());
			}

		}

		return;
	}

	public void excluir(Veiculo vei) {
		listaVeiculos.remove(vei);
		limpar();

	}

	public void limpar() {
		setVeiculo(null);

	}

	public void selecionar(Veiculo paramVeiculo) {
		setVeiculo(paramVeiculo);
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
