import java.util.Scanner;

public class Main {
	
	static ArvoreBinaria a1 = new ArvoreBinaria(criaArvore1());
	
	public static void main(String[] args) {

		ArvoreBinaria a1 = new ArvoreBinaria(criaArvore1());
		
		int opcao = 0;
		String nome ="";
		
		while(opcao != 6) {
		
        System.out.println(" ------------ MENU ------------");

        System.out.println("");

        System.out.println(" 1 - Saber a nossa localização ");
        System.out.println(" 2 - Aeroportos disponiveis ");
        System.out.println(" 3 - Quantidade de Países ou Cidades (Açores ou Madeira) existentes?");
        System.out.println(" 4 - Procurar Países ou Cidades (Açores, Madeira) ");
        System.out.println(" 5 - Para que pais deseja ir?");
        System.out.println(" 6 - Sair ");

        System.out.println("");
        
        opcao = lerOpcao();
        
        switch(opcao) {
        	case 1:
        		System.out.println("A sua localização: " + a1.raiz().getElemento().getNome());
        		break;
        	case 2: 
        		a1.lnr();
        		break;
        	case 3:
        		System.out.println("Número de paises: "+ a1.contar());
        		break;
        	case 4: 
        		System.out.println("Procurar o pais: ");
        		nome = lerNome();
        		System.out.println("Procura pais '"+ nome +"': " + a1.existePais(nome));
        		break;
        	case 5:
        		System.out.print("Para que pais deseja ir? ");
        		nome = lerNome();
        		teste(nome);
        		break;
        	}  
		}
		
		//Existe Pais!
		//System.out.println("Procura pais Portugal: " + a1.existePais("Portugal")); // true
		//System.out.println("Procura pais Russia: " + a1.existePais("Russia")); // false 
		
	}
	
	public static String teste(String nome) {
		if(nome == "França") {
			a1.listarAteNivelDado(1);
		}else if(nome == "Espanha" || nome == "Suiça") {
			a1.listarAteNivelDado(2);
		}else if(nome == "Portugal" || nome == "Itália" || nome == "Alemanha" || nome == "Autria") {
			a1.listarAteNivelDado(3);
		}else if(nome == "Açores" || nome == "Madeira" || nome == "Polonia" || nome == "República Checa" || nome == "Eslováquia" || nome == "Hungria") {
			a1.listarAteNivelDado(4);
		}else {
			System.out.println("Destino não disponivel: " + nome);
		}
		return nome;
	}
	
	public static int lerOpcao() {
		// deviamos validar :)
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
		return numero;
	}
	
	public static String lerNome() {
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		return nome;
	}

	static public No criaArvore1() {
		
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
		
		no6.setEsq(no4);
		no6.setDir(no10);
		
		no4.setEsq(no2);
		no4.setDir(no5);
		
		no10.setEsq(no8);
		no10.setDir(no12);
		
		no2.setEsq(no1);
		no2.setDir(no3);
		
		no8.setEsq(no7);
		no8.setDir(no9);
		
		no12.setEsq(no11);
		no12.setDir(no13);
		

		raiz = no6;
		return raiz;
	}
}