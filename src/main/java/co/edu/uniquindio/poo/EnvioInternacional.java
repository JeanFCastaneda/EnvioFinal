package co.edu.uniquindio.poo;
public class EnvioInternacional extends Envio {
    private String paisDestino;
    private boolean incluyeSeguro;

    public EnvioInternacional(String codigo, String destinatario, double pesoKg, String paisDestino, boolean incluyeSeguro) {
        super(codigo, destinatario, pesoKg);
        this.paisDestino = paisDestino;
        this.incluyeSeguro = incluyeSeguro;
    }

    @Override
    public double calcularCosto() {
        double costo = 15000 + (9000 * getPesoKg());
        if (incluyeSeguro) {
            costo += 20000;
        }
        return costo;
    }

    // Getters y Setters
    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean isIncluyeSeguro() {
        return incluyeSeguro;
    }

    public void setIncluyeSeguro(boolean incluyeSeguro) {
        this.incluyeSeguro = incluyeSeguro;
    }
}