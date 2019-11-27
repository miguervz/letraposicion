package es.studium.LetraPosicion;

import java.util.Scanner;

public class LetraPosicion {

	public static void main(String[] args) {
		char[][] tabla = new char[3][3];
		int[][] tabla2 = new int[3][3];
		
		int  i, j;
		Scanner teclado = new Scanner(System.in);
	
		for( i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
		System.out.println("Ingrese el valor de la posición "+i+","+j);
		
		tabla[i][j] = teclado.next().charAt(0);
	   
		}}
		for( i=0;i<3;i++)
		{
		for( j=0;j<3;j++)
		{
		tabla2[i][j]=(tabla[i][j]-96);
		 System.out.print("\t"+tabla2[i][j]);
			}
				System.out.println("");
			}
		teclado.close();
		}
	}


