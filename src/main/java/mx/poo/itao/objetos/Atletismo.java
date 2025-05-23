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
public class Atletismo extends Deporte {
    private String tipoPrueba;
    private String superficiePista;
    private String distanciaCarrera;
    private String equipoEspecial;
    private String climaIdeal;

    public void configurarAtletismo() {
        setNombre("Atletismo");
        setTipoEsfuerzo("Muy alto");
        setAmbiente("Exterior");
        setNivelSocial("Individual");
        setEquipoNecesario("Tenis de pista, ropa deportiva");

        setTipoPrueba("Velocidad / Fondo / Salto / Lanzamiento");
        setSuperficiePista("Sintética");
        setDistanciaCarrera("100m - Maratón");
        setEquipoEspecial("Cronómetro, tacos de salida");
        setClimaIdeal("Templado y seco");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de prueba: " + tipoPrueba);
        System.out.println("Superficie de pista: " + superficiePista);
        System.out.println("Distancia de carrera: " + distanciaCarrera);
        System.out.println("Equipo especial: " + equipoEspecial);
        System.out.println("Clima ideal: " + climaIdeal);
    }
}
