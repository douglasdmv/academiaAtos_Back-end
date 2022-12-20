package com.douglasviegas.projetoServlet.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.douglasviegas.projetoServlet.entity.User;

public class LoginRepository {
	
	public SessionFactory sessionFactory;
	
	public boolean setup() {
		Configuration config = new Configuration();
		
		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/BASE_DADOS");
        config.setProperty("hibernate.connection.username", "usuario");
        config.setProperty("hibernate.connection.password", "senha");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        
        config.addAnnotatedClass(User.class);
        
        try {
        	sessionFactory = config.buildSessionFactory();
        	return true;
        } catch (Exception ex) {
        	return false;
        }
	}
	
	public void close() {
		sessionFactory.close();
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		setup();
		Session session = sessionFactory.openSession();
		
		try {
			String query = String.format("from User where username = '%s' and password = '%s'", username, password);
			User user = session.createQuery(query,User.class).getSingleResult();
			
			session.close();
			
			return user;
		} catch(Exception ex) {
			return null;
		}
	}
}
