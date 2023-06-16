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
        if(saldo>=valor){
            JOptionPane.showMessageDialog(null,"Você sacou " +valor+ " Reais.");
            saldo-=valor;
        } else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente."
                                        +"\n Para Sacar essa Quantia a Conta deve ter Mais "
                                        + (valor-saldo) +" Reais");
        }
    }

    public void Deposito(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto Deseja Depositar?"));
        if(valor>0){
        JOptionPane.showMessageDialog(null,"Você Depositou " +valor+ " Reais.");
        saldo+=valor;
        } else{
            JOptionPane.showMessageDialog(null,"Você pode Apenas Adicionar Depósitos acima de 0 Reais.");
        }
    }

    public void Emprestimo() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja pegar emprestado?"));
        if(valor<=10000 && valor>=1){
            JOptionPane.showMessageDialog(null,"Você Emprestou " +valor+ " Reais.");
            saldo+=valor;
        } else if(valor<=0){
            JOptionPane.showMessageDialog(null,"O valor é Nulo ou Negativo");
        } else{ 
           JOptionPane.showMessageDialog(null,"Por Conta das Diretrizes do Banco o Valor Máximo a ser Emprestado é R$10.000.");
        } 
    }
}

