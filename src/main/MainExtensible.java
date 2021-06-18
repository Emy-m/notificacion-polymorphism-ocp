package main;

import java.util.ArrayList;

import modeloExtensible.EnvioDeEmail;
import modeloExtensible.EnvioDeSMS;
import modeloExtensible.Notificacion;
import modeloExtensible.Notificador;

public class MainExtensible {
	public static void main(String[] args) {
		EnvioDeEmail envioDeEmail = new EnvioDeEmail("emiunrn@gmail.com", "asunto de notificacion", "cuerpo de email");
		EnvioDeSMS envioDeSMS = new EnvioDeSMS("+542920683790", "mensaje SMS");
		ArrayList<Notificacion> notificaciones = new ArrayList<Notificacion>();
		notificaciones.add(envioDeSMS);
		notificaciones.add(envioDeEmail);

		Notificador notificador = new Notificador();
		notificador.enviarNotificaciones(notificaciones);
	}
}
