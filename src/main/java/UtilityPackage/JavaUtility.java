package UtilityPackage;

import java.util.Date;
import java.util.Random;
public class JavaUtility {
	
		public double getRandomNum()
		{
			Random r=new Random();
			double num = r.nextDouble();
			return num;
		}
		public String getSystemDate()
		{

			Date d=new Date();
			String[] da = d.toString().split(" ");
			String date=da[2];
			String month=da[1];
			String year=da[5];
			String time=da[3].replace(":", "-");
			String dateFormat=date+"_"+month+"_"+year+"_"+time;
			return dateFormat;
		}
		
		
		
	}


