package br.enums;

public enum Carroceria {
	HATCH(1, "Hatch"),
	SEDAN(2, "Sedã"),
	PICAPE(3, "Picape"),
	SUV(4, "Suv");
	
	private int index;
	private String label;
	
	Carroceria(int index, String label) {
		this.index = index;
		this.label = label;
	}


	public String getLabel() {
		return label;
	}


	public int getIndex() {
		return index;
	}


	

}
