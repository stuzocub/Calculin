package com.stuzocub.calculo;
import java.util.Random;

import android.R.bool;
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
		boolean valido;
		do{
			valido=true;
			operador1=(int)(rnd.nextDouble() * 9 + 1);
		    operador2=(int)(rnd.nextDouble() * 9 + 1);
		    ioperador=(int)(rnd.nextDouble() * 4 + 1);
		    switch (ioperador) {
			case 1:
				operacionStr=operador1+"+"+operador2;
				setResultado(operador1+operador2);
				if(resultado>dificultad){
					valido=false;
				}
				break;
			case 2:
				operacionStr=operador1+"-"+operador2;
				setResultado(operador1-operador2);
				if(resultado<=1){
					valido=false;
				}
				break;
			case 3:
				operacionStr=operador1+"*"+operador2;
				setResultado(operador1*operador2);
				if(resultado>dificultad){
					valido=false;
				}
				break;
			case 4:
				operacionStr=operador1+"/"+operador2;
				setResultado(operador1/operador2);
				if(operador1%operador2!=0){
					valido=false;
				}
				break;

			default:
				break;
			}
		    Log.d("Calculo" , "GetnuevaOperacion: Resultado. " + resultado);
		}while(valido==false);
		
		return operacionStr;
	}
	public String GetnuevaOperacion(int operador1){
		
		// TODO Hay que cambiar los while, con una bandera
		
		String operacionStr="";
		Random rnd = new Random();
		int operador2;
		int ioperador;
		boolean valido;
		do{
			valido=true;
			// TODO Aumentar las posibilidades de / * poniendolos mas case
		    operador2=(int)(rnd.nextDouble() * 9 + 2);
		    ioperador=(int)(rnd.nextDouble() * 10 + 1);
		    Log.d("Calculo" , "GetnuevaOperacion: ioperador. " + ioperador);
		    switch (ioperador) {
			case 1:
				operacionStr=operador1+"+"+operador2;
				setResultado(operador1+operador2);
				if(resultado>dificultad){
					valido=false;
				}
				break;
			case 2:
				operacionStr=operador1+"-"+operador2;
				setResultado(operador1-operador2);
				if(resultado<=1){
					valido=false;
				}
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
				if(resultado>dificultad){
					valido=false;
				}
				break;
			
			case 10:
				operacionStr=operador1+"/"+operador2;
				setResultado(operador1/operador2);
				if(operador1%operador2!=0){
					valido=false;
				}
				break;

			default:
				break;
			}
		    Log.d("Calculo" , "GetnuevaOperacion: Resultado. " + resultado);
		}while(valido==false);
		
		return operacionStr;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}



	
	

}
