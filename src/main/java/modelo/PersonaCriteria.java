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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaCriteria extends AbstractORMCriteria {
	public final StringExpression ru;
	public final StringExpression nombre;
	public final StringExpression ap;
	public final StringExpression am;
	public final IntegerExpression edad;
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		ru = new StringExpression("ru", this);
		nombre = new StringExpression("nombre", this);
		ap = new StringExpression("ap", this);
		am = new StringExpression("am", this);
		edad = new IntegerExpression("edad", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(TerceroPersistentManager.instance().getSession());
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

