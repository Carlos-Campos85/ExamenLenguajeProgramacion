package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Listar {

	public static void main(String[] args) {
		
				
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CasoPractico");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createQuery("SELECT r FROM Subject r");
		
		query.getResultList();
		
		List<Subject> subjectList = query.getResultList();
		
		for(Subject r: subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
		
	}
	
		
	

}
