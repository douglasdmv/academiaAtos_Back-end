package bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repository.FormRepository;

@ManagedBean(name = "formBean")
@RequestScoped
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormBean {
	
	FormRepository formRepository = new FormRepository();
	
	private int id;
	private String cliente;
	private int convidados;
	private String sobremesa;
	private double valorconv;
	private int garcom;
	private double taxagarcom;
	private double taxasobremesa;
	private double total;
    
	@PostConstruct
    public void init() {
        formRepository.setup();
    }
	
	public String salvar(FormBean formBean) {
        return formRepository.salvar(formBean);
    }
	
	public String consultar(FormBean formBean) {
        return formRepository.consultar(formBean);
    }
	
}
