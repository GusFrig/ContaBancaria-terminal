import java.util.Scanner;
public class App {
     public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       String Cliente;
       String Agencia;
       int Numero;
       float saldo = 233;


        System.out.println("Olá,seja bem vindo.Qual o seu nome ?");
            Cliente = leia.next();
        System.out.println("ok, " + Cliente + ", Qual sua Agência ?");
            Agencia = leia.next();
        System.out.println("Certo! Diga o número da sua conta");
            Numero = leia.nextInt();
        System.out.println("Ok... Seu nome é: "+ Cliente + ",sua agência é: " + Agencia + ",seu número de conta é: " + Numero + " e seu saldo é: " + saldo );  
                        
    }
}
