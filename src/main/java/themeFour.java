public class themeFour {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroif = 1;
        if(numeroif > 0)
            System.out.println("El numero es positivo");
        else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.

        int numeroWhile = -10;
        while (numeroWhile < 3)
            System.out.println("Estructura While: " + numeroWhile++);

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do{
            System.out.println("Estructura DoWhile" + numeroWhile++);
        }while(numeroWhile < 3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
        // sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla
        for(int numeroFor = 0; numeroFor < 3; numeroFor++)
            System.out.println("Estructura For" + numeroFor);

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
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
