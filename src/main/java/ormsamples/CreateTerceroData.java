/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateTerceroData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelo.TerceroPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Persona lmodeloPersona = modelo.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : edad, ru
			modelo.PersonaDAO.save(lmodeloPersona);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTerceroData createTerceroData = new CreateTerceroData();
			try {
				createTerceroData.createTestData();
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
