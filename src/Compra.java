public class Compra implements Comparable<Compra>{
    private String nome;
    private double valor;

    public Compra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " + nome + " (" + valor + "reais)";
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.getValor()).compareTo(Double.valueOf(outraCompra.getValor()));
    }
}
