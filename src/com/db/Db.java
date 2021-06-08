package com.db;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class Db {
	public static MongoDatabase db = null;
	public static void main(String ar[]){
		db = connect();
		System.out.println("sdf");
		
	}

	public static MongoDatabase connect() {
		if (db == null) {
			MongoClient mo = new MongoClient("localhost", 27017);
			MongoCredential cr = MongoCredential.createCredential("root", "mydb", "root".toCharArray());
			MongoDatabase db = mo.getDatabase("mydb");

//			MongoClient cl = new MongoClient("localhost", 27017);
//			db = cl.getDatabase("mydb");
		}
		if(db!=null)
			System.out.println("Connected Successfully");
		else
			System.out.println("Failed To connect");			
		return db;
	}
}
