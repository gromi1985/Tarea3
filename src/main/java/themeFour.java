public class themeFour {
    public static void main(String[] args) {
        int numeroif = 1;
        if(numeroif > 0)
            System.out.println("El numero es positivo");
        else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
        int numeroWhile = -10;
        while (numeroWhile < 3)
            System.out.println("Estructura While: " + numeroWhile++);

        do{
            System.out.println("Estructura DoWhile" + numeroWhile++);
        }while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor < 3; numeroFor++)
            System.out.println("Estructura For" + numeroFor);

        String estacion ="spring";
        switch(estacion){
            case "spring":
                System.out.println("Estamos en " + estacion);
                break;
            case "summer":
                System.out.println("Estamos en " + estacion);
                break;
            case "fall":
                System.out.println("Estamos en " + estacion);
                break;
            case "winter":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("Estacion equivocada");
        }
    }
}
