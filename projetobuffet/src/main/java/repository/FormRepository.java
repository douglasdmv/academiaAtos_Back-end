package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import bean.FormBean;
import entity.Form;

public class FormRepository {
	public SessionFactory sessionFactory;
	
	public void setup() {
        Configuration config = new Configuration();
        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/projetobuffet?useSSL=true");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        config.addAnnotatedClass(Form.class);
        sessionFactory = config.buildSessionFactory();
    }
	
	public String salvar(FormBean formBean) {
		double valorconv, taxagarcom, taxasobremesa, total;
		int garcom;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Form form = new Form();
        form.setCliente(formBean.getCliente());
        form.setConvidados(formBean.getConvidados());
        form.setSobremesa(formBean.getSobremesa());
        valorconv = formBean.getConvidados() * 22.9;
        form.setValorconv(valorconv);
        
        if(formBean.getConvidados() < 30) {
        	garcom = 1;
        }
        else {
        	garcom = formBean.getConvidados() / 15;
        }
        taxagarcom = garcom * 250;
        form.setGarcom(garcom);
        form.setTaxagarcom(taxagarcom);

        if(formBean.getSobremesa().equals("Sim")) {
        	taxasobremesa = valorconv * 0.1;
        }
        else {
        	taxasobremesa = 0;
        }
        total = valorconv + taxasobremesa + taxagarcom;
        
        form.setTaxasobremesa(taxasobremesa);
        form.setTotal(total);
        
        session.save(form);
        
        formBean.setValorconv(form.getValorconv());
		formBean.setGarcom(form.getGarcom());
		formBean.setTaxagarcom(form.getTaxagarcom());
		formBean.setTaxasobremesa(form.getTaxasobremesa());
		formBean.setTotal(form.getTotal());
        
        session.close();
        
        return "";
    }
	
	public String consultar(FormBean formBean) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Form form = session.find(Form.class, formBean.getId());
		formBean.setCliente(form.getCliente());
		formBean.setConvidados(form.getConvidados());
		formBean.setSobremesa(form.getSobremesa());
		formBean.setValorconv(form.getValorconv());
		formBean.setGarcom(form.getGarcom());
		formBean.setTaxagarcom(form.getTaxagarcom());
		formBean.setTaxasobremesa(form.getTaxasobremesa());
		formBean.setTotal(form.getTotal());
		session.close();		
		
		return "";
	}
}
