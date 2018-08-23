package guia4eje1;

import java.util.Scanner;

public class Guia4Eje1Insercion {

   
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
        for(int p=1;p<tamaño;p++)
        {
            int var=arreglo1[p];
            
            
            for(int j=p;j>0 && var<arreglo1[j-1];j--)
            {
                arreglo1[j]=arreglo1[j-1];
                arreglo1[j-1]=var;
                
            }
                
        }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<tamaño;k++)
            System.out.print(arreglo1[k]+" ");
    }
    
    
    public static void ordenarDecimales(double arreglo2[],int tamaño)
    {
        for(int p=1;p<tamaño;p++)
        {
            double var=arreglo2[p];
            
            
            for(int j=p;j>0 && var<arreglo2[j-1];j--)
            {
                arreglo2[j]=arreglo2[j-1];
                arreglo2[j-1]=var;
                
            }
                
        }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<tamaño;k++)
            System.out.print(arreglo2[k]+" ");
    }
    
    
    public static void ordenarCadena(String arreglo3[])
    {
        for(int p=1;p<arreglo3.length;p++)
        {
            String var=arreglo3[p];
            
            
            for(int j=p;j>0 && var.compareTo(arreglo3[j-1])<0;j--)
            {
                arreglo3[j]=arreglo3[j-1];
                arreglo3[j-1]=var;
                
            }
                
        }
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<arreglo3.length;k++)
            System.out.print(arreglo3[k]+" ");
    }
}
