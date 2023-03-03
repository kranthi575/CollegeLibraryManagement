package in.kp.objectFactory;

import in.kp.service.IService;
import in.kp.service.ServiceImple;

public class ServiceFactory {
	
	public static IService service=null;
	
	public static IService getService() { 
		
		if(service==null) {
			service=new ServiceImple();
		}
		return service;
	}
}
