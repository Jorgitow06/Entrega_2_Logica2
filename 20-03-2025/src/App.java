import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(25);
        numeros.add(36);
        numeros.add(16);
        numeros.add(32);
        numeros.add(8);//Orden Preestablecido
        numeros.add(1,67);//Agregar posicion especifica 67 en la posicion 1
        numeros.set(1,32);//Cambiar el valor de la posicion 1 por 32
        numeros.remove(1);//Eliminar el valor de la posicion 2

        boolean existe = numeros.contains(10);//Verificar si existe el valor 10
        System.out.println("La lista contiene el 10?: " + existe);
        int indice = numeros.indexOf(32);//Consultar el indice o posicion 
        System.out.println("El indice del numero 32 es: " + indice);

        System.out.println("El tamaño de la lista es: " + numeros.size());//Consultar el tamaño de la lista

        for (int numero = 0; numero < numeros.size(); numero++) {
            System.out.println("El numero con indice " + numero + " es: " + numeros.get(numero));//recorremos el arrayList
        }

        for (int numero : numeros) {
            System.out.println("Numero: " + numero);//recorremos el arrayList
        }

        int numero = 0;
        while (numero < numeros.size()) {
            System.out.println("El numero con el while " + numero + " es: " + numeros.get(numero));//recorremos el arrayList
            numero++;
        }

        System.out.println("La Lista De Numeros Es: " + numeros);
    }
}
