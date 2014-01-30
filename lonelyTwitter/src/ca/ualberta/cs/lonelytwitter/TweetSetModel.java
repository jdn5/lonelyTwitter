package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel
{
	private int count;
	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetSetModel()
	{
		super();
		this.count = 0;
		tweets = new ArrayList<LonelyTweetModel>();
	}
	public int countTweets()
	{
		return count;
	}

	public void addTweet(LonelyTweetModel tweet)throws IllegalArgumentException{
		try{
			for(int x=0; x<count; x++){
				if(tweet.equals(tweets.get(x)))
					 throw new IllegalArgumentException();
			}
			tweets.add(tweet);
			count++;
		}
		
		catch(IllegalArgumentException n){
			
		}
	}
	public LonelyTweetModel[] getTweets(){
		return (LonelyTweetModel[])tweets.toArray();
	}
}
