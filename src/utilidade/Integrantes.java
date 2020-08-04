package utilidade;

public class Integrantes {
	private String nomeintegrante;
	private int idintegrante;
	private double salario;
	public Integrantes(String nomeintegrante, int idintegrante, double salario) {
		
		this.nomeintegrante = nomeintegrante;
		this.idintegrante = idintegrante;
		this.salario = salario;
	}
	public String getNomeintegrante() {
		return nomeintegrante;
	}
	
	public int getIdintegrante() {
		return idintegrante;
	}
	
	public double getSalario() {
		return salario;
	}
	
	

	

}
