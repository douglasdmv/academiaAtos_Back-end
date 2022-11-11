package entity;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import javax.persistence.*;

	@Entity
	@Table(name="buffet")
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class Form{

	    @Id
	    @Column(name="id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name="cliente", nullable = false)
	    private String cliente;

	    @Column(name="convidados")
	    private int convidados;
	    
	    @Column(name="sobremesa", nullable = false)
	    private String sobremesa;
	    
	    @Column(name="valor_conv")
	    private double valorconv;
	    
	    @Column(name="garcons")
	    private int garcom;
	    
	    @Column(name="taxa_garcons")
	    private double taxagarcom;
	    
	    @Column(name="taxa_sobremesa")
	    private double taxasobremesa;
	    
	    @Column(name="total")
	    private double total;
}
