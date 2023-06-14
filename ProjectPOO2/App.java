package ProjectPOO2;

import javax.swing.JOptionPane;
import ProjectPOO2.Conta.ContaPF;
import ProjectPOO2.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        //criar um vetor das contas
        ContaPF clientePf[] = new ContaPF[10];//clientes pf
        ContaPJ clientePj[] = new ContaPJ[10];//clientes pj
        boolean logado = true;
        int contPf=0;
        int contPj=0;

        while(logado){
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                                                        +"\n 1-Criar Conta Física;"
                                                        +"\n 2-Criar Conta Jurídica;"
                                                        +"\n 3-Acessar Conta Física;"
                                                        +"\n 4-Acessar Conta Jurídica"
                                                        +"\n 5-Sair."));
            if(acao==1){//criar a conta Pessoa física
                //criar um objeto (construtor)
                clientePf[contPf] = new ContaPF();//obj/conta esta criado
                //preencher as informações da conta
                clientePf[contPf].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                clientePf[contPf].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente"));
                clientePf[contPf].setSaldo(0);
                clientePf[contPf].setnConta(1000+contPf+1);
                clientePf[contPf].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Cliente")));
                //acrescimo do contador
                contPf++;

            }else if(acao==2){ //criar conta Pessoa Juridica
                clientePj[contPj] = new ContaPJ(); 
                clientePj[contPj].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                clientePj[contPj].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ do Cliente"));
                clientePj[contPj].setSaldo(0);
                clientePj[contPj].setnConta(5000+contPj+1);
                contPj++;

            } else if(acao==3){//acessar a conta
                //buscar a conta no vetor
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < clientePf.length; i++) {
                    if(nContaBuscada==clientePf[i].getnConta()){
                        //encontrei a posição da conta no vetor
                        //preciso guardar o "i"
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Cliente Encontrado");
                        break;
                    }
                }
                //entrar na conta do cliente
                boolean acessarPF = true;
                while (acessarPF) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe a ação desejada"
                        +"\n 1-Verificar saldo"
                        +"\n 2-Saque"
                        +"\n 3-Deposito"
                        +"\n 4-Empréstimo"));
                        if(acao2==1){
                            JOptionPane.showMessageDialog(
                                null,clientePf[contaAtual].getSaldo());
                        } else if(acao2==2){
                            //sacar
                            clientePf[contaAtual].Saque();
                        } else if(acao2==3){
                            //depositar
                            clientePf[contaAtual].Deposito();
                             
                        } else if(acao2==4){
                            //emprestimo
                            clientePf[contaAtual].Emprestimo();
                        }
                }
 
            } else if(acao==4){
                 //buscar a conta no vetor
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < clientePj.length; i++) {
                    if(nContaBuscada==clientePj[i].getnConta()){
                        //encontrei a posição da conta no vetor
                        //preciso guardar o "i"
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Cliente Encontrado");
                        break;
                    }
                }
                //entrar na conta do cliente
                 boolean acessarPJ = true;
                while (acessarPJ) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe a ação desejada"
                        +"\n 1-Verificar saldo"
                        +"\n 2-Saque"
                        +"\n 3-Deposito"
                        +"\n 4-Empréstimo"));
                        if(acao2==1){
                            JOptionPane.showMessageDialog(
                                null,clientePj[contaAtual].getSaldo());
                        } else if(acao2==2){
                            //sacar
                            clientePj[contaAtual].Saque();
                        } else if(acao2==3){
                            //depositar
                            clientePj[contaAtual].Deposito();
                             
                        } else if(acao2==4){
                            //emprestimo
                            clientePj[contaAtual].Emprestimo();
                        }
                }
            }else if(acao==5){
                logado = false;
                JOptionPane.showMessageDialog(null,"Volte Sempre!");
            } else{
                JOptionPane.showMessageDialog(null,"Informe uma Opção Válida!");
            }
        }

    }
    }

