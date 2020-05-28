

public class Main{

    public static void main (String[] args) {

        ArvoreBinaria a1 = new ArvoreBinaria(criarArvore());

        System.out.println(" ------------ MENU ------------");

        System.out.println("");

        System.out.println(" 1 - Saber a nossa localização ");
        System.out.println(" 2 - Árvore Binária visual ");
        System.out.println(" 3 - Quantidade de Países ou Cidades (Açores ou Madeira) existentes?");
        System.out.println(" 4 - Procurar Países ou Cidades (Açores, Madeira) ");
        System.out.println(" 5 - Sair ");

        System.out.println("");
        
        

    }

    static public No criarArvore(){
        No raiz;
		No no1 = new No(new Elemento(1,"Açores"));
		No no2 = new No(new Elemento(2,"Portugal"));
		No no3 = new No(new Elemento(3,"Madeira"));
		No no4 = new No(new Elemento(4,"Espanha"));
		No no5 = new No(new Elemento(5,"Itália"));
		No no6 = new No(new Elemento(6,"França"));
		No no7 = new No(new Elemento(7,"Polónia"));
		No no8 = new No(new Elemento(8,"Alemanha"));
		No no9 = new No(new Elemento(9,"República Checa"));
		No no10 = new No(new Elemento(10,"Suiça"));
		No no11 = new No(new Elemento(11,"Eslováquia"));
		No no12 = new No(new Elemento(12,"Austria"));
		No no13 = new No(new Elemento(13,"Hungria"));

        return raiz;
    }


}