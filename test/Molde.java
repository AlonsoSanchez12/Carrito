/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mitchell santiago
 */
public class Molde {
    public String color,modelo,transmision,marca;
	    public int puertas;
	    
	   
	    public Molde(){
	        marca="unknown";
	        color= "Not avalible";
	        modelo= "Not avalible";
	        transmision= "Not avalible";
	        puertas=0;
	    }
	    //sobrecarga - overload
	    public Molde(String marca,String color,String modelo,String transmision,int puertas){
	    	this.marca=marca;
	    	this.color=color;
	    	this.modelo=modelo;
	    	this.transmision=transmision;
	    	this.puertas=puertas;
	    }
	    
	    //carrito4
	    public Molde(String marca,String color,String modelo) {
	    	this.marca=marca;
	    	this.color=color;
	    	this.modelo=modelo;
	    }
	    public void setColor(String valor){
	        color = valor;
	    }
	    public void setmarca(String mar){
	        marca=mar;
	    }
	    public void settrans(String gg){
	        transmision=gg;
	    }
	    
	    public void setpuertas(int puer ) {
	    	puertas=puer;
	    }
	    
	    public String getColor() {
	    	return color;
	    }
	    public String getMarca() {
	    	return marca;
	    }
	    public String getTransmision() {
	    	return transmision;
	    
	    }
}
