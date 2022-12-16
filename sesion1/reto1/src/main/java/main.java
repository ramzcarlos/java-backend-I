import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        numero = sc.nextInt();

        exp=0;
        binario=0;
        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);

    }
}
