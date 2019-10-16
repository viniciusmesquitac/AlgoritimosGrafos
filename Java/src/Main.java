
/* 
* Criado em $daOct 16, 2019 por Vinicius Mesquita
*/


public class Main {

	// classe principal onde serao testados os algoritimos :D

	public static void main(String[] args) {
		
		Integer[][] matrizPesos;
		
		try {
			
			Grafo grafo = new Grafo(5);
			
			matrizPesos = grafo.getMatrizPesos();
			
			grafo.inserirPesoDosVertices(2, 2, 5);
			  
			grafo.printMatriz(matrizPesos);
			
		} catch (Exception e) {
			System.out.println("error = "+ e.getMessage());
		}
	}

}
