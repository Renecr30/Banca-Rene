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
public class Yoga extends Deporte {
    private String tipoYoga;
    private String duracionSesion;
    private String nivelFlexibilidad;
    private String usoMat;
    private String enfoque;

    public void configurarYoga() {
        setNombre("Yoga");
        setTipoEsfuerzo("Bajo");
        setAmbiente("Interior");
        setNivelSocial("Individual");
        setEquipoNecesario("Mat, ropa cómoda");

        setTipoYoga("Hatha / Vinyasa / Ashtanga");
        setDuracionSesion("45-60 minutos");
        setNivelFlexibilidad("Medio");
        setUsoMat("Recomendado");
        setEnfoque("Relajación y concentración");
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de yoga: " + tipoYoga);
        System.out.println("Duración de la sesión: " + duracionSesion);
        System.out.println("Nivel de flexibilidad requerido: " + nivelFlexibilidad);
        System.out.println("Uso de mat: " + usoMat);
        System.out.println("Enfoque: " + enfoque);
    }
}
