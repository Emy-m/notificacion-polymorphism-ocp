package modeloExtensible;

public class EnvioDeSMS implements Notificacion {

	private String numero;
	private String mensaje;

	public EnvioDeSMS(String numero, String mensaje) {
		this.numero = numero;
		this.mensaje = mensaje;
	}

	@Override
	public void notificar() {
		// Logica para el envio de un SMS
	}
}