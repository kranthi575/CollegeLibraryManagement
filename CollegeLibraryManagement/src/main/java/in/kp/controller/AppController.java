package in.kp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kp.model.Book;
import in.kp.model.Managment;
import in.kp.model.Student;
import in.kp.objectFactory.ServiceFactory;
import in.kp.service.IService;
import in.kp.service.ServiceImple;


@WebServlet("/controller/*")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AppController() {
        super();
        
    }
    
    public static void studLogin(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("StudLogin called");
    }
    public static void studRegister(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("studRegister called");
    	
    	String sid=request.getParameter("sid");
    	String sname=request.getParameter("sname");
    	String smail=request.getParameter("smail");
    	String spwd=request.getParameter("spwd");
    	
    	
    	Student stud=new Student();
    	stud.setSid(sid);
    	stud.setSname(sname);
    	stud.setSmail(smail);
    	stud.setSpwd(spwd);
    	
    	IService service=ServiceFactory.getService();
    	String msg=service.addUser(stud);
    	System.out.println(msg);
    	
    }
    public static void mangLogin(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("mangLogin called");
    	String mid=request.getParameter("mid");
    	String mpwd=request.getParameter("mpwd");
    	
    	IService service=ServiceFactory.getService();
    	String msg=service.checkMLogin(mid, mpwd);
    	System.out.println(msg);
    	if(msg.equals("Login successful")) {
    		RequestDispatcher reqDp=request.getRequestDispatcher("../managementhome.jsp");
    		
    		try {
				reqDp.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public static void mangRegister(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("mangRegister called");
    	String mid=request.getParameter("mid");
    	String mname=request.getParameter("mname");
    	String memail=request.getParameter("memail");
    	String mpwd=request.getParameter("mpwd");
    	
    	
    	Managment mang=new Managment();
    	mang.setMid(mid);
    	mang.setMname(mname);
    	mang.setMemail(memail);
    	mang.setMpwd(mpwd);
    	
    	IService service=ServiceFactory.getService();
    	String msg=service.addMang(mang);
    	System.out.println(msg);
    	
    }
    public static void MangAddBook(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("management adding book to book catalog");
    	
    	String bid=request.getParameter("bid");
    	String btitle=request.getParameter("btitle");
    	String bauthor=request.getParameter("bauthor");
    	String bcategory=request.getParameter("bcategory");
    	
    	Book book=new Book();
    	book.setBid(bid);
    	book.setBtitle(btitle);
    	book.setBauthor(bauthor);
    	book.setBcategory(bcategory);
    	
    	IService service=ServiceFactory.getService();
    	String msg=service.mangAddBook(book);
    	System.out.println(msg);
    	
    }
    public static void SearchBook(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("searchBook called");
    	String attribute=request.getParameter("attribute");
    	String val=request.getParameter("value");
    	
    	IService service=ServiceFactory.getService();
    	List<Book> books=service.searchBook(attribute, val);
    	for(Book book: books) {
    		System.out.println(book.toString());
    	}
    	
    }
    public static void DeleteBook(HttpServletRequest request,HttpServletResponse response) {
    	
    	//String bid=request.getParameter("bid");
    	String bid="12f3";
    	IService service=ServiceFactory.getService();
    	String msg=service.deleteBook(bid);
    	
    	System.out.println(msg);
    	
    	
    }
    public static void MangAddBookStud(HttpServletRequest request,HttpServletResponse response) {
    	
//    	String sid=request.getParameter("sid");
//    	String bid=request.getParameter("bid");
    	String sid="1w23";
    	String bid="ewrr3";
    	
    	IService service=ServiceFactory.getService();
    	String msg=service.mangAddBookStud(sid, bid);
    	
    	System.out.println(msg);
    	}
    public static void MangRemoveBookStud(HttpServletRequest request,HttpServletResponse response) {
    	
    	String sid=request.getParameter("sid");
    	int fine=checkFine(sid);
    }
    public static int checkFine(String sid) {
    	
    	return 0;
    }
    
    public void doProcess(HttpServletRequest request,HttpServletResponse response) {
    	
    	String uri=request.getRequestURI();
    	
    	System.out.println(uri);
    	
    	if(uri.endsWith("studlogin")) { studLogin(request,response);}
    	if(uri.endsWith("studregister")) { studRegister(request,response);}
    	if(uri.endsWith("manglogin")) { mangLogin(request,response);}
    	if(uri.endsWith("mangregister")) { mangRegister(request,response);}
    	if(uri.endsWith("mangaddbook")) {MangAddBook(request,response);}
    	if(uri.endsWith("searchBook")) {SearchBook(request,response);}
    	if(uri.endsWith("deleteBook")) {DeleteBook(request,response);}
    	if(uri.endsWith("mangaddbookstud")) {MangAddBookStud(request,response);}
    	if(uri.endsWith("mangremovebookstud")) {MangRemoveBookStud(request,response);}
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
