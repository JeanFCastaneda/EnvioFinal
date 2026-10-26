package co.edu.uniquindio.poo;

public class EnvioExpress extends EnvioNacional {
    public int horasMaximasEntrega;

    public EnvioExpress(String codigo, String destinatario, double pesoKg, String ciudadDestino, boolean entregaDomicilio, int horasMaximasEntrega) {
        super(codigo, destinatario, pesoKg, ciudadDestino, entregaDomicilio);
        this.horasMaximasEntrega = horasMaximasEntrega;
    }

    @Override
    public double calcularCosto() {
        double costoBaseNacional = super.calcularCosto();
        double costoExpress = costoBaseNacional * 1.30;

        if (horasMaximasEntrega <= 24) {
            costoExpress += 5000;
        }

        return costoExpress;
    }

    // Getters y Setters
    public int getHorasMaximasEntrega() {
        return horasMaximasEntrega;
    }

    public void setHorasMaximasEntrega(int horasMaximasEntrega) {
        this.horasMaximasEntrega = horasMaximasEntrega;
    }
}