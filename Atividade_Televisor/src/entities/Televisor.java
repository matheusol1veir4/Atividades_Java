package entities;

public class Televisor {

	public int canal;
	public int volume;
	public boolean ligado;

	public void aumentarVolume() {
		volume = volume + 1;
	}

	public void reduzirVolume() {
		volume = volume - 1;
	}

	public void subirCanal() {
		canal = canal + 1;
	}

	public void descerCanal() {
		canal = canal - 1;
	}

	public void ligarTelevisor() {
		ligado = true;

	}

	public void desligarTelevisor() {
		ligado = false;
	}

	public void mostrarStatus() {
		if (ligado == true) {
			System.out.println(canal + " " + volume + " O televisor está ligado");
		}
		else {
			System.out.println("O televisor está desligado");
		}
	}

}
