package com.extra;

import org.bson.Document;

import com.db.Db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class Test {
	public static MongoDatabase db = Db.connect();

	public static void main(String[] args) {
		
		MongoCursor<Document> mc = db.getCollection("emp").find().iterator();
		while(mc.hasNext()){
			p(mc.next()+"");
		}
		
		
	}
	public static void p(String a){
		System.out.println(a);
	}
	
}
