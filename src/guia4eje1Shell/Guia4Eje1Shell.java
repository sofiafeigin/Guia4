package guia4eje1Shell;

import java.util.Scanner;


public class Guia4Eje1Shell 
{

    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
        
        int arreglo1[], tamaño,opcion;
        double arreglo2[];
        String cadena;
        String arreglo3[];
        
        System.out.println("ingrese la opcion que desea: \n1)ordenar enteros\n2)ordenar decimales\n3)ordenar cadenas");
        opcion=sc.nextInt();
        
        switch(opcion)
        {
            case 1:
            {
                System.out.println("ingrese el tamaño del arreglo de enteros");
                tamaño=sc.nextInt();
                arreglo1= new int[tamaño];
        
                for(int i=0;i<tamaño;i++)
                    {
                        System.out.println("ingrese el valor en la posicion "+i);
                        arreglo1[i]=sc.nextInt();
                    }   
                
                ordenarEnteros(arreglo1,tamaño);
                
                break;
            }
            
            case 2:
            {
               System.out.println("\ningrese el tamaño del arreglo de decimales");
                tamaño=sc.nextInt();
                arreglo2= new double[tamaño];
        
                for(int i=0;i<tamaño;i++)
                    {
                        System.out.println("ingrese el valor en la posicion "+i);
                        arreglo2[i]=sc.nextDouble();
                    }
        
                ordenarDecimales(arreglo2,tamaño); 
                
                break;
            }
            
            case 3:
            {
                System.out.println("\ningrese el tamaño del arreglo de cadenas");
                tamaño=sc.nextInt();
                arreglo3= new String[tamaño];
        
                for(int i=0;i<tamaño;i++)
                {
                    System.out.println("ingrese el valor en la posicion "+i);
                    arreglo3[i]=sc.next();
                }
        
                ordenarCadena(arreglo3);
                
                break;
            }
        }
           
        
    }
    
    public static void ordenarEnteros(int arreglo1[],int tamaño)
    {
        int i,j,gap,aux;
        
        for(gap=tamaño/2;gap>0;gap=gap/2)
        {
           for(i=gap;i<tamaño;i++)
           {
               for(j=i-gap;j>=0&&arreglo1[j]>arreglo1[j+gap];j-=gap)
               {
                   
                   aux=arreglo1[j];
                   arreglo1[j]=arreglo1[j+gap];
                   arreglo1[j+gap]=aux;
                   
               }   
       
                
            }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<tamaño;k++)
            System.out.print(arreglo1[k]+" ");
        }
    
     }
    public static void ordenarDecimales(double arreglo2[],int tamaño)
    {
        int i,j,gap;
        double aux;
        
        for(gap=tamaño/2;gap>0;gap=gap/2)
        {
           for(i=gap;i<tamaño;i++)
           {
               for(j=i-gap;j>=0&&arreglo2[j]>arreglo2[j+gap];j-=gap)
               {
                   
                   aux=arreglo2[j];
                   arreglo2[j]=arreglo2[j+gap];
                   arreglo2[j+gap]=aux;
                   
               }   
       
                
            }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<tamaño;k++)
            System.out.print(arreglo2[k]+" ");
        }
    }
    
    
    public static void ordenarCadena(String arreglo3[])
    {
        int i,j,gap;
        String aux;
        
        for(gap=arreglo3.length/2;gap>0;gap=gap/2)
        {
           for(i=gap;i<arreglo3.length;i++)
           {
               for(j=i-gap;j>=0&&arreglo3[j].compareTo(arreglo3[j+gap])>0;j-=gap)
               {
                   
                   aux=arreglo3[j];
                   arreglo3[j]=arreglo3[j+gap];
                   arreglo3[j+gap]=aux;
                   
               }   
       
                
            }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<arreglo3.length;k++)
            System.out.print(arreglo3[k]+" ");
        }
}

}
    

