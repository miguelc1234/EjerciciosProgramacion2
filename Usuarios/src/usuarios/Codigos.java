/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Codigos {

    public static Scanner teclado;
    public static int intNumeros;
    public static int intContador = 0;
    public static String strLetras;
    public static String strPares = "";

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el texto ");
        String strTexto = teclado.nextLine();
        char PrimerCaracter = strTexto.toLowerCase().charAt(0);
        
        if (PrimerCaracter == '_'){
            strTexto = strTexto.replace("_", "");
        }
        
        if (isNumeric(strTexto) == false) {
            //letras
            //strTexto = teclado.nextLine();

            for (int i = 0; i < strTexto.length(); i++) {

                char letra = strTexto.toLowerCase().charAt(i);

                switch (letra) {
                    case 'a':
                        System.out.print("11");
                        break;
                    case 'b':
                        System.out.print("12");
                        break;
                    case 'c':
                        System.out.print("13");
                        break;
                    case 'd':
                        System.out.print("14");
                        break;
                    case 'e':
                        System.out.print("15");
                        break;
                    case 'f':
                        System.out.print("16");
                        break;
                    case 'g':
                        System.out.print("17");
                        break;
                    case 'h':
                        System.out.print("18");
                        break;
                    case 'i':
                        System.out.print("19");
                        break;
                    case 'j':
                        System.out.print("20");
                        break;
                    case 'k':
                        System.out.print("31");
                        break;
                    case 'l':
                        System.out.print("32");
                        break;
                    case 'm':
                        System.out.print("33");
                        break;
                    case 'n':
                        System.out.print("34");
                        break;
                    case 'ñ':
                        System.out.print("35");
                        break;
                    case 'o':
                        System.out.print("36");
                        break;
                    case 'p':
                        System.out.print("37");
                        break;
                    case 'q':
                        System.out.print("38");
                        break;
                    case 'r':
                        System.out.print("39");
                        break;
                    case 's':
                        System.out.print("40");
                        break;
                    case 't':
                        System.out.print("61");
                        break;
                    case 'u':
                        System.out.print("62");
                        break;
                    case 'v':
                        System.out.print("63");
                        break;
                    case 'w':
                        System.out.print("64");
                        break;
                    case 'x':
                        System.out.print("65");
                        break;
                    case 'y':
                        System.out.print("66");
                        break;
                    case 'z':
                        System.out.print("67");
                        break;
                    case '1':
                        System.out.print("*");
                        break;
                    case '2':
                        System.out.print("/");
                        break;
                    case '3':
                        System.out.print("\\");
                        break;
                    case '4':
                        System.out.print("+");
                        break;
                    case '5':
                        System.out.print("-");
                        break;
                    case '6':
                        System.out.print("<");
                        break;
                    case '7':
                        System.out.print(">");
                        break;
                    case '8':
                        System.out.print("#");
                        break;
                    case '9':
                        System.out.print("\"");
                        break;
                    case '0':
                        System.out.print("!");
                        break;
                    case ' ':
                        System.out.print("U");
                        break;
                    default:
                        System.out.println("no existe el codigo");
                        break;
                }

            }

        } else {
            //numeros

            if (strTexto.length() % 2 == 0) {

                for (int i = 0; i < strTexto.length(); i++) {

                    char letra = strTexto.charAt(i);

                    strPares = strPares + letra;
                    intContador = intContador + 1;

                    if (intContador == 2) {

                        switch (strPares) {
                            case "11":
                                System.out.print("a");
                                break;
                            case "12":
                                System.out.print("b");
                                break;
                            case "13":
                                System.out.print("c");
                                break;
                            case "14":
                                System.out.print("d");
                                break;
                            case "15":
                                System.out.print("e");
                                break;
                            case "16":
                                System.out.print("f");
                                break;
                            case "17":
                                System.out.print("g");
                                break;
                            case "18":
                                System.out.print("h");
                                break;
                            case "19":
                                System.out.print("i");
                                break;
                            case "20":
                                System.out.print("j");
                                break;
                            case "31":
                                System.out.print("k");
                                break;
                            case "32":
                                System.out.print("l");
                                break;
                            case "33":
                                System.out.print("m");
                                break;
                            case "34":
                                System.out.print("n");
                                break;
                            case "35":
                                System.out.print("ñ");
                                break;
                            case "36":
                                System.out.print("o");
                                break;
                            case "37":
                                System.out.print("p");
                                break;
                            case "38":
                                System.out.print("q");
                                break;
                            case "39":
                                System.out.print("r");
                                break;
                            case "40":
                                System.out.print("s");
                                break;
                            case "61":
                                System.out.print("t");
                                break;
                            case "62":
                                System.out.print("u");
                                break;
                            case "63":
                                System.out.print("v");
                                break;
                            case "64":
                                System.out.print("w");
                                break;
                            case "65":
                                System.out.print("x");
                                break;
                            case "66":
                                System.out.print("y");
                                break;
                            case "67":
                                System.out.print("z");
                                break;
                            default:
                                System.out.println("no existe el codigo");
                                break;
                        }

                        strPares = "";
                        intContador = 0;

                    }

                }
            } else {
                System.out.println("no existe el codigo");
            }

        }

    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
