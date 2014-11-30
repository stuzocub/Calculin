package com.stuzocub.calculo;
import java.util.Random;

import android.util.Log;

public class genOperaciones {
	
	private int resultado;
		
	private int dificultad;
	
	public int getResultado() {
		return resultado;
	}
	private void setResultado(int i) {
		this.resultado=i;
		
	}



	public genOperaciones() {
		this.dificultad=100;
	}
	
	public String GetnuevaOperacion(){
		
		String operacionStr="";
		Random rnd = new Random();
		int operador1;
		int operador2;
		int ioperador;
		do{
			operador1=(int)(rnd.nextDouble() * 9 + 1);
		    operador2=(int)(rnd.nextDouble() * 9 + 1);
		    ioperador=(int)(rnd.nextDouble() * 3 + 1);
		    switch (ioperador) {
			case 1:
				operacionStr=operador1+"+"+operador2;
				setResultado(operador1+operador2);
				break;
			case 2:
				operacionStr=operador1+"-"+operador2;
				setResultado(operador1-operador2);
				break;
			case 3:
				operacionStr=operador1+"*"+operador2;
				setResultado(operador1*operador2);
				break;
			case 4:
				operacionStr=operador1+"/"+operador2;
				setResultado(operador1/operador2);
				break;

			default:
				break;
			}
		    Log.d("Calculo" , "GetnuevaOperacion: Resultado. " + resultado);
		}while((resultado<=1)||(resultado>dificultad));
		
		return operacionStr;
	}
	public String GetnuevaOperacion(int operador1){
		
		String operacionStr="";
		Random rnd = new Random();
		int operador2;
		int ioperador;
		do{
			// TODO Aumentar las posibilidades de / * poniendolos mas case
		    operador2=(int)(rnd.nextDouble() * 9 + 2);
		    ioperador=(int)(rnd.nextDouble() * 10 + 1);
		    Log.d("Calculo" , "GetnuevaOperacion: ioperador. " + ioperador);
		    switch (ioperador) {
			case 1:
				operacionStr=operador1+"+"+operador2;
				setResultado(operador1+operador2);
				break;
			case 2:
				operacionStr=operador1+"-"+operador2;
				setResultado(operador1-operador2);
				break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				operacionStr=operador1+"*"+operador2;
				setResultado(operador1*operador2);
				break;
			
			case 10:
				operacionStr=operador1+"/"+operador2;
				setResultado(operador1/operador2);
				break;

			default:
				break;
			}
		    Log.d("Calculo" , "GetnuevaOperacion: Resultado. " + resultado);
		}while((resultado<=1)||(resultado>dificultad)||(operador1%operador2!=0));
		
		return operacionStr;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}



	
	

}
