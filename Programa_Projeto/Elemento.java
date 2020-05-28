    public class Elemento {

    // 1. ATRIBUTOS
    private int numero;
    private String nome;

    // 2. CONSTRUTOR

    public Elemento() {
        numero = 0;
        nome = "";
    }

    public Elemento(int numero,String nome) {
        super();
        this.nome = nome;
        this.numero = numero;
    }

    // 3. ACESSORES

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // toString
    @Override
    public String toString() {
        return "[" + numero + "]" + "[" + nome + "]";
    }

}