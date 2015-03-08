package backend;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.regions.Regions;
import com.amazonaws.*;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Backend {
	

	public static boolean loadServerData(ArrayList<String> listOfKeys, ArrayList<Object> listOfAttributes, String tableName){
		 
//		ClientConfiguration config = new ClientConfiguration();
		
		/*
		 * Client Code
		 */
		AmazonDynamoDBClient ADDBC = new AmazonDynamoDBClient(new ProfileCredentialsProvider("DavidChristy") );
		
		/*
		 *Server code
		*/
//		AmazonDynamoDBClient ADDBC = new AmazonDynamoDBClient(); 
		
		ADDBC.setRegion(Regions.US_WEST_2);
		DynamoDB dynamoDB = new DynamoDB(ADDBC);
//		String tableName = "users";		k
		try {
			Table table = dynamoDB.getTable(tableName);
            
			Item item = new Item()
                .withPrimaryKey("user ID", 0, "user email", "0");
            table.putItem(item);
            Iterator keyIterator = listOfKeys.iterator();
            for (Iterator iterator = listOfAttributes.iterator(); iterator
					.hasNext();) {
            	
				Object attribute = (Object) iterator.next();
				String key = (String) keyIterator.next();
				
				table.updateItem(key, attribute);
			}
            
        } catch (Exception e) {
            System.err.println("Failed to create item in " + tableName);
            System.err.println(e.getMessage());
        }
		return true;

		
	}


}
