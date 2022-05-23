package jogo;

public class Navio {
	int contadorDeNavios = 0;
	int area [][] = new int [8][8];
	int linhas = 0;
	int colunas = 0;

	public void iniciarNavio(int[] navios) {
	    while (contadorDeNavios < 5) {
	        int linhas = (int) (Math.random() * 8);
	        int colunas = (int) (Math.random() * 8); 
	        if(area[linhas][colunas] == 0) {
	            if (contadorDeNavios == 0) {
	                area[linhas][colunas] = navios[0];
	            } else if (contadorDeNavios == 1) {
	                area[linhas][colunas] = navios[1];
	            } else if (contadorDeNavios == 2) {
	                area[linhas][colunas] = navios[2];
	            } else if (contadorDeNavios == 3) {
	                area[linhas][colunas] = navios[3];
	            } else if (contadorDeNavios == 4) {
	                area[linhas][colunas] = navios[4];
	            }
	            contadorDeNavios++;
	        	}   
	    	}   
		}
}
