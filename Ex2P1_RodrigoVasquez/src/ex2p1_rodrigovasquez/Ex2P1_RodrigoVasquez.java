package ex2p1_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex2P1_RodrigoVasquez {

    public static void main(String[] args) {
        stardewValley();
    }

    public static void stardewValley() {
        Scanner specter = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);
        System.out.println("<------------------ [ E X A M E N   I I   -   P R O G R A   I ] ------------------>");
        System.out.print("Ingrese el nombre de su nueva granja: ");
        String nombre = specter.nextLine();
        int contDias = 1;
        boolean casado = false;
        boolean millonario = false;
        int numEsposas = 0;
        int numHijos = 0;
        Granja granja = new Granja(nombre, 500);
        boolean cosechas = false;
        boolean muerte = false;
        int random = 0;
        int diasFaltantes = 0;
        int numVegetales = 0;
        int numVacas = 0;
        int numConejos = 0;
        do {
            System.out.println("<---------- D I A :  " + contDias + " ---------->");
            if (cosechas) {
                if (diasFaltantes != 0) {
                    System.out.println("¡Faltan " + diasFaltantes + " para que las cosechas esten listas!");
                } else {
                    System.out.println("¡Las cosechas ya estan listas!");
                }
            } else {
                System.out.println("No hay cosechas");
            }
            System.out.println("¿Que desea hacer?");
            System.out.println("1. [Plantar Cosechas]\n2. [Cosechar Las Cosechas]\n3. [Comprar Animales]\n4. [Vender Cosas]\n5. [Dormir]\n6. [Casarse]\n7. [Tener Hijos]\n8. [Mercado Especial]");
            int choice = nums.nextInt();
            switch (choice) {
                case 1:
                    if (cosechas) {
                        System.out.println("Ya hay cosechas plantadas");
                    } else {
                        System.out.print("¿Cuantos vegetales desea plantar? ");
                        numVegetales = nums.nextInt();
                        //Dependiendo al numero de vegetales que el usuario desea plantar, hay cierta probabilidad de morir
                        if (numVegetales < 0) {
                            System.out.println("Numero invalido");
                        } else if (numVegetales == 0) {
                            System.out.println("Se plantaron 0 vegetales LOL");
                            System.out.println("P A Y A S O");
                        } else if (numVegetales > 0 && numVegetales < 11) {
                            System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                            System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                            diasFaltantes = 6;
                            cosechas = true;
                        } else if (numVegetales < 21) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 10) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 31) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 20) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 41) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 30) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 51) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 40) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 61) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 50) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 71) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 60) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 81) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 70) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 91) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 80) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else if (numVegetales < 101) {
                            random = new Random().nextInt((100 - 1) + 1) + 1;
                            if (random >= 0 && random <= 90) {
                                System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                                System.out.println("Y O U   D I E D");
                                muerte = true;
                            } else {
                                System.out.println("P L A N T A N D O   C O S E C H A S . . .");
                                System.out.println("¡ C O M P L E T A D O ! \nLas cosechas tardan 5 días en estar");
                                cosechas = true;
                                diasFaltantes = 6;
                            }
                        } else {
                            System.out.println("Debido a que plantó más vegetales de lo que era capaz...");
                            System.out.println("Y O U   D I E D");
                            muerte = true;
                        }
                        contDias++;
                    }
                    break;
                case 2:
                    if (cosechas) {
                        if (diasFaltantes == 0) {
                            System.out.println("¡Los vegetales han sido cosechados!");
                            System.out.println("[Usted ha adquirido " + numVegetales + " vegetales]");
                            granja.addVegetales(numVegetales);
                            contDias++;
                            cosechas = false;
                        } else {
                            System.out.println("¡Los vegetales no estan listos para la cosecha!");
                            contDias++;
                        }
                    } else {
                        System.out.println("No has plantado nada");
                        contDias++;
                    }
                    break;
                case 3:
                    System.out.println("Cantidad de dinero actual: " + granja.getDinero());
                    System.out.println("¿Qué animal desea comprar?");
                    System.out.println("1. [Conejos: 150 monets]\n2. [Vacas: 350 monets]");
                    int choiceAnimals = nums.nextInt();
                    switch (choiceAnimals) {
                        case 1:
                            System.out.print("¿Cuántos conejos desea? ");
                            numConejos = nums.nextInt();
                            if ((numConejos * 150) <= granja.getDinero()) {
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("¡Se han comprado conejos!");
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
                                granja.addConejos(numConejos);
                                granja.setDinero(granja.getDinero() - (numConejos * 150));
                                contDias++;
                            } else {
                                System.out.println("NO TIENES EL DINERO PARA COMPRAR ESTO");
                                contDias++;
                            }
                            break;
                        case 2:
                            System.out.print("¿Cuántas vacas desea? ");
                            numVacas = nums.nextInt();
                            if ((numVacas * 350) <= granja.getDinero()) {
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("¡Se han comprado vacas!");
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
                                granja.addVacas(numVacas);
                                granja.setDinero(granja.getDinero() - (numVacas * 350));
                                contDias++;
                            } else {
                                System.out.println("NO TIENES EL DINERO PARA COMPRAR ESTO");
                                contDias++;
                            }
                            break;
                        default:
                            System.out.println("Opción Inválida");
                            contDias++;
                            break;
                    }
                    break;
                case 4:
                    System.out.println("¿Qué deseas vender?");
                    granja.printGranja();
                    System.out.println("Selecciona:");
                    System.out.println("1. [Vegetales]\n2. [Conejos]\n3. [Vacas]");
                    int choiceVenta = nums.nextInt();
                    switch (choiceVenta) {
                        case 1:
                            if (granja.sizeVegetales() == 0) {
                                System.out.println("No tienes vegetales pare vender");
                                contDias++;
                            } else {
                                System.out.println("Hay " + granja.sizeVegetales() + " vegetales en el inventario");
                                System.out.println("Ingrese cuantos vegetales desea vender: ");
                                int numVenta = nums.nextInt();
                                if (numVenta <= granja.sizeVegetales()) {
                                    System.out.println("Se han vendido " + numVenta + " vegetales");
                                    for (int i = 0; i < numVenta; i++) {
                                        granja.vegetales.remove(0);
                                    }
                                    granja.setDinero(granja.getDinero() + (100 * numVenta));
                                    System.out.println("Monets: " + granja.getDinero());
                                    contDias++;
                                } else {
                                    System.out.println("No tienes tantos vegetales para vender");
                                    contDias++;
                                }
                            }
                            break;
                        case 2:
                            if (granja.sizeConejos() == 0) {
                                System.out.println("No tiene conejos para vender");
                                contDias++;
                            } else {
                                System.out.println("Hay " + granja.sizeConejos() + " conejos en el inventario");
                                System.out.println("Sus nombres son:");
                                granja.printConejos();
                                System.out.println("Ingrese cuantos conejos desea vender: ");
                                int numVenta = nums.nextInt();
                                if (numVenta <= granja.sizeConejos()) {
                                    for (int i = 0; i < numVenta; i++) {
                                        System.out.println("Bye Bye " + granja.conejos.get(0).getNombre() + "~");
                                        granja.conejos.remove(0);
                                    }
                                    System.out.println("Se han vendido " + numVenta + " conejos");
                                    granja.setDinero(granja.getDinero() + (170 * numVenta));
                                    System.out.println("Monets: " + granja.getDinero());
                                    contDias++;
                                } else {
                                    System.out.println("No tienes tantos conejos para vender");
                                    contDias++;
                                }
                            }
                            break;
                        case 3:
                            if (granja.sizeVacas() == 0) {
                                System.out.println("No tiene vacas para vender");
                                contDias++;
                            } else {
                                System.out.println("Hay " + granja.sizeVacas() + " vacas en el inventario");
                                System.out.println("Sus nombres son:");
                                granja.printVacas();
                                System.out.println("Ingrese cuantas vacas desea vender: ");
                                int numVenta = nums.nextInt();
                                if (numVenta <= granja.sizeVacas()) {
                                    for (int i = 0; i < numVenta; i++) {
                                        System.out.println("Bye Bye " + granja.vacas.get(0).getNombre() + "~");
                                        granja.vacas.remove(0);
                                    }
                                    System.out.println("Se han vendido " + numVenta + " vacas");
                                    granja.setDinero(granja.getDinero() + (400 * numVenta));
                                    System.out.println("Monets: " + granja.getDinero());
                                    contDias++;
                                } else {
                                    System.out.println("No tienes tantas vacas para vender");
                                    contDias++;
                                }
                            }
                            break;
                        default:
                            System.out.println("Opción Inválida");
                            contDias++;
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Usted ha decido pasar el día durmiendo");
                    System.out.println("Siente como su cuerpo se relaja...");
                    System.out.println("Poco a poco pierde la conciencia...");
                    System.out.println("El trabajo se puede dejar para otro dia......");
                    contDias++;
                    break;
                case 6:
                    if (granja.getDinero() < 250000) {
                        System.out.println("No te puedes casar todavía");
                        contDias++;
                    } else {
                        System.out.println("< F E L I C I D A D E S >");
                        switch (numEsposas) {
                            case 0:
                                System.out.println("Usted se ha casado con Madeline");
                                break;
                            case 1:
                                System.out.println("Usted se ha casado con Ana Magdalena");
                                break;
                            case 2:
                                System.out.println("Usted se ha casado con Margena María");
                                break;
                            case 3:
                                System.out.println("Usted se ha casado con Mari Puri");
                                break;
                            case 4:
                                System.out.println("Usted se ha casado con Natalia");
                                break;
                            case 5:
                                System.out.println("Usted se ha casado con Rosaria");
                                break;
                            case 6:
                                System.out.println("Usted se ha casado con Pristina");
                                break;
                            case 7:
                                System.out.println("Usted se ha casado con Emilia");
                                break;
                            case 8:
                                System.out.println("Usted se ha casado con Samantha");
                                break;
                            case 9:
                                System.out.println("Usted se ha casado con Sofia");
                                break;
                        }
                        System.out.println("< A D V E R T E N C I A >");
                        System.out.println("Tener más de una esposa puede traer consecuencias...");
                        numEsposas++;
                        int randomEsposas = 0;
                        if (numEsposas == 2) {
                            randomEsposas = new Random().nextInt((100 - 0) + 1) + 1;
                            if (random > 0 && random < 11) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 3) {
                            if (random < 21) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 4) {
                            if (random < 31) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 5) {
                            if (random < 41) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 6) {
                            if (random < 51) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 7) {
                            if (random < 61) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 8) {
                            if (random < 71) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 9) {
                            if (random < 81) {
                                System.out.println("Sus esposas se dieron cuenta que usted las esta engañando...");
                                System.out.println("Le tendieron una trampa y lo acuchillaron a muerte...");
                                muerte = true;
                            }
                        } else if (numEsposas == 1) {
                            randomEsposas = new Random().nextInt((100 - 0) + 1) + 0;
                            if (randomEsposas > 0 && randomEsposas < 41) {
                                System.out.println("Su esposa ha decido que quiere un divorcio");
                                if (numHijos > 0) {
                                    System.out.println("Como parte de la manutención de los hijos, el juez ha declarado que debe darle toda sus posesiones a su esposa...");
                                    for (Conejos conejo : granja.conejos) {
                                        granja.conejos.remove(conejo);
                                    }
                                    for (Vegetales vegetal : granja.vegetales) {
                                        granja.vegetales.remove(vegetal);
                                    }
                                    for (Vacas vaca : granja.vacas) {
                                        granja.vacas.remove(vaca);
                                    }
                                    granja.setDinero(0);
                                }
                            }
                        }
                        contDias++;
                    }
                    break;
                case 7:
                    if (casado) {
                        int randomChild = 0;
                        switch (numEsposas) {
                            case 1:
                                randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                if (randomChild == 0) {
                                    System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                } else {
                                    System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                    numHijos = numHijos + randomChild;
                                }
                                contDias++;
                                break;
                            case 2:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]");
                                int choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 6:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]\n6. [Rosaria]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 6:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Rosaria tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Rosaria");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 7:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]\n6. [Rosaria]\n7. [Pristina]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 6:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Rosaria tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Rosaria");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 7:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Pristina tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Pristina");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 8:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]\n6. [Rosaria]\n7. [Pristina]\n8. [Emilia]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 6:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Rosaria tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Rosaria");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 7:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Pristina tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Pristina");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 8:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Emilia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Emilia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }
                                break;
                            case 9:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]\n6. [Rosaria]\n7. [Pristina]\n8. [Emilia]\n9. [Samantha]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 6:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Rosaria tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Rosaria");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 7:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Pristina tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Pristina");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 8:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Emilia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Emilia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 9:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Samantha tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Samantha");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }

                                break;
                            case 10:
                                System.out.println("¿Con quién desea tener hijos?");
                                System.out.println("1. [Madeline]\n2. [Ana Magdalena]\n3. [Margena María]\n4. [Mari Puri]\n5. [Natalia]\n6. [Rosaria]\n7. [Pristina]\n8. [Emilia]\n9. [Samantha]\n10. [Sofia]");
                                choiceWife = nums.nextInt();
                                switch (choiceWife) {
                                    case 1:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Madeline tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Madeline");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 2:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Ana Magdalena tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Ana Magdalena");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 3:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Margena María tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Margena María");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 4:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Mari Puri tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Mari Puri");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 5:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Natalia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Natalia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 6:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Rosaria tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Rosaria");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 7:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Pristina tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Pristina");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 8:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Emilia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Emilia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 9:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Samantha tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Samantha");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    case 10:
                                        randomChild = new Random().nextInt((5 - 0) + 1) + 0;
                                        if (randomChild == 0) {
                                            System.out.println("Sofia tuvo un aborto espontáneo y perdió al bebe");
                                        } else {
                                            System.out.println("Usted tuvo " + randomChild + " niños con Sofia");
                                            numHijos = numHijos + randomChild;
                                        }
                                        contDias++;
                                        break;
                                    default:
                                        System.out.println("Opción Inválida");
                                        contDias++;
                                        break;
                                }

                                break;
                        }
                    } else {
                        System.out.println("No puede tener hijos sin haberse casado");
                        contDias++;
                    }
                    break;
                case 8:
                    if (numHijos > 0) {
                        System.out.println("¿Cuántos niños desea vender?");
                        System.out.println("---------- ANALISIS  DE  LA  GRANJA ----------");
                        System.out.println("Tiene " + numHijos + " Hijos (1500)");
                        System.out.println("----------------------------------------------");
                        int choiceChild = nums.nextInt();
                        if (choiceChild <= numHijos) {
                            System.out.println("Se han vendido " + numHijos + " niños");
                            granja.setDinero(granja.getDinero() + (1500 * choiceChild));
                            contDias++;
                        } else {
                            System.out.println("No tiene suficientes hijos");
                            contDias++;
                        }
                    } else {
                        System.out.println("No puedes acceder a este mercado todavia...");
                    }
                default:
                    System.out.println("Opción inválida");
                    contDias++;
                    break;
            }
            if (diasFaltantes != 0) {
                diasFaltantes--;
            }
            if (granja.getDinero() > 1000000) {
                millonario = true;
            }
            if (casado == false && contDias > 100) {
                System.out.println("Usted ha pasado mucho tiempo solo");
                System.out.println("Obtuvo mucho dinero, pero nadie con quien compartirlo");
                System.out.println("Una vida solitaria no vale la pena...");
                System.out.println("Cuestionando su existencia, camino en frente de un camion en la carretera...");
                muerte = true;
            }
            if (numHijos > 75) {
                System.out.println("Usted ha tenido muchos hijos");
                System.out.println("Tantos, que muchos se pelean para ver quien será el sucesor");
                System.out.println("La codicia no pudo ser contenido, y entre la guerra por tu fortuna, fuiste asesinado...");
                muerte = true;
            }
            if (casado && millonario) {
                System.out.println("El usuario estaba cansado...");
                System.out.println("Empezó con nada, pero logro obtener todo...");
                System.out.println("Pero... ¿ahora qué le queda...?");
                System.out.println("Sin proposito alguno en la vida, agarró un cuchillo");
                System.out.println("Se dirigió hacia su esposa y la apuñalo a muerte");
                if (numHijos > 0) {
                    System.out.println("Luego de su esposa, vinieron sus hijos...");
                    System.out.println("Ellos todavía estaban muy pequeños como para luchar...");
                    System.out.println("Los llantos resonaban en su cabeza...");
                }
                System.out.println("Ahora solo queda usted");
                System.out.println("Pero eso iba a cambiar");
                System.out.println("Con una arma en mano, apunta a su boca...");
                muerte = true;
            }
            if (granja.getDinero() == 0 && granja.sizeConejos() == 0 && granja.sizeVegetales() == 0 && granja.sizeVacas() == 0) {
                System.out.println("Usted ha quedado pobre...");
                System.out.println("Todo por lo que trabajo se le fue arrebatado...");
                System.out.println("Solo queda su vida, pero eso también acabara pronto...");
                System.out.println("Ya que esta cayendo de un puente ahora");
                muerte = true;
            }
        } while (muerte == false);
    }

}
