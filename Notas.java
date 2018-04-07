class Notas
{
    int [] notas1 = null;
    int [] notas2= null;
    int [] notas3= null;

    int promN1 , promN2 , promN3;
    int  notaAlta1 , notaAlta2 , notaAlta3;

    void promedio (){
        int sumatoria=0;
        int cont=0;
        int n;
        for(int elemento : notas1){
            sumatoria = sumatoria + elemento;
            cont++;
        }
        n=cont;
        notas1 = new int [sumatoria];
        promN1 = sumatoria/n;

    }

    void promedio2(){
        int sumatoria=0;
        int cont=0;
        int n;
        for(int elemento : notas2){
            sumatoria = sumatoria + elemento;
            cont++;
        }
        n=cont;
        notas2 = new int [sumatoria];
        promN2=sumatoria/n;

    }

    void promedio3(){
        int sumatoria=0;
        int cont=0;
        int n;
        for(int elemento : notas2){
            sumatoria = sumatoria + elemento;
            cont++;
        }
        n=cont;
        notas3 = new int [sumatoria];
        promN3 = sumatoria/n;   
    }

    public static void main ( String [] args){
        Notas n = new Notas();
        Consola c = new Consola();
        int a = c.leerEntero("digite la cantidad del arreglo");
        int a2 = c.leerEntero("digite la cantidad del arreglo");
        int a3 = c.leerEntero("digite la cantidad del arreglo");
        
        n.notas1= new int [a];
        n.notas2= new int [a2];
        n.notas3= new int [a3];
        c.imprimir("Escriba cada elemento separado por espacio en blanco. Ejemplo 1 2 3 4 5"); 
        for(int i=0; i<a; i++){
            n.notas1[i] = c.leerEntero("Número["+i+"]");
        }    
        c.imprimir("Escriba cada elemento separado por espacio en blanco. Ejemplo 1 2 3 4 5");
        for(int i=0; i<a2; i++){
            n.notas2[i] = c.leerEntero("Número["+i+"]");
        } 
        c.imprimir("Escriba cada elemento separado por espacio en blanco. Ejemplo 1 2 3 4 5");
        for(int i=0; i<a3; i++){
            n.notas3[i] = c.leerEntero("Número["+i+"]");

        }
        n.promedio();
        n.promedio2();
        n.promedio3();
        c.imprimir("la media de n1 es; "+n.promN1);
        c.imprimir("la media de n3 es; "+n.promN2);
        c.imprimir("la media de n2 es; "+n.promN3);
    }
}
