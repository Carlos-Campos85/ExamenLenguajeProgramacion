package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Update {

	public static void main(String[] args) {
		SubjectDao  dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setIdsubject(1);
		subject.setSubject("autobus");
		subject.setCredits("dos");
		
		dao.update(subject);
		
	List<Subject> subjectList = dao.findAll();
		
		
			System.out.println(subject.getIdsubject());
			System.out.println(subject.getSubject());
			System.out.println(subject.getCredits());
		}
		
	

}
