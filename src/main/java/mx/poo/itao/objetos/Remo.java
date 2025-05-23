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
public class Remo extends Deporte {
    private String tipoEmbarcacion;
    private String numeroRemeros;
    private String usoChaleco;
    private String duracionEntrenamiento;
    private String entorno;

    public void configurarRemo() {
        setNombre("Remo");
        setTipoEsfuerzo("Alto");
        setAmbiente("Exterior");
        setNivelSocial("Equipo");
        setEquipoNecesario("Bote, remos, chaleco");

        setTipoEmbarcacion("Single / Doble / Cuádruple");
        setNumeroRemeros("1 a 8");
        setUsoChaleco("Obligatorio");
        setDuracionEntrenamiento("60-90 minutos");
        setEntorno("Lagos o ríos calmos");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("Número de remeros: " + numeroRemeros);
        System.out.println("Uso de chaleco: " + usoChaleco);
        System.out.println("Duración de entrenamiento: " + duracionEntrenamiento);
        System.out.println("Entorno: " + entorno);
    }
}
