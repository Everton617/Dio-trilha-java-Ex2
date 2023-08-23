import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = input.nextInt();

        try{
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro tem que ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int c = 1; c <= contagem; c++ ){
            System.out.println(c);
        }
    }
}
