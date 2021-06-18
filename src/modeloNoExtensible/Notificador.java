package modeloNoExtensible;

import java.util.List;

public class Notificador {
	// Cuando se agrege un nuevo servicio de envio de notificaciones como whatsapp
	// este codigo me obliga a modificar esta clase, modificar enviar notificaciones
	// y agregar el metodo. NO ES EXTENSIBLE.

	public void enviarNotificaciones(List<Notificacion> notificaciones) {
		for (Notificacion notificacion : notificaciones) {
			if (notificacion.getTipo().equals("sms")) {
				enviarNotificacionPorSMS(notificacion.getDestino(), notificacion.getAsunto());
			} else if (notificacion.getTipo().equals("email")) {
				enviarNotificacionPorEmail(notificacion.getDestino(), notificacion.getAsunto());
			}
		}
	}

	private void enviarNotificacionPorSMS(String telefono, String mensaje) {
		// La logica para enviar sms
	}

	private void enviarNotificacionPorEmail(String destinatario, String asunto) {
		// La logica para enviar email
	}
}
