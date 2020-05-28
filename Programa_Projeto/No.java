public class No {

    //ATRIBUTOS

    private Elemento elemento;
    private No esq;
    private No dir;

    //Construtores

    public No(){
        elemento = null;
        esq = null;
        dir = null;
    }

    public No(Elemento elemento){
        super();
        this.elemento = elemento;
        esq = null;
        dir = null;
    }

    //Acessores

    public Elemento getElemento(){
        return elemento;
    }

    public void setElemento(Elemento elemento){
        this.elemento = elemento;
    }

    public No getEsq(){
        return esq;
    }

    public No getDir(){
        return dir;
    }

    public void setDir(No dir){
        this.dir = dir;
    }

    public void setEsq(No esq){
        this.esq = esq;
    }
    
}