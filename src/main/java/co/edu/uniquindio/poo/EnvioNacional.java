package co.edu.uniquindio.poo;
public class EnvioNacional extends Envio {
    private String ciudadDestino;
    private boolean entregaDomicilio;

public EnvioNacional(String codigo, String destinatario, double pesoKg, String ciudadDestino, boolean entregaDomicilio) {
    super(codigo, destinatario, pesoKg);
    this.ciudadDestino = ciudadDestino;
    this.entregaDomicilio = entregaDomicilio;
}

@Override
public double calcularCosto() {
    double costo = 6000 + (2000 * getPesoKg());
    if (entregaDomicilio) {
        costo += 3000;
    }
    return costo;
}

// Getters y Setters
public String getCiudadDestino() {
    return ciudadDestino;
}

public void setCiudadDestino(String ciudadDestino) {
    this.ciudadDestino = ciudadDestino;
}

public boolean isEntregaDomicilio() {
    return entregaDomicilio;
}

public void setEntregaDomicilio(boolean entregaDomicilio) {
    this.entregaDomicilio = entregaDomicilio;
}
}
