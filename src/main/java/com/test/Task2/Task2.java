package com.test.Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		Object obj = new JSONParser().parse(new FileReader("C:/Users/girishkumar.k/Desktop/animal.json"));

		Scanner scnr = new Scanner(System.in);
		String name = scnr.nextLine();

		JSONObject jo = (JSONObject) obj;
		if (jo.containsKey(name)) {

			JSONObject na = (JSONObject) jo.get(name);
			
			Set s = na.keySet();
			for(Object i:s)
			{
				System.out.println(i.toString() + " : "+na.get(i));
				
			}
			
			
		}
		else
		{
			System.out.println(name + " is not present in animal.json");
		}

	}

}
