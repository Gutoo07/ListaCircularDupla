package model;
import java.lang.Exception;
import model.No;

public class CircularDupla<T> {
	private No<T> ultimo_elemento = null;
	
	public void append (T elemento) {
		No<T> novo = new No<>(elemento);
	}
}
