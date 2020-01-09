/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeontop5;


import java.time.DateTimeException;
import java.time.ZoneId;
import java.util.TimerTask;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author Tabascomang
 */
public class timer {

   
    public String[] grabtime() {
        
        String timevar = null;
        String errorlabel = null;
        Boolean isErrorTriggered = false;
        
       String timezonetext = Main.timezoneuserinput;
       
       ZoneId zone; 
        zone = ZoneId.of( "Europe/Stockholm" ); //Default setting
       
       
       
       if ("".equals(timezonetext) || timezonetext == null) {
           
       } else {
           
           try {
               zone = ZoneId.of( timezonetext );
           } catch (DateTimeException ex) {
              
               System.out.println(ex);
               System.out.println("------------------------------------------------");
               System.out.println("REEEEEEEE! ENTER THE RIGHT TIMEZONE NEXT TIME!!!");
               System.out.println("------------------------------------------------");
               zone = ZoneId.of( "Europe/Stockholm" ); //Reset timer to default timezone.
               Main.timezoneuserinput = "";
               isErrorTriggered = true;
               
               
           }
           
           
           
           
           
       }
       
  int hour = java.time.ZonedDateTime.now(zone).getHour();
  int minute = java.time.ZonedDateTime.now(zone).getMinute();
  int second = java.time.ZonedDateTime.now(zone).getSecond();
  String hourstring = "";
  String minutestring = "";
  String secondstring = "";
  String AM_HourString = Integer.toString(hour);
  
  if (hour == 0) {
     hourstring = "00";
  } else if (hour > 0 && hour < 10) {
      hourstring = "0" + Integer.toString(hour);
  } else {
     hourstring = Integer.toString(hour);  
  }
  
  if (minute == 0) {
      minutestring = "00";
  } else if (minute > 0 && minute < 10) {
      minutestring = "0" + Integer.toString(minute);
  } else {
     minutestring = Integer.toString(minute);  
  }
  
  if (second == 0) {
      secondstring = "00";
  } else if (second > 0 && second < 10) {
      secondstring = "0" + Integer.toString(second);
  } else {
     secondstring = Integer.toString(second);  
  }
  
       if (Main.SECONDS_ENABLED == false) {
        

       if (Main.PM_AND_AM_MODE_ENABLED == true) {
           
           
           switch(hour) {
            case 12:
            
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 13:
            hourstring = "1";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 14:
            hourstring = "2";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 15:
            hourstring = "3";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 16:
            hourstring = "4";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 17:
            hourstring = "5";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 18:
            hourstring = "6";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 19:
            hourstring = "7";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 20:
            hourstring = "8";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 21:
            hourstring = "9";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 22:
            hourstring = "10";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 23:
            hourstring = "11";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            case 0:
            hourstring = "12";
            timevar = "" + hourstring + ":" + minutestring + " - PM";
            break;
            default:
            timevar = "" + AM_HourString + ":" + minutestring + " - AM";
            }
           
       
       
       
       //Here AM/PM mode being true ends.
       } 
       
       
       
       
       
       
       else if (Main.PM_AND_AM_MODE_ENABLED == false) {
           timevar = "" + hourstring + ":" + minutestring + "";
           //timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + "";
       }
       }
       
       //SECONDS ENABLED BELOW
       
       if (Main.SECONDS_ENABLED == true) {
        

       if (Main.PM_AND_AM_MODE_ENABLED == true) {
           
           
           switch(hour) {
            case 12:
            
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 13:
            hourstring = "1";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 14:
            hourstring = "2";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 15:
            hourstring = "3";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 16:
            hourstring = "4";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 17:
            hourstring = "5";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 18:
            hourstring = "6";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 19:
            hourstring = "7";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 20:
            hourstring = "8";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 21:
            hourstring = "9";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 22:
            hourstring = "10";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 23:
            hourstring = "11";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            case 0:
            hourstring = "12";
            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
            break;
            default:
            timevar = "" + AM_HourString + ":" + minutestring + ":" + secondstring + " - AM";
            }
           
       
       
       
       //Here AM/PM mode being true ends.
       } 
       
       
       
       
       
       
       else if (Main.PM_AND_AM_MODE_ENABLED == false) {
           timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + "";
       }
       }
       
    
       
       
  
       if (isErrorTriggered == true) {
           String[] stringArray = new String[]{timevar,"ERROR: Wrong TimeZone, Try again!"};
           isErrorTriggered = false;
           return stringArray;
       } else {
           String[] stringArray = new String[]{timevar};
           return stringArray;
       }
        
    }
   
   
   
    
}

//            switch(hour) {
//            case 12:
//            
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 13:
//            hourstring = "1";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 14:
//            hourstring = "2";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 15:
//            hourstring = "3";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 16:
//            hourstring = "4";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 17:
//            hourstring = "5";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 18:
//            hourstring = "6";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 19:
//            hourstring = "7";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 20:
//            hourstring = "8";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 21:
//            hourstring = "9";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 22:
//            hourstring = "10";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 23:
//            hourstring = "11";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            case 0:
//            hourstring = "12";
//            timevar = "" + hourstring + ":" + minutestring + " - PM";
//            break;
//            default:
//            timevar = "" + AM_HourString + ":" + minutestring + " - AM";
//            }




//            switch(hour) {
//            case 12:
//            
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 13:
//            hourstring = "1";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 14:
//            hourstring = "2";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 15:
//            hourstring = "3";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 16:
//            hourstring = "4";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 17:
//            hourstring = "5";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 18:
//            hourstring = "6";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 19:
//            hourstring = "7";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 20:
//            hourstring = "8";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 21:
//            hourstring = "9";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 22:
//            hourstring = "10";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 23:
//            hourstring = "11";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            case 0:
//            hourstring = "12";
//            timevar = "" + hourstring + ":" + minutestring + ":" + secondstring + " - PM";
//            break;
//            default:
//            timevar = "" + AM_HourString + ":" + minutestring + ":" + secondstring + " - AM";
//            }