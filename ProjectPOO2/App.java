package ProjectPOO2;

import javax.swing.JOptionPane;
import ProjectPOO2.Conta.ContaPF;
import ProjectPOO2.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        // criar um vetor das contas
        ContaPF clientePf[] = new ContaPF[10];// clientes pf
        ContaPJ clientePj[] = new ContaPJ[10];// clientes pj
        boolean logado = true;
        int contPf = 0;
        int contPj = 0;

        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a) ao App do Banco!");

        while (logado) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção:"
                    + "\n 1-Criar Conta;"
                    + "\n 2-Acessar Conta;"
                    + "\n 3-Sair."));
            if (acao == 1) {// criar a conta Pessoa física
                int acaoDentro = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"
                        + "\n 1-Criar Conta Física"
                        + "\n 2-Criar Conta Jurídica"));
                if (acaoDentro == 1) {
                    // criar um objeto (construtor)
                    clientePf[contPf] = new ContaPF();// obj/conta esta criado
                    // preencher as informações da conta
                    clientePf[contPf].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                    clientePf[contPf].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente"));
                    clientePf[contPf].setSaldo(0);
                    clientePf[contPf].setnConta(1000 + contPf + 1);
                    // acrescimo do contador
                    contPf++;
                } else if (acaoDentro == 2) {
                    clientePj[contPj] = new ContaPJ();
                    clientePj[contPj].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                    clientePj[contPj].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ do Cliente"));
                    clientePj[contPj].setSaldo(0);
                    clientePj[contPj].setnConta(5000 + contPj + 1);
                    contPj++;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
                }
                
            } else if (acao == 2) {// acessar a conta de pessoas Físicas
                // buscar a conta no vetor

                int acaoAcessar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"
                        + "\n 1-Acessar Conta Física"
                        + "\n 2-Acessar Conta Jurídica"));


                if (acaoAcessar == 1) {
                    int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número da Conta a ser buscada:"));
                    int contaAtual = 0;
                    for (int i = 0; i < contPf; i++) {
                        if (nContaBuscada == clientePf[i].getnConta()) {
                            contaAtual = i;
                            JOptionPane.showMessageDialog(null, "Cliente Encontrado com Sucesso!");
                            JOptionPane.showMessageDialog(null, "\n Nome do Cliente: " + clientePf[contaAtual].getNome()
                                    + "\n CPF do Cliente: " + clientePf[contaAtual].getnCpf()
                                    + "\n N da Conta do Cliente: " + clientePf[contaAtual].getnConta()
                                    + "\n Saldo do Cliente: " + clientePf[contaAtual].getSaldo());

                                    // entrar na conta do cliente 
                    boolean acessarPF = true;
                    while (acessarPF) {
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a ação desejada"
                                        + "\n 1-Verificar saldo"
                                        + "\n 2-Saque"
                                        + "\n 3-Deposito"
                                        + "\n 4-Empréstimo"));
                        if (acao2 == 1) {
                            JOptionPane.showMessageDialog(
                                    null, clientePf[contaAtual].getSaldo());
                        } else if (acao2 == 2) {
                            // sacar
                            clientePf[contaAtual].Saque();
                        } else if (acao2 == 3) {
                            // depositar
                            clientePf[contaAtual].Deposito();

                        } else if (acao2 == 4) {
                            // emprestimo
                            clientePf[contaAtual].Emprestimo();
                        } else {
                            JOptionPane.showMessageDialog(null, "Informe uma Opção Válida!");
                        }
                    }

                            break;
                        }
                    }

                } else if (acaoAcessar == 2) {

                    int nContaBuscada = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));

                    int contaAtual = 0;
                    for (int i = 0; i < contPj; i++) {
                        if (nContaBuscada == clientePj[i].getnConta()) {
                            // encontrei a posição da conta no vetor
                            // preciso guardar o "i"
                            contaAtual = i;
                            JOptionPane.showMessageDialog(null, "Cliente Encontrado com Sucesso!");
                            JOptionPane.showMessageDialog(null, "\n Nome do Cliente: " + clientePj[contaAtual].getNome()
                                    + "\n CNPJ do Cliente: " + clientePj[contaAtual].getnCnpj()
                                    + "\n N da Conta do Cliente: " + clientePj[contaAtual].getnConta()
                                    + "\n Saldo do Cliente: " + clientePj[contaAtual].getSaldo());

                                    //entrar na conta do cliente

                                    boolean acessarPJ = true;
                    while (acessarPJ) {
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a ação desejada"
                                        + "\n 1-Verificar saldo"
                                        + "\n 2-Saque"
                                        + "\n 3-Deposito"
                                        + "\n 4-Empréstimo"));
                        if (acao2 == 1) {
                            JOptionPane.showMessageDialog(null, clientePj[contaAtual].getSaldo());
                        } else if (acao2 == 2) {
                            // sacar
                            clientePj[contaAtual].Saque();
                        } else if (acao2 == 3) {
                            // depositar
                            clientePj[contaAtual].Deposito();

                        } else if (acao2 == 4) {
                            // emprestimo
                            clientePj[contaAtual].Emprestimo();
                        } else {
                            JOptionPane.showMessageDialog(null, "Informe uma Opção Válida!");
                        }
                    }
                }             
                            break;
                        } 
                    }
                    // entrar na conta do cliente
                     else {
                    JOptionPane.showMessageDialog(null, "Informe uma Opção Válida!");
                }
            } else if (acao == 3) {
                logado = false;
                JOptionPane.showMessageDialog(null, "Volte Sempre!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe uma Opção Válida!");
            }
        }

    }
}
