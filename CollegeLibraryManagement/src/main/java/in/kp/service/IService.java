package in.kp.service;

import java.util.List;

import in.kp.model.Book;
import in.kp.model.Managment;
import in.kp.model.Student;

public interface IService {

	String addUser(Student student);
	String checkSLogin();
	
	String addMang(Managment management);
	String mangAddBook(Book book);
	List<Book> searchBook(String attribute,String value);
	String deleteBook(String bid);
	String checkMLogin(String id,String pwd);
	String mangAddBookStud(String sid,String bid);
	Integer checkFine(String sid);
	
	
}
