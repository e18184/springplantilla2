/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteTerceroData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.TerceroPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Persona lmodeloPersona = modelo.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			modelo.PersonaDAO.delete(lmodeloPersona);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTerceroData deleteTerceroData = new DeleteTerceroData();
			try {
				deleteTerceroData.deleteTestData();
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
