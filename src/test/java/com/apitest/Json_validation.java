package com.apitest;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Json_validation {
public static void main(String[] args) throws IOException, ParseException {
	File f = new File("C:\\Users\\91735\\Desktop\\JSON\\Payload.json");
	FileReader reader = new FileReader(f);
	JSONParser parser = new JSONParser();
	Object obj = parser.parse(reader);
	JSONObject jsonobj = (JSONObject)obj;
	Object object = jsonobj.get("data");
	String string = object.toString();
	System.out.println("data: "+string);
	Assert.assertEquals(object, string);
}
}
