package algoritmoconjugacionfrances;

import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;

/**
 *
 * @author vmpor
 */
public class AlgoritmoConjugacionFrances {

    public static void main(String[] args) {
        String verbo;
        Scanner scan = new Scanner(System.in);
//Busca verbo conditionnel present
//        while (true) {
            System.out.println("Verbo: ");
            verbo = scan.next();
            System.out.println("Conditionnel present");
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaConditionnelPresent(verbo, i));
            }
//        }

//Busca verbo passe compose
        System.out.println("Passe compose");
        //while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaPasseComposeIndicativo(verbo, i));
            }
//        }
//Busca verbo present
        System.out.println("Present simple");
//        while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaPresenteIndicativo(verbo, i));
            }
//        }
//Busca verbo 
//        while (true) {
//            System.out.println("Verbo a buscar: ");
//            verbo = scan.next();
//            Verbos verbos = new Verbos();
//            System.out.println(verbos.buscaVerbo(verbo));
//        }
//Busca verbo L'imparfait
          System.out.println("L'imparfait");
//        while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaLimparfaitIndicativo(verbo, i));
            }
//        }
//Busca verbo Plus que parfait
System.out.println("Plus que parfait");
//        while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaPlusqueparfaitIndicativo(verbo, i));
            }
//        }
////Busca verbo Futur Simple
        System.out.println("Futur simple");
//        while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaFuturSimple(verbo, i));
            }
//        }
////Busca verbo Conditionnel passé
        System.out.println("Conditionnel passé");
//        while (true) {
//            System.out.println("Verbo: ");
//            verbo = scan.next();
            for (int i = 0; i < 9; i++) {
                System.out.println(conjugaConditionnelPasse(verbo, i));
            }
//        }
////Cuenta verbos
//        Verbos verbos = new Verbos();
//        System.out.println("Todos los verbos: " + verbos.contarTodosVerbos());
//        System.out.println("Verbos regulares: " + verbos.contarVerbosRegulares());
//        System.out.println("Verbos irregulares: " + verbos.contarVerbosIrregulares());
    }
    
    public static String conjugaConditionnelPasse(String verbo, int sujeto){
        String salida;
        String fin="";
        boolean etreAvoir = false;
        Verbos verbos = new Verbos();
        String[] verbosMovimiento = (String[]) verbos.getVerbosMovimiento();
        for (int i = 0; i < verbosMovimiento.length; i++) {
            if (verbo.equalsIgnoreCase(verbosMovimiento[i])) {
                etreAvoir = true;
                break;
            }
        }
        if (etreAvoir) {
            //Es un verbo de movimiento
            salida=conjugaConditionnelPresent("être", sujeto)+" ";
            //Terminaciones del verbo de movimiento
            if (sujeto == 3) {
                fin = "e";
            } //Nous
            else if (sujeto == 5) {
                fin = "s";
            } //Vous
            else if (sujeto == 6) {
                fin = "s";
            } //Ils
            else if (sujeto == 7) {
                fin = "s";
            } //Elles
            else if (sujeto == 8) {
                fin = "es";
            }
        } else {
            salida=conjugaConditionnelPresent("avoir", sujeto)+" ";            
        }

        String terminacion;
        //Irregular
        if (verbos.isIrregularParticipePasse(verbo)) {
            terminacion = verbos.devuelveParticipePasseIrregular(verbo);
            salida += terminacion + fin;
        } else {
            //Regular
            if (verbo.length() > 5) {
                //Verbos terminación -ettre
                terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                if (terminacion.equalsIgnoreCase("ettre")) {
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "is" + fin;
                } //Verbos terminación ître
                else if (terminacion.equalsIgnoreCase("aître")) {
                    terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "u" + fin;
                }
            }
            //Verbos terminación ire
            terminacion = verbo.substring(verbo.length() - 3, verbo.length());
            if (terminacion.equalsIgnoreCase("ire")) {
                String radical = verbo.substring(0, verbo.length() - 2);
                return salida += radical + "t" + fin;
            } else {

                terminacion = verbo.substring(verbo.length() - 2, verbo.length());
                //Verbos terminacion -er
                if (terminacion.equalsIgnoreCase("er")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "é" + fin;
                } //Verbos terminacion -ir
                else if (terminacion.equalsIgnoreCase("ir")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "i" + fin;
                } //Verbos terminacion -re
                else if (terminacion.equalsIgnoreCase("re")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "u" + fin;
                }
            }
        }
        //Error
        return salida;
    }
    

    public static String conjugaConditionnelPresent(String verbo, int sujeto) {
        if (verbo.equalsIgnoreCase("être")) {
            //verbos con être
            if (sujeto == 0) {
                return "Serais";
            } //Tu
            else if (sujeto == 1) {
                return "Serais";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return "Serait";
            } //Nous
            else if (sujeto == 5) {
                return "Serions";
            } //Vous
            else if (sujeto == 6) {
                return "Seriez";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                return "Seraient";
            }
        } else if (verbo.equalsIgnoreCase("avoir")) {
            //verbos con avoir
            if (sujeto == 0) {
                return "Aurais";
            } //Tu
            else if (sujeto == 1) {
                return "Aurais";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return "Aurait";
            } //Nous
            else if (sujeto == 5) {
                return "Aurions";
            } //Vous
            else if (sujeto == 6) {
                return "Auriez";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                return "Auraient";
            }
        } else {
            //Raíz en futur simple
            String salida = conjugaFuturSimple(verbo, sujeto);
            String terminacionVerbo;
            //Cantidad de terminación a quitar dependiendo el sujeto
            switch (sujeto) {
                case 0:
                case 1:
                case 6:
                    salida = salida.substring(0, salida.length() - 2);
                    break;
                case 2:
                case 3:
                case 4:
                    salida = salida.substring(0, salida.length() - 1);
                    break;
                default:
                    salida = salida.substring(0, salida.length() - 3);
                    break;
            }
            
            //Terminacion del verbo en infinitivo
            if (verbo.length() > 3) {
                terminacionVerbo = verbo.substring(verbo.length() - 3, verbo.length());
            } else {
                terminacionVerbo = verbo.substring(verbo.length() - 2, verbo.length());
            }
            //Terminaciones del l'imparfait
            if (sujeto == 0 || sujeto == 1) {
                salida += "ais";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida += "ait";
            } //Nous
            else if (sujeto == 5) {
                if (salida.charAt(salida.length() - 1) == 'ç') {
                    salida = salida.substring(0, salida.length() - 1) + "c";
                    salida += "ions";
                } else if (terminacionVerbo.equalsIgnoreCase("ger")) {
                    salida = salida.substring(0, salida.length() - 1);
                    salida += "ions";
                } else {
                    salida += "ions";
                }
            } //Vous
            else if (sujeto == 6) {
                if (salida.charAt(salida.length() - 1) == 'ç') {
                    salida = salida.substring(0, salida.length() - 1) + "c";
                    salida += "iez";
                } else if (terminacionVerbo.equalsIgnoreCase("ger")) {
                    salida = salida.substring(0, salida.length() - 1);
                    salida += "iez";
                } else {
                    salida += "iez";
                }
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida += "aient";
            }

            return salida;
        }
        return "error";
    }

    public static String conjugaFuturSimple(String verbo, int sujeto) {
        String salida = "";
        Verbos verbos = new Verbos();
        if (verbos.isIrregularFutur(verbo)) {
            return verbos.devuelveFuturIrregular(verbo, sujeto);
        }
        if (verbo.equalsIgnoreCase("Être")) {
            //verbos con être
            if (sujeto == 0) {
                salida = "Serai";
            } //Tu
            else if (sujeto == 1) {
                salida = "Seras";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Sera";
            } //Nous
            else if (sujeto == 5) {
                salida = "Serons";
            } //Vous
            else if (sujeto == 6) {
                salida = "Serez";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Seront";
            }
            return salida;
        } else if (verbo.equalsIgnoreCase("Avoir")) {
            //verbos con avoir
            //Je
            if (sujeto == 0) {
                salida = "Aurai";
            } //Tu
            else if (sujeto == 1) {
                salida = "Auras";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Aura";
            } //Nous
            else if (sujeto == 5) {
                salida = "Aurons";
            } //Vous
            else if (sujeto == 6) {
                salida = "Aurez";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Auront";
            }
            return salida;
        }
        //Verbos del tercer grupo
        String terminacion = verbo.substring(verbo.length() - 3, verbo.length());
        //A algunos verbos con terminación rir se le agrega otra "r" antes de las terminaciones de future simple
        if (terminacion.equalsIgnoreCase("rir")) {
            if (verbo.equalsIgnoreCase("offrir") || verbo.equalsIgnoreCase("ouvrir") || verbo.equalsIgnoreCase("souffrir")) {
                salida = verbo;
            } else {
                salida = verbo.substring(0, verbo.length() - 2) + "r";
            }
        } //Los verbos terminacion yer se les sustituyé la y por i
        else if (terminacion.equalsIgnoreCase("yer")) {
            salida = verbo.substring(0, verbo.length() - 3) + "ier";
        } else if (terminacion.substring(1, terminacion.length()).equalsIgnoreCase("re")) {
            salida = verbo.substring(0, verbo.length() - 1);
        } else if (verbo.equalsIgnoreCase("jeter") || verbo.equalsIgnoreCase("appeler")) {
            String radical = verbo.substring(0, verbo.length() - 3);
            String doble;
            if (verbo.charAt(verbo.length() - 3) == 't') {
                doble = "tter";
            } else {
                doble = "ller";
            }
            salida = radical + doble;
        } else if (verbo.equalsIgnoreCase("acheter") || verbo.equalsIgnoreCase("modeler") || verbo.equalsIgnoreCase("amener") || verbo.equalsIgnoreCase("peser")) {
            salida = verbo.replaceFirst("e", "è");
        } else {
            salida = verbo;

        }

        //Terminaciones de futur simple
        if (sujeto == 0) {
            salida += "ai";
        } //Tu
        else if (sujeto == 1) {
            salida += "as";
        } //Il/Elle/On
        else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
            salida += "a";
        } //Nous
        else if (sujeto == 5) {
            salida += "ons";
        } //Vous
        else if (sujeto == 6) {
            salida += "ez";
        } //Ils/Elles
        else if (sujeto == 7 || sujeto == 8) {
            salida += "ont";
        }
        return salida;

    }

    public static String conjugaPlusqueparfaitIndicativo(String verbo, int sujeto) {
        String salida = "";
        String fin = "";
        //true para etre y false para avoir
        boolean etreAvoir = false;

        Verbos verbos = new Verbos();
        String[] verbosMovimiento = (String[]) verbos.getVerbosMovimiento();
        for (int i = 0; i < verbosMovimiento.length; i++) {
            if (verbo.equalsIgnoreCase(verbosMovimiento[i])) {
                etreAvoir = true;
                break;
            }
        }
        if (etreAvoir) {
            //verbos con être
            if (sujeto == 0) {
                salida = "Étais ";
            } //Tu
            else if (sujeto == 1) {
                salida = "Étais ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Était ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Étions ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Étiez ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Étaient ";
            }
        } else {
            //verbos con avoir
            //Je
            if (sujeto == 0) {
                salida = "Avais ";
            } //Tu
            else if (sujeto == 1) {
                salida = "Avais ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Avait ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Avions ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Aviez ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Avaient ";
            }
        }
        if (etreAvoir) {
            //Elle
            if (sujeto == 3) {
                fin = "e";
            } //Nous
            else if (sujeto == 5) {
                fin = "s";
            } //Vous
            else if (sujeto == 6) {
                fin = "s";
            } //Ils
            else if (sujeto == 7) {
                fin = "s";
            } //Elles
            else if (sujeto == 8) {
                fin = "es";
            }
        }

        String terminacion;
        //Irregular
        if (verbos.isIrregularParticipePasse(verbo)) {
            terminacion = verbos.devuelveParticipePasseIrregular(verbo);
            salida += terminacion + fin;
        } else {
            //Regular
            if (verbo.length() > 5) {
                //Verbos terminación -ettre
                terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                if (terminacion.equalsIgnoreCase("ettre")) {
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "is" + fin;
                } //Verbos terminación ître
                else if (terminacion.equalsIgnoreCase("aître")) {
                    terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "u" + fin;
                }
            }
            //Verbos terminación ire
            terminacion = verbo.substring(verbo.length() - 3, verbo.length());
            if (terminacion.equalsIgnoreCase("ire")) {
                String radical = verbo.substring(0, verbo.length() - 2);
                return salida += radical + "t" + fin;
            } else {

                terminacion = verbo.substring(verbo.length() - 2, verbo.length());
                //Verbos terminacion -er
                if (terminacion.equalsIgnoreCase("er")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "é" + fin;
                } //Verbos terminacion -ir
                else if (terminacion.equalsIgnoreCase("ir")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "i" + fin;
                } //Verbos terminacion -re
                else if (terminacion.equalsIgnoreCase("re")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "u" + fin;
                }
            }
        }
        //Error
        return salida;
    }

    public static String conjugaLimparfaitIndicativo(String verbo, int sujeto) {
        String salida = "";
        String terminacionVerbo;
        if (verbo.length() > 3) {
            terminacionVerbo = verbo.substring(verbo.length() - 3, verbo.length());
        } else {
            terminacionVerbo = verbo.substring(verbo.length() - 2, verbo.length());
        }
        //Excepciones
        if (verbo.equalsIgnoreCase("être")) {
            salida = "Ét";
        } else {
            //Se conjuga el verbo en la tercera persona del plural en presente
            Verbos verbos = new Verbos();

            if (!verbos.isIrregular(verbo)) {
                salida = conjugaPresenteIndicativo(verbo, 5);
            } else {
                salida = verbos.devuelveConjugacionIrregular(verbo, 5);
            }
            //Radical del verbo
            salida = salida.substring(0, salida.length() - 3);
        }

        //Je/Tu
        if (sujeto == 0 || sujeto == 1) {
            salida += "ais";
        } //Il/Elle/On
        else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
            salida += "ait";
        } //Nous
        else if (sujeto == 5) {
            if (salida.charAt(salida.length() - 1) == 'ç') {
                salida = salida.substring(0, salida.length() - 1) + "c";
                salida += "ions";
            } else if (terminacionVerbo.equalsIgnoreCase("ger")) {
                salida = salida.substring(0, salida.length() - 1);
                salida += "ions";
            } else {
                salida += "ions";
            }
        } //Vous
        else if (sujeto == 6) {
            if (salida.charAt(salida.length() - 1) == 'ç') {
                salida = salida.substring(0, salida.length() - 1) + "c";
                salida += "iez";
            } else if (terminacionVerbo.equalsIgnoreCase("ger")) {
                salida = salida.substring(0, salida.length() - 1);
                salida += "iez";
            } else {
                salida += "iez";
            }
        } //Ils/Elles
        else if (sujeto == 7 || sujeto == 8) {
            salida += "aient";
        }

        //Error
        return salida;
    }

    public static String conjugaPasseComposeIndicativo(String verbo, int sujeto) {
        String salida = "";
        String fin = "";
        //true para etre y false para avoir
        boolean etreAvoir = false;

        Verbos verbos = new Verbos();
        String[] verbosMovimiento = (String[]) verbos.getVerbosMovimiento();
        for (int i = 0; i < verbosMovimiento.length; i++) {
            if (verbo.equalsIgnoreCase(verbosMovimiento[i])) {
                etreAvoir = true;
                break;
            }
        }
        if (etreAvoir) {
            //verbos con être
            if (sujeto == 0) {
                salida = "Suis ";
            } //Tu
            else if (sujeto == 1) {
                salida = "Es ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Est ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Sommes ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Êtes ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Sont ";
            }
        } else {
            //verbos con avoir
            //Je
            if (sujeto == 0) {
                salida = "Ai ";
            } //Tu
            else if (sujeto == 1) {
                salida = "As ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "A ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Avons ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Avez ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Ont ";
            }
        }
        if (etreAvoir) {
            //Elle
            if (sujeto == 3) {
                fin = "e";
            } //Nous
            else if (sujeto == 5) {
                fin = "s";
            } //Vous
            else if (sujeto == 6) {
                fin = "s";
            } //Ils
            else if (sujeto == 7) {
                fin = "s";
            } //Elles
            else if (sujeto == 8) {
                fin = "es";
            }
        }

        String terminacion;
        //Irregular
        if (verbos.isIrregularParticipePasse(verbo)) {
            terminacion = verbos.devuelveParticipePasseIrregular(verbo);
            salida += terminacion + fin;
        } else {
            //Regular
            if (verbo.length() > 5) {
                //Verbos terminación -ettre
                terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                if (terminacion.equalsIgnoreCase("ettre")) {
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "is" + fin;
                } //Verbos terminación ître
                else if (terminacion.equalsIgnoreCase("aître")) {
                    terminacion = verbo.substring(verbo.length() - 5, verbo.length());
                    String radical = verbo.substring(0, verbo.length() - 5);
                    return salida += radical + "u" + fin;
                }
            }
            //Verbos terminación ire
            terminacion = verbo.substring(verbo.length() - 3, verbo.length());
            if (terminacion.equalsIgnoreCase("ire")) {
                String radical = verbo.substring(0, verbo.length() - 2);
                return salida += radical + "t" + fin;
            } else {

                terminacion = verbo.substring(verbo.length() - 2, verbo.length());
                //Verbos terminacion -er
                if (terminacion.equalsIgnoreCase("er")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "é" + fin;
                } //Verbos terminacion -ir
                else if (terminacion.equalsIgnoreCase("ir")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "i" + fin;
                } //Verbos terminacion -re
                else if (terminacion.equalsIgnoreCase("re")) {
                    String radical = verbo.substring(0, verbo.length() - 2);
                    return salida += radical + "u" + fin;
                }
            }
        }
        //Error
        return salida;
    }

    public static String conjugaPresenteIndicativo(String verbo, int sujeto) {
        //Es irregular
        Verbos verbos = new Verbos();
        if (verbos.isIrregular(verbo)) {
            return verbos.devuelvePresentIrregular(verbo, sujeto);
        }
        //Verbos del tercer grupo
        String terminacion = verbo.substring(verbo.length() - 3, verbo.length());
        //Verbos terminación -dre
        if (terminacion.equalsIgnoreCase("dre")) {
            String radical = verbo.substring(0, verbo.length() - 2);
            //Je y Tu
            if (sujeto == 0 || sujeto == 1) {
                return radical + "s";
            }
            //Il/Elle/On
            if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                if (radical.charAt(radical.length() - 1) == 'd' || radical.charAt(radical.length() - 1) == 't') {
                    return radical;
                }
                return radical + "t";
            }
            if (verbo.equalsIgnoreCase("comprendre")) {
                radical = verbo.substring(0, verbo.length() - 3);
                //Ils/Elles
                if (sujeto == 7 || sujeto == 8) {
                    return radical + "nent";
                }
            }
            //Nous
            if (sujeto == 5) {
                return radical + "ons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "ez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "ent";
            }

        }
        //Verbos terminacion -ttre
        terminacion = verbo.substring(verbo.length() - 4, verbo.length());
        if (terminacion.equalsIgnoreCase("ttre")) {
            String radical = verbo.substring(0, verbo.length() - 4);
            //Je y Tu
            if (sujeto == 0 || sujeto == 1) {
                return radical + "ts";
            }
            //Il/Elle/On
            if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return radical + "t";
            }
            //Nous
            if (sujeto == 5) {
                return radical + "ttons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "ttez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "ttent";
            }
        }
        //Verbos terminacion -ître
        terminacion = verbo.substring(verbo.length() - 4, verbo.length());
        if (terminacion.equalsIgnoreCase("ître")) {
            String radical = verbo.substring(0, verbo.length() - 4);
            //Je y Tu
            if (sujeto == 0 || sujeto == 1) {
                return radical + "is";
            }
            //Il/Elle/On
            if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return radical + "ît";
            }
            //Nous
            if (sujeto == 5) {
                return radical + "issons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "issez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "issent";
            }
        }

        //verbos terminados en -re
        terminacion = verbo.substring(verbo.length() - 2, verbo.length());
        if (terminacion.equalsIgnoreCase("re")) {
            String radical = verbo.substring(0, verbo.length() - 2);
            //Je y Tu
            if (sujeto == 0 || sujeto == 1) {
                return radical + "s";
            }
            //Il/Elle/On
            if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return radical + "t";
            }
            //Nous
            if (sujeto == 5) {
                return radical + "sons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "sez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "sent";
            }
        }

        terminacion = verbo.substring(verbo.length() - 2, verbo.length());
        //Verbos del primer grupo
        if (terminacion.equals("er")) {
            String radical = verbo.substring(0, verbo.length() - 2);
            //Verbos temrinación -cer cambio en nous
            if (verbo.charAt(verbo.length() - 3) == 'c') {
                //Nous
                if (sujeto == 5) {
                    return radical.substring(0, radical.length() - 1) + "çons";
                }
            }
            //Verbos teminación -ger cambio en nous
            if (verbo.charAt(verbo.length() - 3) == 'g') {
                //Nous
                if (sujeto == 5) {
                    return radical + "eons";
                }
            }
            //Verbos terminación con è+consonante+er cambio en je, il, elle, tu, ils, y elles
            //Verbos terminados en -eter o en -eler (como jeter y appeler) en lugar de cambiar la e por è,
            // como en el caso anterior, duplican la consonante conviertiéndola en tt o ll,
            // (Nótese que los verbos acheter y modeler siguen la regla anterior de cambiar e por è).
            if ((verbo.charAt(verbo.length() - 4) == 'é' || verbo.charAt(verbo.length() - 4) == 'e') && (verbo.charAt(verbo.length() - 3) != 'a' && verbo.charAt(verbo.length() - 3) != 'e' && verbo.charAt(verbo.length() - 3) != 'i' && verbo.charAt(verbo.length() - 3) != 'o' && verbo.charAt(verbo.length() - 3) != 'u')) {
                radical = verbo.substring(0, verbo.length() - 4);
                if (verbo.equalsIgnoreCase("jeter") || verbo.equalsIgnoreCase("appeler")) {
                    radical = verbo.substring(0, verbo.length() - 3);
                    String doble;
                    if (verbo.charAt(verbo.length() - 3) == 't') {
                        doble = "tt";
                    } else {
                        doble = "ll";
                    }
                    //Je y Il/Elle/On
                    if (sujeto == 0 || sujeto == 2 || sujeto == 3 || sujeto == 4) {
                        return radical + doble + "e";
                    }
                    //Tu
                    if (sujeto == 1) {
                        return radical + doble + "es";
                    }
                    //Nous
                    if (sujeto == 5) {
                        return radical + verbo.charAt(verbo.length() - 3) + "ons";
                    }
                    //Vous
                    if (sujeto == 6) {
                        return radical + verbo.charAt(verbo.length() - 3) + "ez";
                    }
                    //Ils/Elles
                    if (sujeto == 7 || sujeto == 8) {
                        return radical + doble + "ent";
                    }
                }
                //Je y Il/Elle/On
                if (sujeto == 0 || sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return radical + "è" + verbo.charAt(verbo.length() - 3) + "e";
                }
                //Tu
                if (sujeto == 1) {
                    return radical + "è" + verbo.charAt(verbo.length() - 3) + "es";
                }
                //Nous
                if (sujeto == 5) {
                    return radical + "e" + verbo.charAt(verbo.length() - 3) + "ons";
                }
                //Vous
                if (sujeto == 6) {
                    return radical + "e" + verbo.charAt(verbo.length() - 3) + "ez";
                }
                //Ils/Elles
                if (sujeto == 7 || sujeto == 8) {
                    return radical + "è" + verbo.charAt(verbo.length() - 3) + "ent";
                }
            }
            radical = verbo.substring(0, verbo.length() - 2);
            //verbos terminados en -oyer, -ayer y -uyer (como nettoyer y ennuyer) tienen la particularidad de cambiar
            // la y por i delante de las terminaciones que no se pronuncian.
            terminacion = verbo.substring(verbo.length() - 4, verbo.length());
            if (terminacion.equalsIgnoreCase("oyer") || terminacion.equalsIgnoreCase("uyer") || terminacion.equalsIgnoreCase("ayer")) {
                radical = verbo.substring(0, verbo.length() - 3);
                //Je y Il/Elle/On
                if (sujeto == 0 || sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return radical + "ie";
                }
                //Tu
                if (sujeto == 1) {
                    return radical + "ies";
                }
                if (sujeto == 5) {
                    return radical + "yons";
                }
                if (sujeto == 6) {
                    return radical + "yez";
                }
                //Ils/Elles
                if (sujeto == 7 || sujeto == 8) {
                    return radical + "ient";
                }
            }
            radical = verbo.substring(0, verbo.length() - 2);
            //verbos terminados en -oyer, -ayer y -uyer (como nettoyer y ennuyer) tienen la particularidad de cambiar
            // la y por i delante de las terminaciones que no se pronuncian.
            terminacion = verbo.substring(verbo.length() - 4, verbo.length());
            if (terminacion.equalsIgnoreCase("oyer") || terminacion.equalsIgnoreCase("uyer") || terminacion.equalsIgnoreCase("ayer")) {
                radical = verbo.substring(0, verbo.length() - 3);
                //Je y Il/Elle/On
                if (sujeto == 0 || sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return radical + "ie";
                }
                //Tu
                if (sujeto == 1) {
                    return radical + "ies";
                }
                if (sujeto == 5) {
                    return radical + "yons";
                }
                if (sujeto == 6) {
                    return radical + "yez";
                }
                //Ils/Elles
                if (sujeto == 7 || sujeto == 8) {
                    return radical + "ient";
                }
            }

            //Verbos terminación -er normal
            //Je y Il/Elle/On
            if (sujeto == 0 || sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return radical + 'e';
            }
            //Tu
            if (sujeto == 1) {
                return radical + "es";
            }
            //Nous
            if (sujeto == 5) {
                return radical + "ons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "ez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "ent";
            } //Algún error
            else {
                return radical;
            }
        } //Verbos del segundo grupo
        else if (terminacion.equals("ir")) {
            String radical = verbo.substring(0, verbo.length() - 2);
            //Je y Tu
            if (sujeto == 0 || sujeto == 1) {
                return radical + "is";
            }
            //Il/Elle/On
            if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                return radical + "it";
            }
            //Nous
            if (sujeto == 5) {
                return radical + "issons";
            }
            //Vous
            if (sujeto == 6) {
                return radical + "issez";
            }
            //Ils/Elles
            if (sujeto == 7 || sujeto == 8) {
                return radical + "issent";
            } //Algún error
            else {
                return radical;
            }
        }
        //Algún error
        return verbo;
    }
}
