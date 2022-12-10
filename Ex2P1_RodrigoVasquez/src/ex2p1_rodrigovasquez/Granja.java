package ex2p1_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Granja {

    String nombre;
    ArrayList<Conejos> conejos = new ArrayList<Conejos>();
    ArrayList<Vacas> vacas = new ArrayList<Vacas>();
    ArrayList<Vegetales> vegetales = new ArrayList<Vegetales>();
    int dinero;

    public Granja(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = 500;
    }

    public int sizeConejos() {
        if (conejos.isEmpty()) {
            return 0;
        } else {
            int contConejos = 0;
            for (Conejos conejo : conejos) {
                contConejos++;
            }
            return contConejos;
        }
    }

    public int sizeVacas() {
        if (vacas.isEmpty()) {
            return 0;
        } else {
            int contVacas = 0;
            for (Vacas vaca : vacas) {
                contVacas++;
            }
            return contVacas;
        }
    }

    public int sizeVegetales() {
        if (vegetales.isEmpty()) {
            return 0;
        } else {
            int contVegetales = 0;
            for (Vegetales vegetal : vegetales) {
                contVegetales++;
            }
            return contVegetales;
        }
    }

    public void printGranja() {
        System.out.println("---------- ANALISIS  DE  LA  GRANJA ----------");
        System.out.println("Tiene " + sizeVegetales() + " Vegetales");
        System.out.println("Tiene " + sizeVacas() + " Vacas");
        System.out.println("Tiene " + sizeConejos() + " Conejos");
        System.out.println("Monets: " + this.dinero);
        System.out.println("----------------------------------------------");

    }

    public void printConejos() {
        System.out.println("Conejos:");
        for (Conejos conejo : conejos) {
            System.out.println("-> " + conejo.nombre);
        }
    }

    public void printVacas() {
        System.out.println("Vacas:");
        for (Vacas vaca : vacas) {
            System.out.println("-> " + vaca.nombre);
        }
    }

    public void addVacas(int num) {
        Scanner addVacas = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre de su nueva vaca: ");
            String nombreVacas = addVacas.nextLine();
            System.out.println(nombreVacas + " ha sido enviada a " + nombre);
            vacas.add(new Vacas(nombreVacas, 350));
        }
    }

    public void addConejos(int num) {
        Scanner addConejos = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre de su nuevo conejo: ");
            String nombreConejos = addConejos.nextLine();
            System.out.println(nombreConejos + " ha sido enviado a " + nombre);
            conejos.add(new Conejos(nombreConejos, 150));
        }
    }

    public void addVegetales(int num) {
        for (int i = 0; i < num; i++) {
            vegetales.add(new Vegetales(100));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Conejos> getConejos() {
        return conejos;
    }

    public void setConejos(ArrayList<Conejos> conejos) {
        this.conejos = conejos;
    }

    public ArrayList<Vacas> getVacas() {
        return vacas;
    }

    public void setVacas(ArrayList<Vacas> vacas) {
        this.vacas = vacas;
    }

    public ArrayList<Vegetales> getVegetales() {
        return vegetales;
    }

    public void setVegetales(ArrayList<Vegetales> vegetales) {
        this.vegetales = vegetales;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}
