package app;

import java.util.ArrayList;
import java.util.List;
import interfaces.Entregavel;
import modelo.Caminhao;
import modelo.Van;
import modelo.Moto;
import modelo.Bicicleta;
import servico.Despacho;

public class Principal {
    public static void main(String[] args) {
        List<Entregavel> frota = new ArrayList<>();

        frota.add(new Caminhao("ABC-1234", 5000));
        frota.add(new Van("DEF-5678", 1500));
        frota.add(new Moto("GHI-9012", 20));
        frota.add(new Bicicleta("JKL-3456", 10));

        Despacho despacho = new Despacho();

        System.out.println("ENTREGAS DE 80 KM");
        double total80 = despacho.calcularTotal(frota, 80);
        System.out.printf("Total da frota para 80 km: R$ %.2f%n", total80);

        System.out.println();
        System.out.println("ENTREGA DE 3 KM");
        List<Entregavel> bicicleta = new ArrayList<>();
        bicicleta.add(frota.get(3));
        double total3 = despacho.calcularTotal(bicicleta, 3);
        System.out.printf("Total da bicicleta para 3 km: R$ %.2f%n", total3);
    }
}
