package br.ufal.ic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static SessionFactory factory;
        
    static {
    	//Bloco estatico que inicializa o Hibernate
    	try {
       		
    		
    	factory = new Configuration().configure().buildSessionFactory();
    	
    	} catch (Exception e) {
    		
    		e.printStackTrace();
    		factory = null;
    	}
    }
    
    public static Session getSession() {
        //Retorna a sessão aberta
    	return factory.openSession();
        
    }
    
}
