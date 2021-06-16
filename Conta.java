package exercPoo;

public class Conta {
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;// falta get e set!!!
	//metodo construtor
	public Conta() {	// falta ver parametros
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	// metodo para mostrar o estado atual
	public void estadoAtual() {
		System.out.println("\n--------------------------------");
		System.out.println("Numero da conta: "+this.getNumConta());
		System.out.println("Conta do tipo: "+this.getTipo());
		System.out.println("Dono da conta: "+this.getDono());
		System.out.println("Saldo da conta: "+this.getSaldo());
		System.out.println("Status da conta: "+this.getStatus());
	}
	//getters e setters
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean st) {
		this.status = st;
	}
	//metodos personalizados
	public void abrirConta(String t) {
		this.setTipo(t);// tipo sera setado para o valor de t
		this.setStatus(true);
		if (this.tipo == "cc") {
			this.setSaldo(getSaldo()+50);
		}else {
			this.setSaldo(getSaldo()+150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {		
		if(this.getSaldo() > 0) {
			System.out.println("\nPrimeiro realize um saque de "+this.getSaldo());
		}else if (this.getSaldo() < 0) {
			System.out.println("\nPrimeiro quite o valor devido de "+this.getSaldo());
		}else {
			System.out.println("\nSua conta foi fechada");
			this.setStatus(false);
		}		
	}
	
	public void depositar(float v) {//passar parametro do valor
		if (this.getStatus ()) {// retorna se for verdadeiro
			this.setSaldo(this.getSaldo()+v);// set modifique para, get o que ja tinha + valor de v	
			System.out.print("\nDeposito realizado na conta de "+this.getDono());
		}else {
			System.out.print("\nPrimeiro abra sua conta!");
		}
	}
	
	public void sacar(float v) {// passar parametro do valor
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("\nSaque realizado na conta de "+this.getDono());
			}else {
				System.out.println("\nSaldo insuficiente para saque!");
			}
		}else {
			System.out.println("\nImpossivel sacar, conta fechada!");
		}		
	}
	
	public void pagarMensal() {
		int v = 0;// variavel local para receber o valor da mensalidade
		if(this.getTipo() =="cc") {
			v = 12;
		}
		else if (this.getTipo() =="cp"){
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("\nMensalidade paga!");
			}else if (this.getSaldo() < v) {
				System.out.println("\nImpossivel pagar, saldo insuficiente!");
			}			
		}else {
			System.out.println("\nImpossivel pagar, conta fechada!");
		}		
	}
}
