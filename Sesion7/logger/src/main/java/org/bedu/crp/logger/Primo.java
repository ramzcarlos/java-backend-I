package org.bedu.crp.logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

import java.util.Scanner;


@Component
public class Primo implements CommandLineRunner {
    private static Logger logger= LoggerFactory.getLogger(Primo.class);
    public void run(String[] args){
        System.out.println("Ingresa un numero");
        Scanner escanear = new Scanner(System.in);
        int num = escanear.nextInt();
        int aux=1;
        if (num < 0){
            logger.error("El numero es negativo");
        }
        else {
            if (num == 0 || num == 1 || num == 4) {
                //logger.warn("El numero no es primo");
                aux=0;
            }
            for (int x = 2; x < num / 2; x++) {
                // Si es divisible por cualquiera de estos números, no
                // es primo
                if (num % x == 0)
                    aux=0;
                    //logger.warn("El numero no es primo");
            }
            // Si no se pudo dividir por ninguno de los de arriba, sí es primo
            if (aux == 1)
                logger.info("El numero es primo");
            else
                logger.warn("El numero no es primo");
        }



    }

}
