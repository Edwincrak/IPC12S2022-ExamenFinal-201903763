/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal.pkg201903763;

import java.util.Scanner;


public class ExamenFinal201903763 {

    
    public static void main(String[] args) {
      
        while (true) {
            System.out.println("\n\n");
            int op = 0;
          
            System.out.println(" ----- MENU ----- ");
            System.out.println("1. Ejercicio No. 1");
            System.out.println("2. Ejercicio No. 2");
            System.out.println("3. Ejercicio No. 3");
            System.out.println("5. Salir");
            System.out.print("Ingrese un numero: ");
           
            Scanner scan2 = new Scanner(System.in);
            op = scan2.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ejercicio 1");
                    ejercicioUno();        
                    break;
                case 2:
                    System.out.println("Ejecicio 2");
                    ejercicioDos();
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    ejercicioTres();
                    break;
                case 5:
                    System.out.println("Adios!!");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
        
        
    }
    
    public static void ejercicioUno()
    {   { boolean seguirEnMenu = true;
        while (seguirEnMenu){
            System.out.println("\n\n");
        
            int opcion = 0;
            int num1 = 0;
            int num2 = 0;
            int resultado =0;
            System.out.println("------ Ejercicio No. 1 ------");
            System.out.println("1. Identificar El Numero Mayor");
            System.out.println("5. Volver Menu");
            System.out.print("Ingrese un numero: ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1: System.out.println("\n");
                        System.out.println("---- Numero  Mayor---- ");
                        System.out.print("Ingrese el primer numero: ");
                        num1 = scan.nextInt();
                        System.out.print("\nIngrese el segundo numero: ");
                        num2 = scan.nextInt();
                        if (num1==num2) {
                             System.out.println("\n");
                             System.out.println(" --- "+num1+" es gual a  "+ num2+" --- ");
                        }else{
                        if (num1>num2) {
                            System.out.println("\n");
                            System.out.println(" --- "+num1+" ss mayor que  "+ num2+" --- ");
                        }else{
                             System.out.println("\n");
                             System.out.println(" --- "+num2+" ss mayor que  "+ num1+" --- ");
                    }}
                        Scanner espera = new Scanner(System.in);
                        String esperando = espera.nextLine();
                    break;
     
                case 5:
                    seguirEnMenu = false;
                default:
                    System.out.println("Entre al default");
                    break;
            }
    }}
    }
    
    public static void ejercicioDos(){
    { boolean seguirEnMenu = true;
        while (seguirEnMenu){
            System.out.println("\n\n");
        
            int opcion = 0;
            int resultado =0;
            System.out.println("Ejercicio No. 2");
            System.out.println("1. Dibujar Piramide");
            System.out.println("5. Volver Menu");
            System.out.print("Ingrese un numero: ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                  
                        Scanner leer = new Scanner (System.in);
                        System.out.print("Numero");
                        int n=leer.nextInt();
                         System.out.println("Dibujar Piramide de n= "+n);
                         if (n % 2!=0) {
                             System.out.println("Es un número impar");
                             System.out.println("\n\n");
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n-i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= (i*2)-1; j++) {
                                System.out.print("*");  
                            }
                            System.out.println("");
                       }
                         }else{
                          System.out.println("Es numero par no se puede generar la piramide");
                         }
             
                        Scanner espera = new Scanner(System.in);
                        String esperando = espera.nextLine();
                    break;
                        
                case 5:
                    seguirEnMenu = false;
                default:
                    System.out.println("Entre al default");
                    break;
            }
    }}
     
    }
    
    public static void ejercicioTres (){
        { boolean seguirEnMenu = true;
        while (seguirEnMenu){
            System.out.println("\n\n");
        
            int opcion = 0;
            int num1 = 0;
            int num2 = 0;
            int resultado =0;
            System.out.println("Ejercicio No. 3");
            System.out.println("1. Problema de las vacas");
            System.out.println("5. Volver Menu");
            System.out.print("Ingrese un numero: ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    int vacas=10;
                    int camion = 2000;
                    
                    
                 String [][] mat=new String [10][10];
                    mat [0][0]= "340"+"15" ; 
                    mat [1][1]= "ddf"+"afd" ; 
                    mat [2][2]= "ddf"+"afd" ; 
                    mat [3][3]= "ddf"+"afd" ; 
                    mat [4][4]= "ddf"+"afd" ; 
                    mat [5][5]= "ddf"+"afd" ; 
                    mat [6][6]= "ddf"+"afd" ; 
                    mat [7][7]= "ddf"+"afd" ; 
                    mat [8][8]= "ddf"+"afd" ; 
                    mat [9][9]= "ddf"+"afd" ; 
                  for (int i = 0; i < mat.length; i++) {
                          for (int j = 0; j < mat.length; j++) {
                              mat [1][1]= "ddf"+"afd" ; 
                            }   
                        }
                    
                  System.out.println("No. de vacas "+vacas); 
                  System.out.println("Peso límite del camión Kg "+camion);
                  System.out.println("Lista de vacas= 340,355,223,243,130,240,260,155,302,130");       
                  System.out.println("Lista de produccio de vacas= 45,50,34,39,29,40,30,52,31,1");  
                        Scanner espera = new Scanner(System.in);
                        String esperando = espera.nextLine();
                    break;
     
                case 5:
                    seguirEnMenu = false;
                default:
                    System.out.println("Entre al default");
                    break;
            }
    }}
    }
}
