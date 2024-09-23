import java.util.Scanner;
public class Contador {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro");
        }


    }



    
        
    	static void contar(int parametroum, int parametrodois) throws ParametrosInvalidosException {

        if(parametrodois<parametroum){
            throw new ParametrosInvalidosException();
        }

        int quantidade = parametrodois - parametroum;

        for(int i = 1; i<quantidade; i++){
            System.out.println("Imprimindo número: "+i);
        }

    }
}
