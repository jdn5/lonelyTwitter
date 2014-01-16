package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweetModel extends AbstractTweetModel{

	public ImportantTweetModel(String text, Date timestamp){

		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	public ImportantTweetModel(String text){

		super(text);
		// TODO Auto-generated constructor stub
	}

	public String getText(){
		return "Important!" + super.getText();
	}
	
	public Date getTimestamp(){
		return timestamp;
	}
	public boolean isimportant(){
		return true;
	}
}
