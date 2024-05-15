/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainForm;

import static MainForm.Reset.alterdate;
import static MainForm.Reset.empid;
import com.google.gson.Gson;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 211608
 */
public class Modeler {
    
    
    
    private String idemp;
    private String datealter;
    private String alterstat;
    private String alterin;
    
    
    Modeler(String id,String adate,String aStat,String altin){
        idemp= id;
        datealter=adate;
        alterstat=aStat;
        alterin=altin;
        
    }
    
    public String getData() throws JSONException{
        JSONObject reqbod=new JSONObject();
                         
        reqbod.put("emp_id",  this.idemp);  
        reqbod.put("date", this.datealter);
        reqbod.put("status", this.alterstat);
        reqbod.put("alterin", this.alterin);
        return  reqbod.toString();
    }
}
