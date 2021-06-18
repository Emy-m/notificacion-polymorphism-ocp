package modeloExtensible;

public class EnvioDeEmail implements Notificacion {

	private String destinatario;
	private String asunto;
	private String cuerpo;

	public EnvioDeEmail(String destinatario, String asunto, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	@Override
	public void notificar() {
		// Logica para el envio de un email
	}

}
