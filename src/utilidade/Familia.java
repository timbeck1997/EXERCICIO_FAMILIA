package utilidade;

import java.util.ArrayList;
import java.util.List;

public class Familia {
	private String nomefamilia;
	private double rendapercapita;
	public List<Integrantes> lista_integrantes;

	public Familia(String nome) {
		this.nomefamilia = nome;
		lista_integrantes = new ArrayList<>();
	}

	public void addintegrante(Integrantes integrante) {
		
			lista_integrantes.add(integrante);
			
		
	}

	public double calcularenda() {
		
		for(int i=0; i<lista_integrantes.size();i++) {
			this.rendapercapita+=lista_integrantes.get(i).getSalario();
		}
		int tamanho=lista_integrantes.size();
		
		return this.rendapercapita=this.rendapercapita/(double)tamanho;
	}
	public void getIntegrantes() {
		for(int i=0;i<lista_integrantes.size();i++) {
			System.out.println(lista_integrantes.get(i).getNomeintegrante());
		}
	
	}


	
	

}
