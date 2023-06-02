package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor ();
		
		tv.ligarTelevisor ();
		tv.aumentarVolume ();
		tv.reduzirVolume () ;
		tv.subirCanal ();
		tv.mostrarStatus();
		tv.aumentarVolume();
		tv.mostrarStatus();
		tv.desligarTelevisor();
		tv.mostrarStatus();
		tv.ligarTelevisor();
		tv.aumentarVolume();
		tv.subirCanal ();
		tv.mostrarStatus();
		
		
		
		
		

	}

}
