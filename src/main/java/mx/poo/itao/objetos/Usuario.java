package mx.poo.itao.objetos;

import java.util.Scanner;
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
public class Usuario {
    private String nombre;
    private Integer ambiente;
    private Integer nivelEnergia;
    private Integer preferenciaSocial;
    private Integer habilidadEquipo;
    private Integer habilidadAgua;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("¿Cuál es tu nombre?");
        setNombre(sc.nextLine());
System.out.println("ESCRIBE 1, 2 O 3 SEGUN SEA EL CASO PARA RESPONDER LAS PREGUNTAS ");
        System.out.println("¿Prefieres actividades en...? \n1. Exterior \n2. Interior");
        setAmbiente(sc.nextInt());

        System.out.println("¿Cómo es tu nivel de energía? \n1. Bajo \n2. Medio \n3. Alto");
        setNivelEnergia(sc.nextInt());

        System.out.println("¿Prefieres actividades...? \n1. En equipo \n2. Solitarias \n3. Mixtas");
        setPreferenciaSocial(sc.nextInt());

        System.out.println("¿Qué tan bien trabajas en equipo? \n1. Muy bien \n2. Bien \n3. Poco");
        setHabilidadEquipo(sc.nextInt());

        System.out.println("¿Qué tanto sabes nadar? \n1. Nada \n2. Algo \n3. Muy bien");
        setHabilidadAgua(sc.nextInt());

        System.out.println("\n🔎 Analizando tus respuestas...\n");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ambiente (1: Exterior / 2: Interior): " + ambiente);
        System.out.println("Nivel de energía (1: Bajo / 2: Medio / 3: Alto): " + nivelEnergia);
        System.out.println("Preferencia social (1: Equipo / 2: Solo / 3: Mixto): " + preferenciaSocial);
        System.out.println("Habilidad en equipo (1: Alta / 2: Media / 3: Baja): " + habilidadEquipo);
        System.out.println("Habilidad acuática (1: Nada / 2: Media / 3: Alta): " + habilidadAgua);
    }
}
