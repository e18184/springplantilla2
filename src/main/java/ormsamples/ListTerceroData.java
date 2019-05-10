/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListTerceroData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Persona...");
		modelo.Persona[] modeloPersonas = modelo.PersonaDAO.listPersonaByQuery(null, null);
		int length = Math.min(modeloPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modeloPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Persona by Criteria...");
		modelo.PersonaCriteria lmodeloPersonaCriteria = new modelo.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloPersonaCriteria.ru.eq();
		lmodeloPersonaCriteria.setMaxResults(ROW_COUNT);
		modelo.Persona[] modeloPersonas = lmodeloPersonaCriteria.listPersona();
		int length =modeloPersonas== null ? 0 : Math.min(modeloPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTerceroData listTerceroData = new ListTerceroData();
			try {
				listTerceroData.listTestData();
				//listTerceroData.listByCriteria();
			}
			finally {
				modelo.TerceroPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
