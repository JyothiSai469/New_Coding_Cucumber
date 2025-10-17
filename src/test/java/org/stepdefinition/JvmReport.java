package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void report(String json) {
		//location
		File f = new File("C:\\Users\\Jyothi Sai\\OneDrive\\Desktop\\Selenium\\Project_For_LiveScection\\All_Reports\\JVM");
				
		//add configuration
		Configuration c = new Configuration(f, "FB Account Creation");
				
		//Classification
		c.addClassifications("Windows", "Windows 11");
		c.addClassifications("Work Down By", "Jyothi Sai");
		c.addClassifications("Sprint", "One Week");
		c.addClassifications("FramWork", "Cucumber");
				
		//List
		List<String> l = new ArrayList<String>();
		l.add(json);
				
		//Build Report
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}



}
