//Prueba 1
public class myFirstClass {
    public static void  main(String[] args) {
        System.out.println(suma(1,2,3));

        coche miCoche = new coche();
        miCoche.increaseNumDoors();
        System.out.println(miCoche.numDoors);
    }

    public static int suma(int a , int b, int c){
        return a + b + c;
    }
}

class coche{
    public int numDoors =0;

    public void increaseNumDoors(){
        this.numDoors++;
    }

}