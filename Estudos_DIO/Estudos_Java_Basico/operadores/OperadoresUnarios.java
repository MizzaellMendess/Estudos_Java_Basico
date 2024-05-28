package operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        //Operadores Unários: +, -, ++, --, !

        //O operador "+" incrementa valores a uma variável ou torna uma variável positiva e o operador "-" decrementa ou torna uma variável negativa;
        int numero1 = 5;
        numero1 = numero1 + 2;
        // 7
        int numero2 = 4;
        numero2 = numero2 - 1;
        // 3

        int numero = +5;
        //Valor positivo
        System.out.println(-numero);
        // -5

        //O operador "++" incrementa 1 ao valor da vareável e o "--" decrementa 1;
        int numero3 = 10;
        ++numero3;
        // 11

        --numero3;
        // 9

    }
}
