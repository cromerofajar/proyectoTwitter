
package javatwitter;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author cromerofajar
 */
public class LineaDeTiempo  {
   public void verLienaDeTiempo()throws TwitterException{
    Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Mostrar linea del tiempo personal.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                               status.getText());
        }
   }
}
