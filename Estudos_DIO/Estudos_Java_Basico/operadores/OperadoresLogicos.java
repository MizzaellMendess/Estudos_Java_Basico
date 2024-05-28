package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Lógicos && "E" e || "OU"
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas mensagens são verdadeiras");
    }

        if(condicao1 || condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("Fim");
    }
}
