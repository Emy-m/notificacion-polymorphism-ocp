package modeloNoExtensible;

public class Notificacion {
	private String tipo;
	private String destino;
	private String asunto;

	public Notificacion(String tipo, String destino, String asunto) {
		this.tipo = tipo;
		this.destino = destino;
		this.asunto = asunto;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDestino() {
		return destino;
	}

	public String getAsunto() {
		return asunto;
	}
}
