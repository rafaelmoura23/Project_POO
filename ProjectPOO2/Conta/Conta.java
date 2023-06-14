package ProjectPOO2.Conta;

import javax.swing.JOptionPane;

public abstract class Conta {
    
    String nome;
    int nConta;
    double saldo;

    //getts and setts
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //outros metodos
    public void Saque() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto Deseja Sacar?"));
        if(saldo>valor){
            JOptionPane.showMessageDialog(null,"Você sacou " +valor+ " Reais.");
            saldo-=valor;
        } else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente.");
        }
    }

    public void Deposito(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto Deseja Depositar?"));
        JOptionPane.showMessageDialog(null,"Você Depositou " +valor+ " Reais.");
        saldo+=valor;
    }

    public void Emprestimo() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja pegar emprestado?"));
        if(valor<=10000){
            JOptionPane.showMessageDialog(null,"Você pegou emprestado " +valor+ " Reais.");
            saldo+=valor;;
        } else if(valor>10001){
            JOptionPane.showMessageDialog(null,"Você extrapolou o valor máximo de empréstimo.");
        }
    }


}

