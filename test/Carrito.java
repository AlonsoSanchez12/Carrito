/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mitchell santiago
 */
public class Carrito {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       molde.Molde carrito1=new molde.Molde();
        carrito1.setColor("Narcotic blue");
        carrito1.setmarca("Ford");
        carrito1.settrans("Estandar");
        //System.out.println("La marca es: "+carrito1.marca);
        //System.out.println("El color es: "+carrito1.color);
        //System.out.println("la  transmision es: "+ carrito1.transmision);
        System.out.println(carrito1.getColor());
        System.out.println(carrito1.getMarca());
        System.out.println(carrito1.getTransmision());
        
        System.out.println("=======================");
        
        molde.Molde carrito3= new molde.Molde("Nissan","Red","2016","Manual",5);
        
        System.out.println(carrito3.color);
        System.out.println(carrito3.marca);
        System.out.println(carrito3.modelo);
        System.out.println(carrito3.puertas);
        System.out.println(carrito3.transmision);
        
        System.out.println("======================");
        
        molde.Molde carrito4= new molde.Molde("Jeep","green","1998");
        carrito4.settrans("Estandar");
        
        System.out.println(carrito4.color);
        System.out.println(carrito4.marca);
        System.out.println(carrito4.modelo);
        
        
        
        System.out.println(carrito4.getTransmision());
        
    }
    
}
