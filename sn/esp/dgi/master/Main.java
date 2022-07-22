package sn.esp.dgi.master;

import ca.quens.sat.master.Pile;
import fr.saclay.mai.master.Fraction;


public class Main {
    
    
    
    public static void main(String[] args) {
        
        Pile p = new Pile(5);
        p.empile(4);
        System.out.println(p.getSommet());

        Fraction f = new Fraction(-2, 4);
        f.afficher();

    
    }


}
// javac -d "./bin"   ./sn/esp/dgi/master/Main.java  // Raki li moy compiler 
// java -cp "./bin" sn.esp.dgi.master.Main // Raki li moy executer
