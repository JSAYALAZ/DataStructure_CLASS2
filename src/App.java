public class App {
    public static void main(String[] args) throws Exception {

        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        //SUBSTRACCION
        int resultado = dataStructuresPrep.subtractAlgorithm(15, 5);
        System.out.println("El resultado de restar 15 - 5 sin usar el operador de resta es: " + resultado);

        //MULTIPLICACION
        resultado = dataStructuresPrep.multiplyAlgorithm(5, 3);
        System.out.println("El resultado de multiplicar 5 * 3 sin usar el operador de multiplicacion es: " + resultado);

        // DIVICION
        resultado = dataStructuresPrep.divideWAlgorithm(25, 5);
        System.out.println("El resultado de dividir 25 / 5 sin usar el operador de division es: " + resultado);

        // NUMERO perfecto
        int num = 28;
        Boolean resulTBool = dataStructuresPrep.isPerfectNumber(num);
        System.out.println("El numero "+num+(resulTBool?" es perfecto":" no es perfecto"));

        // FACTORIAL
        resultado = dataStructuresPrep.getFactorial(5);
        System.out.println("El factorial es " + resultado);
        //ENCONTRAR MAXIMO
        int numeros[]={5,4,7,1,8,3,5};
        resultado = dataStructuresPrep.findMaximum(numeros);
        System.out.println("El numero maximos es " + resultado);

        //ALGORITMO DE EXPONENCIAL
        resultado = dataStructuresPrep.powerAlgorithm(2,3);
        System.out.println("El exponencial es " + resultado);

        //NUMEROS PRIMOS
        num = 7;
        resulTBool = dataStructuresPrep.isPrime(num);
        System.out.println("El numero "+num+(resulTBool?" es primo":" no es primo"));
        
        //CONTAR LONGITUD
        num = 421412414;
        resultado = dataStructuresPrep.countDigits(num);
        System.out.println("El numero "+num+ " contiene "+resultado+" numeros");
    }
}
