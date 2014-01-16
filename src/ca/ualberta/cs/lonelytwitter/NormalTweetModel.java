package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class NormalTweetModel extends LonelyTweetModel
{

	
	public NormalTweetModel(String text){
		super(text);
	}

	@Override
	public Date getTimestamp() {
		return null;
	}
	
	public boolean isimportant(){
		return false;
	}
}
