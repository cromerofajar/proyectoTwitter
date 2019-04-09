
package javatwitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;

/**
 *
 * @author cromerofajar
 */
public class ConfigurationBuilder {
   public ConfigurationBuilder(){
ConfigurationBuilder cb = new ConfigurationBuilder();
cb.setDebugEnabled(true)
        .setOAuthConsumerKey("")
        .setOAuthConsumerSecret("")
        .setOAuthAccessToken("")
        .setOAuthAccessTokenSecret("");
TwitterFactory tf = new TwitterFactory(cb.build());
Twitter twitter = tf.getInstance();

}

    private Object setDebugEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Configuration build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
