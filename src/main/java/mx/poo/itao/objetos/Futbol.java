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
public class Futbol extends Deporte {
    private String posicion;
    private String duracionPartido;
    private String tipoCancha;
    private String balonRequerido;
    private String nivelContacto;

    public void configurarFutbol() {
        setNombre("Fútbol");
        setTipoEsfuerzo("Alto");
        setAmbiente("Exterior");
        setNivelSocial("Equipo");
        setEquipoNecesario("Balón, uniforme, zapatos");

        setPosicion("Delantero / Defensa / Portero");
        setDuracionPartido("90 minutos");
        setTipoCancha("Césped");
        setBalonRequerido("Balón n°5");
        setNivelContacto("Alto");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Posición: " + posicion);
        System.out.println("Duración del partido: " + duracionPartido);
        System.out.println("Tipo de cancha: " + tipoCancha);
        System.out.println("Balón requerido: " + balonRequerido);
        System.out.println("Nivel de contacto: " + nivelContacto);
    }
}
