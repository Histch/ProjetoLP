import java.util.Scanner;

public class Main {
	
	static ArvoreBinaria a1 = new ArvoreBinaria(criaArvore1());
	
	public static void main(String[] args) {

		ArvoreBinaria a1 = new ArvoreBinaria(criaArvore1());
		
		menu(a1);
	}

	private static void menu(ArvoreBinaria a1) {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		while(choice != 7){

		System.out.println(" ------------ MENU ------------");

        System.out.println("");

        System.out.println(" 1 - Saber a nossa localização ");
        System.out.println(" 2 - Árvore Binária visual ");
        System.out.println(" 3 - Quantidade de Países ou Cidades (Açores ou Madeira) existentes?");
        System.out.println(" 4 - Procurar Países ou Cidades (Açores, Madeira) ");
		System.out.println(" 5 - Para que pais deseja ir?");
		System.out.println(" 6 - Inserir nova localização ");
        System.out.println(" 7 - Sair ");
        
        System.out.print("\nEscreva aqui a opção: ");
        
        choice = scanner.nextInt();

		switch (choice) {
		case 1:
    		System.out.println("A sua localização: " + a1.raiz().getElemento().getNome());
    		break;
		case 2: 
    		a1.lnr();
    		break;
		case 3:
    		System.out.println("Numero de paises: "+ a1.contar());
    		break;
		case 4: 
    		System.out.println("Procurar o pais: ");
    		String nomeProcurar = scanner.next();
    		System.out.println("Procura pais '"+ nomeProcurar +"': " + a1.existePais(nomeProcurar));
    		break;
		case 5:
    		System.out.println("Para que pais deseja ir? ");
			String paisDesejado = scanner.next();
			System.out.println("Paises a percorrer: ");
    		localizacao(paisDesejado);
			break;
		case 6:
			System.out.println("Inserir nova localização: ");
			System.out.println("Número da localização tem de ser maior que o número de localizações ja existentes!");
			System.out.println("Localização: ");
			String novaLocalizacao = scanner.next();
			System.out.println("Número da localização: ");
			int numeroLocalizacao = scanner.nextInt();
			if(numeroLocalizacao <= a1.contar()){
				System.out.println("Número de localização não válido!");
			}else{
				a1.inserir(numeroLocalizacao,novaLocalizacao);
			}
    		break;
		}

	}
		
	}

	//Acrescentar os km, nos percussos na função localizacao
	//Adicionar novos locais ou seja localizações
	//Listar apenas o nivel dado
	
	private static void localizacao(String nome) {
		int franca = 0, espanha = 826, suica = 473, portugal = 354, italia = 1436, alemanha = 531, austria = 403, acores = 1516, madeira = 1098, polonia = 656, repcheca = 372, eslovaquia = 482, hungria = 505 ;
		int resultado = 0;
		ArvoreBinaria a1 = new ArvoreBinaria(criaArvore1());
		if(nome.equals("Franca")) {
			a1.listarAteNivelDado(1);
			System.out.println("Distânica percorrida: " + franca + "Km");
		}else if(nome.equals( "Espanha")) {
			a1.listarAteNivelDado(2);
			System.out.println("Distânica percorrida: " + espanha + "Km");
		}else if(nome.equals("Suica")){
			a1.listarAteNivelDado(2);
			System.out.println("Distânica percorrida: " + suica + "Km");
		}else if(nome.equals("Portugal")){
			a1.listarAteNivelDado(3);
			resultado = espanha + portugal;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Italia")){
			a1.listarAteNivelDado(3);
			resultado = espanha + italia;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Alemanha")){
			a1.listarAteNivelDado(3);
			resultado = suica + alemanha;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Austria")){
			a1.listarAteNivelDado(3);
			resultado = suica + austria;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Acores")){
			a1.listarAteNivelDado(4);
			resultado = espanha + portugal + acores;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Madeira")){
			a1.listarAteNivelDado(4);
			resultado = espanha + portugal + madeira;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Polonia")){
			a1.listarAteNivelDado(4);
			resultado = suica + alemanha + polonia;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Republica Checa")){
			a1.listarAteNivelDado(4);
			resultado = suica + alemanha + repcheca;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else if(nome.equals("Eslovaquia")){
			a1.listarAteNivelDado(4);
			resultado = suica + austria + eslovaquia;
			System.out.println("Distânica percorrida: " + resultado+ "Km");
		}else if(nome.equals("Hungria")){
			a1.listarAteNivelDado(4);
			resultado = suica + austria + hungria;
			System.out.println("Distânica percorrida: " + resultado + "Km");
		}else {
			System.out.println("Destino não disponivel: " + nome);
		}
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