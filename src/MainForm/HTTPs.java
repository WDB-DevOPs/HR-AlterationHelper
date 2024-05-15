/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainForm;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;


/**
 *
 * @author 211608
 */
public class HTTPs {
    
    public static String posterous(String url2,String paramss){
        URL url;
        HttpURLConnection connection = null;  
        try{
       //<editor-fold defaultstate="collapsed" desc=" setup ">
            url= new URL(url2);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", 
                                        "application/json");
            connection.setRequestProperty("custom-Header", "XYZ");

            connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(paramss.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");  

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            
            //Send request
            DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream ());
            wr.writeBytes (paramss);
            wr.flush ();
            wr.close ();
        // </editor-fold>
            //Get Response    
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer(); 
            while((line = rd.readLine()) != null) {
              response.append(line);
              response.append('\r');
            }
            rd.close();
            return response.toString();

        }catch(Exception e){
            e.printStackTrace();
            return null;
              
        }finally{
            if(connection != null){
                    connection.disconnect();
            }
        }
    
    }
    
    public static String Reset(String url2,String paramss){
     
        URL url;
        HttpURLConnection connection = null;  
        try{
       //<editor-fold defaultstate="collapsed" desc=" setup ">
            url= new URL(url2);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", 
                                        "application/json");
            connection.setRequestProperty("custom-Header", "XYZ");

            connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(paramss.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");  

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            
            //Send request
            DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream ());
            wr.writeBytes (paramss);
            wr.flush ();
            wr.close ();
        // </editor-fold>
            //Get Response    
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer(); 
            while((line = rd.readLine()) != null) {
              response.append(line);
              response.append('\r');
            }
            rd.close();
            return response.toString();

        }catch(Exception e){
            e.printStackTrace();
            return null;
              
        }finally{
            if(connection != null){
                    connection.disconnect();
            }
        }
     }
     
    public static String AttachmentDetails(String url2,String paramss){
        URL url;
        HttpURLConnection connection = null;  
        try{
       //<editor-fold defaultstate="collapsed" desc=" setup ">
            url= new URL(url2);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", 
                                        "application/json");
            connection.setRequestProperty("custom-Header", "XYZ");

            connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(paramss.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");  

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            
            //Send request
            DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream ());
            wr.writeBytes (paramss);
            wr.flush ();
            wr.close ();
        // </editor-fold>
            //Get Response    
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer(); 
            while((line = rd.readLine()) != null) {
              response.append(line);
              response.append('\r');
            }
            rd.close();
            return response.toString();

        }catch(Exception e){
            e.printStackTrace();
            return null;
              
        }finally{
            if(connection != null){
                    connection.disconnect();
            }
        }
    
    }
    
    public static String ReUplaod(String url2,String paramss){
        URL url;
        HttpURLConnection connection = null;  
        try{
       //<editor-fold defaultstate="collapsed" desc=" setup ">
            url= new URL(url2);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", 
                                        "application/json");
            connection.setRequestProperty("custom-Header", "XYZ");

            connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(paramss.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");  

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            
            //Send request
            DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream ());
            wr.writeBytes (paramss);
            wr.flush ();
            wr.close ();
        // </editor-fold>
            //Get Response    
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer(); 
            while((line = rd.readLine()) != null) {
              response.append(line);
              response.append('\r');
            }
            rd.close();
            return response.toString();

        }catch(Exception e){
            e.printStackTrace();
            return null;
              
        }finally{
            if(connection != null){
                    connection.disconnect();
            }
        }
    
    }
    
    public static String sendData(String url2,String paramss) throws FileNotFoundException, IOException{
        URL url;
        HttpURLConnection connection = null;  
        
        System.out.println(paramss);
        try{
       //<editor-fold defaultstate="collapsed" desc=" setup ">
            url= new URL(url2);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", 
                                        "application/json");
            connection.setRequestProperty("custom-Header", "XYZ");

            connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(paramss.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");  

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            
            //Send request
            DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream ());
            wr.writeBytes (paramss);
            wr.flush ();
            wr.close ();
        // </editor-fold>
            //Get Response    
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer(); 
            while((line = rd.readLine()) != null) {
              response.append(line);
              response.append('\r');
            }
            rd.close();
            return response.toString();

        }catch(Exception e){
            e.printStackTrace();
            return null;
              
        }finally{
            if(connection != null){
                    connection.disconnect();
            }
        }
    }
    
}
