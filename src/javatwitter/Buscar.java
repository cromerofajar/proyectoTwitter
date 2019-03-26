package javatwitter;

import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author cromerofajar
 */
public class Buscar {
    public void buscarPor() throws TwitterException{
    Twitter twitter = TwitterFactory.getSingleton();
    String buscar=JOptionPane.showInputDialog(null,"Que desea buscar?");
    Query query = new Query(buscar);
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
    }

    }
}
