
/* 
* Criado em $daOct 16, 2019 por Vinicius Mesquita
*/


public interface InterfaceGrafo {

	Integer[][] criarMatrizIncidencia(int tamanho, int peso);
	void inserirPesoDosVertices(int v0, int v1, int peso);
	void printMatriz(Integer[][] matriz);
	
}
