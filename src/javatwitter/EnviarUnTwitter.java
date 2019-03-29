/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatwitter;

import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author cromerofajar
 */
public class EnviarUnTwitter {
    /*
    *
    * twitter: method used to post a tweet
    *
    */
    public void twittear() throws TwitterException{
    Twitter twitter = TwitterFactory.getSingleton();
    String mensaje=JOptionPane.showInputDialog(null,"Escriba su nuevo tweet");
    Status status = twitter.updateStatus(mensaje);
    System.out.println("Successfully updated the status to [" + status.getText() + "].");
       }
}
