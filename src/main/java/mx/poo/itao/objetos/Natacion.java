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
public class Natacion extends Deporte {
    private String estilo;
    private String profundidadPiscina;
    private String longitudPiscina;
    private String usoGorra;
    private String nivelResistencia;

    public void configurarNatacion() {
        setNombre("Natación");
        setTipoEsfuerzo("Medio - Alto");
        setAmbiente("Interior / Exterior (Piscina)");
        setNivelSocial("Individual");
        setEquipoNecesario("Traje de baño, gorra, gafas");

        setEstilo("Libre / Pecho / Mariposa / Espalda");
        setProfundidadPiscina("2 metros");
        setLongitudPiscina("25 o 50 metros");
        setUsoGorra("Obligatorio en competencia");
        setNivelResistencia("Muy alto");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Estilo de natación: " + estilo);
        System.out.println("Profundidad de la piscina: " + profundidadPiscina);
        System.out.println("Longitud de la piscina: " + longitudPiscina);
        System.out.println("Uso de gorra: " + usoGorra);
        System.out.println("Nivel de resistencia requerido: " + nivelResistencia);
    }
}
