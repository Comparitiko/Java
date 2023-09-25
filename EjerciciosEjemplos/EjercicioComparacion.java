class EjercicioComparacion {
    public static void main(String[] args) {
        
        boolean res;
        double temperatura, humedad;

        temperatura = 20.4;
        humedad = 0.66;

        //1. Escribe una condicion que diga si la temperatura es mayor que 18
        res = temperatura > 18;
        System.out.println("El resultado del ejercicio 1 es: " + res);
        
        //2. Escribe una condicion que diga si la temperatura es menor o igual que 21
        res = temperatura <= 21;
        System.out.println("El resultado del ejercicio 2 es: " + res);

        //3. Escribe una condicion que diga si la humedad es igual al 66%
        res = (humedad * 100) == 66;
        System.out.println("El resultado del ejercicio 3 es: " + res);

        //4. Escribe una condicion que diga si la humedad no es igual al 66%
        res = (humedad * 100) != 66;
        System.out.println("El resultado del ejercicio 4 es: " + res);

        //5. Escribe una condicion que diga si la temperatura está entre 20 y 25 grados
        res = temperatura >= 20 && temperatura <= 25;
        System.out.println("El resultado del ejercicio 5 es: " + res);

        //6. Escribe una condicion que diga si la temperatura está entre 20 y 25, y la humedad es mayor del 50%
        res = temperatura >= 20 && temperatura <= 25 && (humedad * 100) > 50;
        System.out.println("El resultado del ejercicio 6 es: " + res);

        //7. Escribe una condicion que diga si la temperatura es menor de 30 o la humedad es mayor de 70%
        res = temperatura < 30 || (humedad * 100) > 0.70;
        System.out.println("El resultado del ejercicio 7 es: " + res);
    }
}