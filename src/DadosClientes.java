public class DadosClientes {
    int numero;
    String agencia;
    String cliente;
    double saldo = 200;

    public String getAgencia() {
        return agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String setAgencia(String agencia) {
        return this.agencia = agencia;
    }

    public String setCliente(String cliente) {
        this.cliente = cliente;
        return cliente;
    }
    public int setNumero(int numero) {
        return this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

}
