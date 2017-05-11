import java.util.Timer;
import java.util.TimerTask;

public class Barbeiro {
	private int cadeirasDisponiveis, clientesEsperando = 0;
	private boolean barbeiroOcupado = false;

	private Timer timer = new Timer();

	public Barbeiro(int cadeiras) {
		cadeirasDisponiveis = cadeiras;
	}

	public void CortandoCabelo() {
		System.out.println("O barbeiro est� ocupado");
		barbeiroOcupado = true;
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				barbeiroOcupado = false;
				System.out.println("O barbeiro terminou de cortar o cabelo");
				System.out.println(clientesEsperando);
			}
		}, 5000);
	}

	public void BarbeiroAtende() {
		while (clientesEsperando != 0) {
			if (!barbeiroOcupado) {
				// Se o barbeiro n�o estiver ocupado, ele atende o cliente
				CortandoCabelo();
				clientesEsperando--;
			} else {

			}
		}

		if (!barbeiroOcupado) {
			System.out.println("O barbeiro est� dormindo");
		}
	}

	public void ChegaCliente() {
		if (clientesEsperando > cadeirasDisponiveis) { // Se a quantidade de
														// cadeiras forem
														// insuficientes,
														// cliente vai embora
			System.out.println("Cliente foi embora, todas as cadeiras est�o ocupadas");
		} else {
			clientesEsperando++;
			System.out.println("O cliente est� esperando o atendimento");
		}
	}
}
