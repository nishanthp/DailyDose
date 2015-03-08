package twillo;

import java.lang.*;
import java.util.*;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.TableCollection;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioRestResponse;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.AccountList;
import com.twilio.sdk.resource.list.AvailablePhoneNumberList;
import com.twilio.sdk.resource.list.ParticipantList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Twillo {

	public static void main(String[] args) {
		final String ACCOUNT_SID = "AC756d3e2d6a7d7fa7b9db0cba810e7bd6";
		  final String AUTH_TOKEN = "303ab01e4c4196619882acac235ec775";
		  TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		  Account account = client.getAccount();
		  
		  System.out.println(account.getFriendlyName());
		  String phoneNumber = "5202657167";
		  
		  
		  MessageFactory messageFactory = account.getMessageFactory();
		  List<NameValuePair> messageParams = new ArrayList<NameValuePair>();
		  messageParams.add(new BasicNameValuePair("To", phoneNumber)); // Replace with a valid phone number
		  messageParams.add(new BasicNameValuePair("From", "(201) 574-7652"));
		  messageParams.add(new BasicNameValuePair("Body", "This is a test message!"));
//		try {
////			Message message = messageFactory.create(messageParams);
////			System.out.println(message.getSid());

//		} catch (TwilioRestException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		  
	}

}
