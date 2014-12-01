package com.stuzocub.calculo;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

	// TODO Porque he tenido que a–adir esto? Ha sido al a–adir lo de ActionBar
public class MainActivity extends Activity {
	private TextView resultado;
	private TextView formula;
	private int intResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=(TextView)findViewById(R.id.txtResultado);
        // TODO Contralar tama–o de textview resultado
        formula=(TextView)findViewById(R.id.formula);
        
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/dkcrayonrumble.ttf");
        
        resultado.setTypeface(myTypeface);
        formula.setTypeface(myTypeface); 
        
        ActionBar actionBar = getActionBar(); 
        actionBar.hide();
        nuevaOperacion(0);       
    }  
    public void clickNum(View v){
    	
    	Button boton =(Button)v;
    	Log.d("Calculo" , "clickNum: " + boton.getText().toString());
    	numeroPulsado(boton.getText().toString());
    	int resultadoAComprobar=Integer.parseInt((String) resultado.getText());
    	if( resultadoAComprobar == intResultado){
    		Toast.makeText(getApplicationContext(), "Muy Bien", 
    				// TODO A–adir puntuacion
    				   Toast.LENGTH_SHORT).show();
    		nuevaOperacion(resultadoAComprobar);
    		resultado.setText("0");
    	}  	
    }
    
    public void clickBorrar(View v){
    	resultado.setText("0");
    }
    
    private void numeroPulsado(String digito) {
    	Log.d("Calculo" , "numeroPulsado");
    	if(resultado.getText().equals("0")){
    		resultado.setText(digito);
    	}else{
    		resultado.setText(resultado.getText()+digito);
    	}
    }
    private void nuevaOperacion(int res_anterior){
    	Log.d("Calculo" , "nuevaOperacion");
    	genOperaciones m_generador=new genOperaciones();
    	if(res_anterior==0){
    		formula.setText(m_generador.GetnuevaOperacion());
    	}else{
    		formula.setText(m_generador.GetnuevaOperacion(res_anterior));
    	}
    		
    	intResultado=m_generador.getResultado();
    }
    
    

}
