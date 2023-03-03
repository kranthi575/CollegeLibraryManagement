package in.kp.objectFactory;

import in.kp.dao.DaoImple;
import in.kp.dao.IDao;

public class DaoFactory {

	public static IDao Dao=null;
	
	public static IDao getDao() {
		if(Dao==null) {
			Dao=new DaoImple();
		}
		return Dao;
	}
}
