/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 01957
 */
public class validatiocheck {

    public boolean circle(String value) {
        boolean result = false;
        String regex = "^[A-Z a-z 0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }
 public boolean UTIN_TIN(String value) {
        boolean result = false;
        String regex = "^[1-9][0-9]{11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }

    
    public boolean NID(String value) {
        boolean result = false;
        String regex = "^[1-9][0-9]{9}$";
        String regex1 = "^[1-9][0-9]{16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        
         Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(value);
        if (matcher.matches()||matcher1.matches()) {
            result = true;

        }
        return result;
    }
    
    public boolean YEAR(String value) {
        boolean result = false;
        String regex = "^[1-2][0-9][0-9][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }

    public boolean DOB(String value) {
        boolean result = false;
        String regex = "^[0-3][0-9][-][0-9][1-9][-][1-2][0-9][0-9][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }

    public boolean PHONE(String value) {
        boolean result = false;
        String regex = "^[0][2-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }
     public boolean VAT(String value) {
        boolean result = false;
        String regex = "^[1-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            result = true;

        }
        return result;
    }

    public long textfieldcheck(String input) {
        ArrayList<String> fill = new ArrayList();
        int length = input.length();

        String regex = "^[0-9]$";
        for (int i = 0; i < length; i++) {
            if ((input.substring(i, i + 1)).matches(regex)) {
                fill.add(input.substring(i, i + 1));

            }
        }
        String ok = "";
        for (int i = 0; i < fill.size(); i++) {
            ok = ok + fill.get(i);
        }

        return (Long.parseLong(ok));
    }

     public String textfieldcheckString(String input) {
       
        int length = input.length();
        String abc=" ";
       
       
        for (int i = length-1; i > 0; i--) {
            if (!(input.substring(i-1, i)).matches(" ")) {
            
            abc=input.substring(0, i);
             
            break;
            }
           
           
        }
       
        return (abc);
    }

      public String textfieldcheckdotcut(String input) {
       
        int length = input.length();
        String abc=" ";
      
         String regex = "^[ .]$";
         String bl="";
        for (int i = length-1; i > 0; i--) {
            if (!(input.substring(i-1, i)).matches(regex)) {
             System.out.print(i+"br"+length+input.substring(i-1, i));
            abc=input.substring(0, i);
            break;
            }
            else
            {
              System.out.print("h"+input.substring(i-1, i)+"k");
            }
            
        }
        JOptionPane.showMessageDialog(null, abc);
        return (abc);
    }

    //calculate tax
    public double korcount(double a) {

        double sum = 0;
        if (a >= 300000)//o%
        {
            if (a >= 400000)//5%
            {
                if (a >= 700000)//10%
                {
                    if (a >= 1100000)//15%
                    {
                        if (a >= 1600000)//20%
                        {
                            sum = 5000 + 30000 + 60000 + 100000 + (((a - 1600000) * 25) / 100);//25%
                        } else {
                            sum = 5000 + 30000 + 60000 + (((a - 1100000) * 20) / 100);
                        }

                    } else {
                        sum = 5000 + 30000 + (((a - 700000) * 15) / 100);
                    }
                } else {
                    sum = 5000 + (((a - 400000) * 10) / 100);
                }
            } else {
                sum = ((a - 300000) * 5) / 100;
            }
        } else {
            sum = 0;
        }
        return sum;
    }

    public double kormoukup(double korjoggoay, double biniog) {
        double tax = 0.0;
        double a = (korjoggoay * 25) / 100;
        double b;//select kor reot
        if (a > biniog) {
            b = biniog;
        } else {
            b = a;
        }
        if (korjoggoay > 1500000) {
            tax = (b * 10) / 100;
        } else {
            tax = (b * 15) / 100;
        }
        return tax;
    }
    public int notnulllenth(String[][] data)
    {
        int len=0;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<2;j++)
                {
                    if(!data[i][j].matches("null"))
                    {
                      len++;  
                    }
                }
           
        }
       return len; 
    }
     public int notnulllenth1(String[] data)
    {
        int len=0;
        
            for(int j=0;j<5;j++)
                {
                    if(!data[j].matches("null"))
                    {
                      len++;  
                    }
                }
           
        
       return len; 
    }
     public String stringlengthcheck(String text,int length)
     {
        
         int tt=text.length();
         int ll=length-tt;
         String textr=text;
         for(int i=0;i<ll-1;i++)
         {
            // System.out.println(i+" "+text.length() );
              
             if(i==(ll-2))
             {
                textr= textr+" .";
                 
             }
             else
             {
               textr= textr+" .";  
             }
            
          
         }
          
         return textr;  
     }
}
