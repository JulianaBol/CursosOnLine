package encapsulamento;

public class UsandoControle {

	public static void main(String[] args) {
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		c1.pause();	
		c1.maisVolume();
		c1.abrirMenu();	
		c1.fecharMenu();
	}
}
