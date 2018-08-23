package guia4eje1recursion;


import java.util.Scanner;

public class Guia4Eje1Recursion {

   
    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
        
        int arreglo1[], tamaño,opcion,derecha,izquierda;
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
                
                derecha=0;
                izquierda=tamaño-1;
                
                ordenarEnteros(arreglo1,derecha,izquierda);
                
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
                
                derecha=0;
                izquierda=tamaño-1;
                ordenarDecimales(arreglo2,derecha,izquierda); 
                
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
                
                derecha=0;
                izquierda=tamaño-1;
                
                ordenarCadena(arreglo3,derecha,izquierda);
                
                break;
            }
        }
           
        
    }
    
    public static void ordenarEnteros(int arreglo1[],int derecha,int izquierda)
    {
        int i=derecha,j=izquierda,aux;
        
        do{
            while(arreglo1[j]>arreglo1[i]&&j>i)
                    j--;
            
            if(i<j)
            {
                aux=arreglo1[i];
                arreglo1[i]=arreglo1[j];
                arreglo1[j]=aux;
                i++;
                
            }
            while(arreglo1[i]>arreglo1[j]&&j>i)
                i++;
            
            if(i<j)
            {
                aux=arreglo1[i];
                arreglo1[i]=arreglo1[j];
                arreglo1[j]=aux;
                j--; 
            }
                
          }while(i<j);
        
        if(izquierda<j)
            ordenarEnteros(arreglo1,derecha,j-1);
        if(derecha>i)
            ordenarEnteros(arreglo1,i+1,izquierda);
        
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<arreglo1.length;k++)
            System.out.print(arreglo1[k]+" ");
    }
    
    
    public static void ordenarDecimales(double arreglo2[],int derecha,int izquierda)
    {
        int i=derecha,j=izquierda;
        double aux;
        
        do
        {
            while(arreglo2[j]>arreglo2[i]&&j>i)
                j--;
            
            if(i<j)
            {
                aux=arreglo2[i];
                arreglo2[i]=arreglo2[j];
                arreglo2[j]=aux;
                
                i++;
            }
            
            while(arreglo2[j]>arreglo2[i]&&j>i)
                i++;
            
            if(i<j)
            {
                aux=arreglo2[i];
                arreglo2[i]=arreglo2[j];
                arreglo2[j]=aux;
                
                j--;
            }
        }while(i<j);
        
        if(izquierda<j)
            ordenarDecimales(arreglo2,derecha,j-1);
        if(derecha>i)
            ordenarDecimales(arreglo2,i+1,izquierda);
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<arreglo2.length;k++)
            System.out.print(arreglo2[k]+" ");
    }
    
    
    public static void ordenarCadena(String arreglo3[],int derecha,int izquierda)
    {
        
        int i=derecha,j=izquierda;
        String aux;
        
        do
        {
            while(arreglo3[j].compareTo(arreglo3[i])>0&& j>i)
                j--;
            
            if(i<j)
            {
                aux=arreglo3[i];
                arreglo3[i]=arreglo3[j];
                arreglo3[j]=aux;
                
                i++;
            }
            
            while(arreglo3[j].compareTo(arreglo3[i])>0&& j>i)
                i++;
            
            if(i<j)
            {
                aux=arreglo3[i];
                arreglo3[i]=arreglo3[j];
                arreglo3[j]=aux;
                
                j--;
            }
        }while(i<j);
        
        if(izquierda<j)
            ordenarCadena(arreglo3,derecha,j-1);
        if(derecha>i)
            ordenarCadena(arreglo3,i+1,izquierda);
        
        
        System.out.println("arreglo ordenado");
        for(int k=0;k<arreglo3.length;k++)
            System.out.print(arreglo3[k]+" ");
    }
}

