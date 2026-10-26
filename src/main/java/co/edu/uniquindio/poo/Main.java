package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Envio> listaEnvios = new ArrayList<>();

        Envio e1 = new EnvioNacional("001", "Ana Gómez", 2.5, "Medellín", true);
        Envio e2 = new EnvioInternacional("-002", "Mailon Enrique", 1.0, "EEUU", true);
        Envio e3 = new EnvioExpress("003", "Eduardo Saldarriaga ", 3.0, "Bogotá", true, 12);

        listaEnvios.add(e1);
        listaEnvios.add(e2);
        listaEnvios.add(e3);


        double costoTotalEmpresa = 0;

        System.out.println("=== REPORTE DE ENVÍOS DE LA EMPRESA ===");
        for (Envio envio : listaEnvios) {
            double costo = envio.calcularCosto();
            costoTotalEmpresa += costo;

            System.out.printf("Código: %s | Destinatario: %s | Costo: $%.2f%n",
                    envio.getCodigo(),
                    envio.getDestinatario(),
                    costo);
        }

        System.out.println("---------------------------------------");
        System.out.printf("Costo Total Gestionado: $%.2f%n", costoTotalEmpresa);
    }
}