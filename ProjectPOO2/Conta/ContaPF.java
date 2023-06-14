package ProjectPOO2.Conta;

public class ContaPF extends Conta {
    String nCpf;
    int idade;

     //getts and set
    public String getnCpf() {
        return nCpf;
    }

    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
