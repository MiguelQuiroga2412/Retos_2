public class reto4 {
    public static void main(String[]args) {
        System.out.println("Este programa muestra una calculadora");
    String [][] matriz= {{"%","CE","C","Borrar"},
                         {"1/x","X²","²√","÷"},
                         {"7","8","9","x"},
                         {"4","5","6","-"},
                         {"1","2","3","+"},
                         {"+/-","0",",","="}
                        };
    for(int fila=0;fila<6;fila++){
        for(int columna=0;columna<4;columna++){
            System.out.print(matriz[fila][columna]+"\t");
        }
        System.out.println(" ");
        System.out.println("  ");
    }
    }
}

