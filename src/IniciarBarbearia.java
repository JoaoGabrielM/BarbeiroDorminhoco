import javax.swing.JOptionPane;

public class IniciarBarbearia {
	public static void main(String args[]) {
		int operacao = 1;

		Barbeiro barbeiro = new Barbeiro(5);

		while (operacao != 0) {
			operacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para chegar um novo cliente e 0 para sair: "));
			if (operacao != 0) {
				barbeiro.ChegaCliente();
			}
			barbeiro.BarbeiroAtende();
		}
		
		System.out.println("A barbearia fechou!");
	}
}
