
/* 
* Criado em $daOct 16, 2019 por Vinicius Mesquita
*/


public class Grafo implements InterfaceGrafo {

	private final int qntd_nos;
	private final int infinito = 214783647;
	private Integer[][] matrizPesos;
	
	public Grafo(int qntd_nos) throws Exception {
		
		if(qntd_nos <= 0) {
			throw new Exception("Numero de nos deve ser maior que zero.");
		}
		this.qntd_nos = qntd_nos;
		
		try {
			Integer[][] matrizVazia = criarMatrizIncidencia(qntd_nos, 0);
			matrizPesos = matrizVazia;
			
		} catch(Exception e) {
			System.out.println("error = " + e.getMessage());
		}
	}
	
	// getters & setters
	public Integer[][] getMatrizPesos() {
		return matrizPesos;
	}

	public void setMatrizPesos(Integer[][] matrizPesos) {
		this.matrizPesos = matrizPesos;
	}

	@Override
	public Integer[][] criarMatrizIncidencia(int tamanho, int peso) {
		
		Integer matriz[][] = new Integer[tamanho+1][];
		
		if(qntd_nos <= 1) {
			return matriz;
		} else {
			try {
				for (int i = 0; i < tamanho; i++) {
					matriz[i] = new Integer[tamanho + 1];
					
					for (int j = 0; j < tamanho; j++) {
						matriz[i][j] = peso;
					}
					
				}
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
			}
			return matriz;
		}
	}


	@Override
	public void inserirPesoDosVertices(int v0, int v1, int peso) {
		
		if(v0 < 0 || v0 > this.qntd_nos || v1 < 0 || v1 > this.qntd_nos) {
			System.out.println("Vertices invalidos."); // throws
		} else {
			this.matrizPesos[v0][v1] = peso;
		}
		
	}


	@Override
	public void printMatriz(Integer[][] matriz) {
		
		for (int i = 0; i < this.qntd_nos; i++) {
			for (int j = 0; j < this.qntd_nos; j++) {
				System.out.printf("["+matriz[i][j]+"]");
			}
			System.out.printf("\n");
		}
	}
	
}
