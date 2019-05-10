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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ru;
	public final StringExpression nombre;
	public final StringExpression ap;
	public final StringExpression am;
	public final IntegerExpression edad;
	
	public PersonaDetachedCriteria() {
		super(modelo.Persona.class, modelo.PersonaCriteria.class);
		ru = new StringExpression("ru", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ap = new StringExpression("ap", this.getDetachedCriteria());
		am = new StringExpression("am", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.PersonaCriteria.class);
		ru = new StringExpression("ru", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ap = new StringExpression("ap", this.getDetachedCriteria());
		am = new StringExpression("am", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

