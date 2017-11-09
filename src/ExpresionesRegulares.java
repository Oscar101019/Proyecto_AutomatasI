
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author Oscar
 */
public class ExpresionesRegulares {

public int expresion1(String[] l ){
    int carE=0,vac=0;
    for (int i=0;i<l.length;i++){
        if(!(l[i].equals("a")) && !(l[i].equals("b"))  ){  //&& !(l[i].equals(" "))
            carE++;
 
        }
    }
    return carE;
}    
    
public int expresion2(String[] l ){
    int noVal=0;
    for (int i=0;i<l.length;i++){
        if(!(l[i].equals("a")) && !(l[i].equals("b")) ){ //&& !(l[i].equals(" "))
            noVal++;
        }   
    }
    if(l[l.length-1].endsWith("a")==false){       
        return noVal+1;
    }
    return noVal;
}  




}
