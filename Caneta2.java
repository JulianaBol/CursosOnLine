package javaPoo;

public class Caneta2 {
	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta2(String m, String c, float p) {// metodo construtor, mesmo nome da classe, neste caso passando parametros
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo() {// retorna o conteudo da variavel
		return this.modelo;
	}
	
	public void setModelo(String m) {//modificam o conteudo da variavel
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void tampar () {
		this.tampada = true;
	}
	
	public void destampar () {
		this.tampada = false;	
	}
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo:"+this.getModelo());// this.modelo ou this.getModelo()
		System.out.println("Cor: "+this.getCor());
		System.out.println("Ponta: "+this.getPonta());//this.ponta ou this.getPonta()
		System.out.println(this.tampada);
	}
}
