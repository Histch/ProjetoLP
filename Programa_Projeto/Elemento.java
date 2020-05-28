public class Elemento {

    //Atributos 
    private int numero;
    //Construtores
    public Elemento(){
        numero = 0;
    }

    public Elemento(int numero){
        super();
        this.numero = numero;
    }
    //Acessores
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    //ToString
    @Override
    public String toString(){
        return "[" + numero + "]";
    }

}