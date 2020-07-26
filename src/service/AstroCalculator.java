package service;


import java.text.ParseException;

import java.util.Calendar;

// Type your code
import model.User;
class  AstroCalculator 
{
	public String findSign(User user) throws ParseException 
	{
		int month = 0, day = 0;
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getDob();
        month = cal.get(Calendar.MONTH)+1;
        day = cal.get(Calendar.DATE);
		
        if (month == 1) {
            if (day < 20)
               return "Capricorn";
            else
            	return "Aquarius";
         }
         else if (month == 2) {
            if (day < 19)
            	return "Aquarius";
            else
            	return "Pisces";
         }
         else if(month == 3) {
            if (day < 21)
            	return "Pisces";
            else
            	return "Aries";
         }
         else if (month == 4) {
            if (day < 20)
            	return "Aries";
            else
            	return "Taurus";
         }
         else if (month == 5) {
            if (day < 21)
            	return "Taurus";
            else
            	return "Gemini";
         }
         else if( month == 6) {
            if (day < 21)
            	return "Gemini";
            else
            	return "Cancer";
         }
         else if (month == 7) {
            if (day < 23)
            	return "Cancer";
            else
            	return "Leo";
         }
         else if( month == 8) {
            if (day < 23)
            	return "Leo";
            else
            	return "Virgo";
         }
         else if (month == 9) {
            if (day < 23)
            	return "Virgo";
            else
            	return "Libra";
         }
         else if (month == 10) {
            if (day < 23)
            	return "Libra";
            else
            	return "Scorpio";
         }
         else if (month == 11) {
            if (day < 22)
            	return "scorpio";
            else
            	return "Sagittarius";
         }
         else if (month ==12) {
            if (day < 22)
            	return "Sagittarius";
            else
            	return "Capricorn";
         }
		return null;
		
	}
}