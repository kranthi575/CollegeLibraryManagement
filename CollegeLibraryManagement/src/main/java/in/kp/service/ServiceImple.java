package in.kp.service;

import java.util.List;

import in.kp.dao.IDao;
import in.kp.model.Book;
import in.kp.model.Managment;
import in.kp.model.Student;
import in.kp.objectFactory.DaoFactory;

public class ServiceImple implements IService {

	@Override
	public String addUser(Student student) {
		IDao dao=DaoFactory.getDao();
		String msg=dao.addUser(student);
		return msg;
	}

	@Override
	public String addMang(Managment management) {
		IDao dao=DaoFactory.getDao();
		String msg=dao.addMang(management);
		return msg;
	}

	@Override
	public String mangAddBook(Book book) {
		IDao dao=DaoFactory.getDao();
		String msg=dao.mangAddBook(book);
		return msg;
	}

	@Override
	public List<Book> searchBook(String attribute,String value) {
		
		IDao dao=DaoFactory.getDao();
		List<Book> books=dao.searchBook(attribute, value);
		return books;
	}

	@Override
	public String deleteBook(String bid) {
		IDao dao=DaoFactory.getDao();
		String msg=dao.deleteBook(bid);
		return msg;
	}

	@Override
	public String checkSLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkMLogin(String id,String pwd) {
		
		IDao dao=DaoFactory.getDao();
		String msg=dao.checkMLogin(id, pwd);
		return msg;
	}
	@Override
	public String mangAddBookStud(String sid,String bid) {
		IDao dao=DaoFactory.getDao();
		String msg=dao.mangAddBookStud(sid, bid);
		return msg;
	}
	@Override
	public Integer checkFine(String sid) {
		return 0;
	}

}
