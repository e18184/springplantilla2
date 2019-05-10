/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTerceroData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = modelo.TerceroPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Persona lmodeloPersona = modelo.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.PersonaDAO.save(lmodeloPersona);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona by PersonaCriteria");
		modelo.PersonaCriteria lmodeloPersonaCriteria = new modelo.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloPersonaCriteria.ru.eq();
		System.out.println(lmodeloPersonaCriteria.uniquePersona());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTerceroData retrieveAndUpdateTerceroData = new RetrieveAndUpdateTerceroData();
			try {
				retrieveAndUpdateTerceroData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTerceroData.retrieveByCriteria();
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
