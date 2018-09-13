
import java.util.Scanner;


public class bancodeprocedimentos {
       public static void main(String[] args) {
        bancodeprocedimentos obj;
           obj = new bancodeprocedimentos();
        Scanner tcl = new Scanner(System.in);
        double valor = 0;
        while (true){
            obj.menu();
            System.out.println("Digite uma opção");
            int opcao = tcl.nextInt();
            switch(opcao){
                case 1:
                   valor = obj.Depositar(valor);
                break;
                case 2:
                    valor = obj.Sacar(valor);
                break;
                case 3:
                    obj.VerSaldo(valor);
                break;
                case 4:
                    System.exit(0);
                break;
                default:
                    System.out.println("Não existe essa opção, tente novamente");
                    System.out.println(" ");
            }
                  
        }
    }
    public void menu(){
        System.out.println("Digite uma Opção");
        System.out.println(" ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Sair");
        
    }
    public double Depositar(double valor){
        System.out.println("Qual o valor do seu deposito?");
        Scanner tcl = new Scanner(System.in);
        double deposito = tcl.nextInt();
        valor = valor + deposito;
        return valor;
    }
    public double Sacar ( double valor){
        System.out.println("Qual o valor do seu saque?");
        Scanner tcl = new Scanner(System.in);
        double sacar = tcl.nextInt();
        valor = valor - sacar;
        return valor;
    }    
    public void  VerSaldo( double valor){
        System.out.println("Seu saldo é " + valor);
    }


}