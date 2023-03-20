import java.util.Scanner;

public class reto3 {
    public static void main(String[] args){
        int contador=1;
        int contador2=1;
Scanner lectura = new Scanner(System.in);

String[][] productos = new String[4][4];

for(int fila=0;fila<4;fila++){
    for(int columna=0;columna<4;columna++){
        System.out.println("Ingrese el nombre y valor de el producto numero "+contador);
        productos[fila][columna]=lectura.nextLine();
        contador++;
    }
}for(int fila=0;fila<4;fila++){
    for(int columna=0;columna<4;columna++){
        System.out.println(contador2+productos[fila][columna]+"\t");
        contador2++;
    }
}
    lectura.close();
    }
}