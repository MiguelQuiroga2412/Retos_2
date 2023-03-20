import java.util.Scanner;

public class reto1 {
    public static void main(String [] args) {
        int INTENTOS_TOTALES = 15; // Constante con el limite de fallos
        int apuesta,intentos=0,aciertos = 0;
        String letra,nombre,pl;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
        System.out.println("Ingrese la palabra a adivinar");
        pl=lectura.next();
        System.out.println("Ingrese el valo de su apuesta");
        apuesta=lectura.nextInt();
        char[]palabra=pl.toCharArray();
        char[]copia=pl.toCharArray();
        char[]palabra_adivinar= new char[palabra.length];
        for(int i = 0; i < palabra_adivinar.length; i++){
            palabra_adivinar[i] = '_';
        }
        System.out.println("Adivina la palabra!");
        while (intentos< INTENTOS_TOTALES && aciertos!= palabra_adivinar.length) {
            for(int p=0;p<palabra_adivinar.length;p++) {
                System.out.print(palabra_adivinar[p]);
                }
                System.out.println("\nIntroduce una letra: ");
                letra=lectura.next();
                for(int i = 0; i < palabra.length; i++){
                    if(palabra[i]==letra.charAt(0)){
                        palabra_adivinar[i] = palabra[i];
                        aciertos++;
                    }
                }
                intentos++;
        }
        if(aciertos == palabra_adivinar.length){
            apuesta=apuesta*2;
            for(int p=0;p<palabra_adivinar.length;p++) {
                System.out.print(palabra_adivinar[p]);
                }
            System.out.print("\nfelicidades "+nombre+" !!has acertado la palabra: ");
            for(int p=0;p<palabra_adivinar.length;p++) {
                System.out.print(palabra_adivinar[p]);
                }
                System.out.println(", acertaste la palabra en "+intentos+" intentos   Has ganado la apusta ="+apuesta);
        }
        // Si no otro
        else{
            System.out.print("\nHas perdido! la palabra era: ");
            apuesta=apuesta-apuesta;
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
                System.out.println("Has perdido la apusta !"+apuesta);
            }
        }
lectura.close();
}
}