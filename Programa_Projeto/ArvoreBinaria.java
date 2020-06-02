public class ArvoreBinaria {
    
    //Atributos
    private No raiz = null;
    
    //Construtores
    public ArvoreBinaria(){

    }

    public ArvoreBinaria(No raiz){
        this.raiz = raiz;
    }

    //Metodos
        //Percorrer a minha arvore binaria
    public void lnr(){
        lnr(raiz);
    }

    public void lnr(No raiz){
        if(raiz != null){
            lnr(raiz.getEsq());
            System.out.println(raiz.getElemento().toString());
            lnr(raiz.getDir());
        }
    }

        //Contar
    public int contar(){
        return contar(raiz);
    }

    public int contar(No raiz){
        if(raiz != null){
            return 1 + contar(raiz.getEsq()) + contar(raiz.getDir());
        }else{
            return 0;
        }
    }

        //Se existe arvore binaria
    public boolean existe(){
        return existe(raiz);
    }

    private boolean existe(No raiz){
        if(raiz == null){
            return false;
        }else{
            return true;
        }
    }
        //Se existe um certo Pais
        public boolean existePais(String nome) {
            return existePais(raiz, nome);
        }
        
        public boolean existePais(No raiz, String nome) {
            if(raiz == null) {
                return false;
            }else {
                if(raiz.getElemento().getNome().equals(nome)) {
                    return true;
                }else {
                    if(existePais(raiz.getEsq(),nome)) {
                        return true;
                    }else {
                        return existePais(raiz.getDir(),nome);
                    }
                }
            }
        }
    

        public int altura(){
            return altura(raiz);
        }

        public int altura(No raiz) {
            if(raiz == null) {
                return 0;
            } else if(raiz.getEsq() == null && raiz.getDir() == null) {
                return 1;
            } else {
                return 1 + Integer.max(altura(raiz.getEsq()), altura(raiz.getDir()));
            }
        }

        public void listarAteNivelDado(int nivel) {
            listarAteNivelDado(raiz, nivel);
        }
        
        public void listarAteNivelDado(No raiz, int nivel) {
            
            if(raiz == null) {
                //System.out.print("Arvore vazia"); Assim imprime sempre "Arvore Vazia" cada vez que vai la 
                return;
            } else if(nivel >= 1) {
                System.out.println(raiz.getElemento().getNome());
                listarAteNivelDado(raiz.getEsq(), nivel -1);
                listarAteNivelDado(raiz.getDir(), nivel -1);
            }
        }
    

        //Inserir na arvore 
        
        public void inserir(int i, String nome) {
            raiz = inserir(raiz, i, nome);
        }
        
        public No inserir(No raiz, int i, String nome) {
            
            if(raiz == null) {
                return new No(new Elemento(i,nome));
            }
            if(raiz.getElemento().getNumero() >= i) {
                raiz.setDir(inserir(raiz.getDir(), i, nome));
                
            }
            else if(raiz.getElemento().getNumero() <= i) {
                raiz.setEsq(inserir(raiz.getEsq(), i, nome));
            }
            else {
                raiz.setDir(inserir(raiz.getDir(), i, nome));
            }
            
            return raiz;
            
        }
        
        public No raiz() {
            return raiz;
        }    

}