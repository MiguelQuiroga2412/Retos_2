import java.util.Scanner;

public class reto2 {
    public static void main(String[]args){
            String palabra;
            Scanner lectura = new Scanner(System.in);
            System.out.println("Ingrese la palabra");
            palabra = lectura.nextLine();
            char[] caracteres = palabra.toCharArray();
            char[] palindromo = new char[caracteres.length];
            int v=0;
            for(int i = caracteres.length-1; i>=0; i--){
                palindromo[v] = caracteres[i];
               v++;
               
            }
            String volteado2 = new String(palindromo);
            if(palabra.equalsIgnoreCase(volteado2)){
                System.out.println("Es palindromo");
            } else {
                System.out.println("No es palindromo");
            }
            lectura.close();
        }

    
    }

