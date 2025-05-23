package mx.poo.itao;

import mx.poo.itao.objetos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Documentos documento = new Documentos();
	    documento.llamarDocumentos ();
        Usuario usuario = new Usuario();
        usuario.pedirDatos();

        Deporte deporteRecomendado = null;

        if (usuario.getAmbiente() == 1 && usuario.getNivelEnergia() == 3 && usuario.getPreferenciaSocial() == 2) {
            Atletismo at = new Atletismo();
            at.configurarAtletismo();
            deporteRecomendado = at;
        } else if (usuario.getAmbiente() == 1 && usuario.getHabilidadEquipo() == 1 && usuario.getPreferenciaSocial() == 1) {
            Futbol ft = new Futbol();
            ft.configurarFutbol();
            deporteRecomendado = ft;
        } else if (usuario.getAmbiente() == 2 && usuario.getHabilidadAgua() == 3) {
            Natacion nt = new Natacion();
            nt.configurarNatacion();
            deporteRecomendado = nt;
        } else if (usuario.getNivelEnergia() == 1 && usuario.getPreferenciaSocial() == 2) {
            Yoga yg = new Yoga();
            yg.configurarYoga();
            deporteRecomendado = yg;
        } else if (usuario.getHabilidadAgua() == 2 && usuario.getAmbiente() == 2) {
            Remo rm = new Remo();
            rm.configurarRemo();
            deporteRecomendado = rm;
        } else if (usuario.getHabilidadEquipo() == 2 && usuario.getNivelEnergia() == 3) {
            Voleibol vb = new Voleibol();
            vb.configurarVoleibol();
            deporteRecomendado = vb;
        } else {
            Ciclismo cc = new Ciclismo();
            cc.configurarCiclismo();
            deporteRecomendado = cc;
        }

        System.out.println("----- Datos del Usuario -----");
        usuario.mostrarInfo();

        System.out.println("\n----- Deporte Recomendado -----");
        deporteRecomendado.mostrarInfo();
    }
}
