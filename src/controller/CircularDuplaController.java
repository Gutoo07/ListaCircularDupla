package controller;
import model.CircularDupla;
import model.No;

public class CircularDuplaController {
	public CircularDuplaController() {
		super();
	}
	public String teste() throws Exception {
		CircularDupla lista = new CircularDupla<>();
		
		lista.append(1);
		lista.append(2);
		lista.append(3);
		lista.append(6);
		lista.append(9);
		
		lista.remove(lista.getLast());

		return lista.toString();
	}
}