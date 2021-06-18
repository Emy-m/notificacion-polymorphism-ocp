package modeloExtensible;

import java.util.List;

public class Notificador {
	// Es mucho mas simple y ademas extensible porque solo consta en agregar nuevas
	// clases que implementen la interfaz y podran notificarse.

	public void enviarNotificaciones(List<Notificacion> notificaciones) {
		for (Notificacion notificacion : notificaciones) {
			notificacion.notificar();
		}
	}
}
