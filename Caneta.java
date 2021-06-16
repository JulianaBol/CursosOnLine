package javaPoo;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("uma caneta "+ this.cor);
		System.out.println("ponta "+ this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("esta tampada? "+ this.tampada);
		
		
	}
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Erro! N poso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	public void tampar () {
		this.tampada = true;
	}
	public void destampar () {
		this.tampada = false;	
	}

}


