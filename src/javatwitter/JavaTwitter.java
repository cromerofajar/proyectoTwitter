/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author cromerofajar
 */
public class JavaTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        /*
        *
        * 
        *
        */
        
        int menu=0;
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"******MENU******\n\n Seleccione que desea realizar:\n1-ver linea de tiempo de sus twitter\n2-Escribir un twitter\n3-Buscar por una palabra o #\n4-Salir"));
           switch(menu){
                case 1:LineaDeTiempo linea=new LineaDeTiempo();
                       linea.verLienaDeTiempo();
                       break;
                case 2:EnviarUnTwitter enviar=new EnviarUnTwitter();
                       enviar.twittear();
                       break;
                case 3:Buscar busc=new Buscar();
                       busc.buscarPor();
                       break;
                case 4:
                    int confirmar=Integer.parseInt(JOptionPane.showInputDialog(null,"Seguro que desea salir?\n1-Si\n2-No"));
                    if(confirmar==1){
                    System.exit(0);}
                    else{
                       break;
                    }
           } 
        }while(menu!=1000000);
        
        
    }
}
