package main.java.ieseuropa;

import java.util.ArrayList;

public class Columna {
	
	private ArrayList<Carta> cartas;
	private Palo palo;
	
	public Columna() {
		cartas = new ArrayList<>();
		palo = null;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	@Override
	public boolean equals(Object o) {
		if (palo == ((Columna) o).palo) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Columna [cartas=" + cartas + ", palo=" + palo + "]";
	}

}
