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
public class Deporte {
    private String nombre;
    private String tipoEsfuerzo;
    private String ambiente;
    private String nivelSocial;
    private String equipoNecesario;

    public void mostrarInfo() {
        System.out.println("🏅 Deporte: " + nombre);
        System.out.println("Tipo de esfuerzo: " + tipoEsfuerzo);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Nivel social: " + nivelSocial);
        System.out.println("Equipo necesario: " + equipoNecesario);
    }
}

