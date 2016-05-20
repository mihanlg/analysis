package ???.twitteraccessor;

import java.io.Serializable;
import java.util.Date;

public class Tweet implements Serializable {
    private String content;
    private Date timestamp;
    private int favoriteCount;
    private int retweetCount;
    private String lang;


    @Override
    public boolean equals(Object o) {
        ???
    }

    @Override
    public int hashCode() {
        ???
    }

    @Override
    public String toString() {
        ???
    }


    // etc ???
}
