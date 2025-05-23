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
public class Voleibol extends Deporte {
    private String tipoVoleibol;
    private String cantidadJugadores;
    private String alturaRed;
    private String tipoSuperficie;
    private String duracionSet;

    public void configurarVoleibol() {
        setNombre("Voleibol");
        setTipoEsfuerzo("Medio - Alto");
        setAmbiente("Interior / Playa");
        setNivelSocial("Equipo");
        setEquipoNecesario("Balón, red, uniforme");

        setTipoVoleibol("Sala / Playa");
        setCantidadJugadores("6 por equipo (2 en playa)");
        setAlturaRed("2.43m hombres / 2.24m mujeres");
        setTipoSuperficie("Piso duro / Arena");
        setDuracionSet("25 puntos por set");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de voleibol: " + tipoVoleibol);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
        System.out.println("Altura de la red: " + alturaRed);
        System.out.println("Tipo de superficie: " + tipoSuperficie);
        System.out.println("Duración del set: " + duracionSet);
    }
}
