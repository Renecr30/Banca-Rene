package mx.poo.itao.objetos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Ciclismo extends Deporte {
    private String tipoBicicleta;
    private String distanciaPromedio;
    private String tipoTerreno;
    private String equipamiento;
    private String velocidadMaxima;

    public void configurarCiclismo() {
        setNombre("Ciclismo");
        setTipoEsfuerzo("Alto");
        setAmbiente("Exterior");
        setNivelSocial("Mixto");
        setEquipoNecesario("Bicicleta, casco, ropa técnica");

        setTipoBicicleta("Ruta / Montaña / Urbana");
        setDistanciaPromedio("10-40 km");
        setTipoTerreno("Asfalto / Montaña");
        setEquipamiento("Guantes, casco, luces");
        setVelocidadMaxima("Hasta 60 km/h");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de bicicleta: " + tipoBicicleta);
        System.out.println("Distancia promedio: " + distanciaPromedio);
        System.out.println("Tipo de terreno: " + tipoTerreno);
        System.out.println("Equipamiento necesario: " + equipamiento);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}
