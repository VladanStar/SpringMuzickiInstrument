package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Instrument instrument = (Instrument) context.getBean("instrument");
		System.out.println(instrument.toString());
		
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
