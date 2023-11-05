package Newsfeed;

import java.util.Arrays;

public class Newsfeed {

    public Newsfeed(){
    }
    // Create getTopics() below:
    public String[] getTopics(){

        return new String[]{"Opinion", "Tech", "Science", "Health"};
    }

    public static void main(String[] args){
        Newsfeed sampleFeed = new Newsfeed();

        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));

    }
}
