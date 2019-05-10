/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package modelo;

/**
 * Datos de una persona
 */
public class Persona {
	public Persona() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Persona))
			return false;
		Persona persona = (Persona)aObj;
		if ((getRu() != null && !getRu().equals(persona.getRu())) || (getRu() == null && persona.getRu() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getRu() == null ? 0 : getRu().hashCode());
		return hashcode;
	}
	
	private String ru;
	
	private String nombre;
	
	private String ap;
	
	private String am;
	
	private int edad;
	
	public void setRu(String value) {
		this.ru = value;
	}
	
	public String getRu() {
		return ru;
	}
	
	public String getORMID() {
		return getRu();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAp(String value) {
		this.ap = value;
	}
	
	public String getAp() {
		return ap;
	}
	
	public void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return am;
	}
	
	public void setEdad(int value) {
		this.edad = value;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		return String.valueOf(getRu());
	}
	
}
