/*
Diseñe e implemente una clase Emision_Gas que contenga los siguientes atributos:
código de tipo entero, gas de tipo String, contaminación de tipo String, 
numEscape de tipo entero.
Diseñe e implemente sus respectivos métodos get() y set() correspondientes para 
cada atributo; además, implemente el método toString() para mostrar la información
relativa a la clase Emision_Gas.
En la clase principal main(), diseñe e implemente 2 objetos Emision_Gas, con 
valores que considere necesarios y muestre por pantalla.
Por último, imprimir cuál de los dos objetos tiene mas numEscape.
 */
 
package emision_gasapp;

/**
 *
 * @author Ana Pico Solis
 */
class Emision_Gas{
/*Atributos*/
    private int codigo;
    private String gas;
    private String contaminacion;
    private int numEscape;

/*Constructor*/
    public Emision_Gas(int pCodigo, String pGas, String pContaminacion, int pNumEscape){
        
        codigo=pCodigo;
        gas=pGas;
        contaminacion=pContaminacion;
        numEscape= pNumEscape;  
    }

/*metodos*/

public void setCodigo(int codigo){
this.codigo=codigo;
}

public int getCodigo(){
    return codigo;
}

public void setGas(String gas){
this.gas=gas;
}

public String getGas(){
    return gas;
}

public void setContaminacion(String contaminacion){
this.contaminacion=contaminacion;
}

public String getContaminacion(){
    return contaminacion;
}

public void setNumEscape(int numEscape){
this.numEscape=numEscape;
}

public int getNumEscape(){
    return numEscape;
}

@Override
public String toString(){
return "La emisión de gas: "+gas+ " con CODIGO: " +codigo+ "--"
        +"Inspeccionado por el supervisor de " +contaminacion+
         " tiene registrado: " +numEscape+ " % de escape de gas contaminante. "
        +"";
     }

    int detNumEscape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Emision_GasApp {

    public static void main(String[] args) {
        //Creamos los objetos
        Emision_Gas emision1=new Emision_Gas(111,"Gas1", "Contaminacion1" ,20);
        Emision_Gas emision2=new Emision_Gas(112,"Gas2", "Contaminacion2" ,50);
        
        //Mostramos su estado
        System.out.println(emision1.toString());
        System.out.println(emision2.toString());
        
        //Modificamos el Atributo NumEscape de la emison 1
        emision1.setNumEscape(50);
        
        //Comparamos quien tiene mas escape contaminante
        
        if(emision1.getNumEscape()<emision2.getNumEscape()){
            System.out.println(emision1.getContaminacion()+ " tiene mas escape de gas.");
            
        } else{
             System.out.println(emision2.getContaminacion()+" tiene mas escape de gas.");
        }
        
    }
    
}
