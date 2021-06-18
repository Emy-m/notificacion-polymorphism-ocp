package main;

import java.util.ArrayList;

import modeloNoExtensible.Notificacion;
import modeloNoExtensible.Notificador;

public class MainNoExtensible {
	public static void main(String[] args) {
		Notificacion notificacionEmail = new Notificacion("email", "emiunrn@gmail.com", "notificacion");
		Notificacion notificacionSMS = new Notificacion("sms", "+542920683790", "notificacion");
		ArrayList<Notificacion> notificaciones = new ArrayList<Notificacion>();
		notificaciones.add(notificacionEmail);
		notificaciones.add(notificacionSMS);

		Notificador notificador = new Notificador();
		notificador.enviarNotificaciones(notificaciones);
	}
}
