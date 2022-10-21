package lab2_jesusr;

import java.util.Scanner;

public class Lab2_JesusR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner ( System.in);
        
        int opcion;
        do { 
           
        System.out.println("Que proceso quiere hacer?");
        System.out.println("1<- MCD");
        System.out.println("2<- Sumatoria");
        System.out.println("3 <- Super-mercado");  
         System.out.println("0 <- Salida");
        System.out.println("Ingrese su opcion por favor");
        opcion= leer.nextInt();
        
        if (opcion==1){
            System.out.println("Iniciando MCD...");
            int numA, numB;
            int Sol=0;
            System.out.println("Ingrese el Numero A");
            numA= leer.nextInt();
            System.out.println("Ingrese el Numero B");
            numB= leer.nextInt();
            System.out.println("El MCD de "+numA+" y de "+numB);
             int Num1, Num2;
             Num1=numA;
             Num2=numB;
             if(Num1!=0&&Num2!=0){
            while( Num1!=Num2){
                if (Num1 >Num2){
                    Sol= Num1-Num2;
                    Num1=Sol;
                }//fin if
                else
                    if(Num1<Num2){
                    Sol=Num2-Num1;
                    Num2=Sol;
                    
                }//fin if
            }//fin while
                    
            System.out.println (" es: "+Sol);
        }//fin if   
        else{
           System.out.println("Ingrese un numero positivo"  );   
            }//fin else
        }//fin opcion 1
    else
            
        if (opcion==2){
            System.out.println("Iniciando Sumatoria");
            int K;
            double n=1;
            double output=0;
            System.out.println("Ingrese K");
            K= leer.nextInt();
            while (n<=K){
               double x;
               x= n/(n+1);
               output=Math.pow(x, n)+output;
               n++;
            }//fin while
            System.out.println("Output: "+output);
            
            
        }//fin opcion 2
    else
        if (opcion==3){
            System.out.println("Supermercado");
            int TDC; 
            int CDP=0;
            double PUPP=0;
            double P=0;
            double tot=0;
            System.out.println("Ingrese tipo de cliente: ");
            TDC= leer.nextInt();
            System.out.println("Ingrese el precio de la unidad del producto: ");
            PUPP= leer.nextDouble();
            System.out.println("Ingrese la cantidad del producto: ");
            CDP= leer.nextInt();
            if(TDC ==0){
                if (CDP>10 && CDP<=19){
                    System.out.println("Te llevaras 2 productos gratis");
                    CDP= CDP -2;
                    P= PUPP*CDP;
                }//Fin if entre 10 y 19
                else
                    if (CDP> 20){
                    System.out.println("Te llevaras 5 productos gratis"); 
                    CDP=CDP-5;
                    P= PUPP*CDP;        
                }// IF mayor a 20
                    else{
                    System.out.println("No te llevaras nada gratis");
                    P=PUPP*CDP;
                    }//Fin else 
                    double des=0;
                    tot= des+P;
            }//FIN TDC 0
            else
                if(TDC==1){
                    double des=0.90;
                    if (CDP>20&&CDP<=29){
                    System.out.println("Te llevaras 2 productos gratis");
                    CDP= CDP -2;
                    P= PUPP*CDP;
                    }//Fin if entre 20 y 29
                else
                    if (CDP> 30){
                    System.out.println("Te llevaras 5 productos gratis"); 
                    CDP= CDP -5;
                    P= PUPP*CDP;
                    }// IF mayor a 30
                    else{
                    System.out.println("No te llevaras nada gratis");
                    P=PUPP*CDP;
                    }//Fin else        
                    tot= des*P;
                    
                }// FIN TDC 1
             else
                if(TDC==2){
                    double des=0.70;
                    if (CDP>30&&CDP<=39){
                    System.out.println("Te llevaras 2 productos gratis");
                    CDP= CDP -2;
                    P= PUPP*CDP;
                    }//Fin if entre 20 y 29
                    else if (CDP> 40){
                    System.out.println("Te llevaras 5 productos gratis");
                    CDP= CDP -5;
                    P= PUPP*CDP;
                    }// IF mayor a 30
                    else{
                    System.out.println("No te llevaras nada gratis");
                    P=PUPP*CDP;
                    }//Fin else        
                    tot= des*P;
                }//fin TDC 2
                else{
                    System.out.println("Ingrese tipo de cliente valido");
                }//fin else/
                System.out.println("El total a pagas es: "+tot);
        }//fin opcion 3
         else
            if (opcion==0){
                 System.out.println("SALIENDO...");
            }//fin de opcion 0
        }while(opcion!=0);  //fin do
        
       
        
                
    }//Fin main
    
} //fin 
