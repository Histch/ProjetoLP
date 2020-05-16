package Aeroporto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] teste = {
				{0,1,1,0,0,0,0,0,0,0,0},
				{1,0,0,1,0,0,0,0,0,0,0},	
				{1,0,0,0,0,0,0,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,1,0},
				{0,0,0,1,0,0,0,1,0,0,1},
				{0,0,0,0,0,0,1,0,1,1,0},
				{0,0,0,0,0,1,0,0,0,0,0},
				{0,0,1,0,1,0,0,0,0,0,0},
				{0,0,0,0,1,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0,0,1},
				{0,0,0,0,1,0,0,0,0,1,0}
		};
		
		for(int i=0; i < teste.length ; i++) {
			System.out.println();
			for(int j=0; j < teste[i].length; j++) {
				System.out.print(teste[i][j]+" ");
			}
		}
		
	}

}
