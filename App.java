package ProjectPOO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar o banco - construtor
        Banco banco1 = new Banco();

        //enquando for true o aplicativo estará rodando
        boolean logado = true;

        while(logado){
            System.out.println("O Que Deseja? " +"\n1-Criar Conta"+"\n2-Buscar Conta"+"\n3-Sair do App"); //primeira parte, perguntar se deseja criar ou buscar conta
            int primeiraAcao = sc.nextInt();

            if(primeiraAcao==1){

            } else if(primeiraAcao==2){

            } else if(primeiraAcao==3){
                logado=false;
            } else{
                System.out.println("Digite uma opção Válida!");
            }
        }
    }
}
