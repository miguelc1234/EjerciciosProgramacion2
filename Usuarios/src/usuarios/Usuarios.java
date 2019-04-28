/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author Estudiantes
 */
public class Usuarios {

    public static int intMenores18, intMenores30, intMayores30;
    public static String[] fields;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        muestraContenido("datos.csv");
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            while (null != line) {
                fields = line.split(",");
                line = br.readLine();

                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNac = LocalDate.parse(fields[2], fmt);
                LocalDate ahora = LocalDate.now();

                Period periodo = Period.between(fechaNac, ahora);
                System.out.printf("\nEdad %s: %s años, %s meses y %s días",
                        fields[1], periodo.getYears(), periodo.getMonths(), periodo.getDays());

                //contar las edades
                if (periodo.getYears() > 0 && periodo.getYears() <= 18) {
                    intMenores18 = intMenores18 + 1;
                } else {
                    if (periodo.getYears() >= 18 && periodo.getYears() <= 30) {
                        intMenores30 = intMenores30 + 1;
                    } else {
                        if (periodo.getYears() > 30 ) {
                            intMayores30 = intMayores30 + 1;
                        }
                    }
                }                
            }

            System.out.printf("\n\nUsuarios entre 0 y 18 años: %s", intMenores18 );
            System.out.printf("\nUsuarios entre 18 y 30 años: %s", intMenores30 );
            System.out.printf("\nUsuarios mayores a 30 años: %s\n", intMayores30 );
            
        } catch (Exception e) {

        } finally {
            if (null != br) {
                br.close();
            }
        }

    }

}
