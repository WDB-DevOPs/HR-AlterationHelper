/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForm;
import com.google.gson.Gson;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 211608
 */
public class Reset extends javax.swing.JFrame {

    /**
     * Creates new form Reset
     */
    public static String empid;
    public static String alterdate;
    public static String alterdate1;
  
    public Modeler mod= new Modeler("","","","");
    public static Properties properties = null;
    public static JSONObject jsonObject = null;

    
        public void updateFieldDate(){
            Thread Clock = new Thread(){
                public void run(){
                    for(;;)
                    {
                        try 
                        {
                            sleep(1000);
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd yyyy (h:mm:ss a)"); 
                            LocalDateTime now = LocalDateTime.now();  
                           lblDate.setText(dtf.format(now));
                        }
                        catch (Exception e)
                        {
                            System.out.println("Error");
                        }
                    }
                }
        };
            Clock.start();
        }
        
        public void Clearer(){
             DefaultTableModel model = (DefaultTableModel) this.DTdetails.getModel();
        DefaultTableModel model2 = (DefaultTableModel) this.DTAppr.getModel();
        DefaultTableModel model3 = (DefaultTableModel) this.DTAck.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        this.alter_date.setCalendar(null);
        this.alter_date1.setCalendar(null);
        this.TAemp.setText("");
        this.TAapr.setText("");
        this.TAacr.setText("");
        this.id_emp.setText("");
        
        JOptionPane.showMessageDialog(null,
                "Data Successfully Cleared.",
                "HR-Alteration Helper Says.",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    static {
        properties = new Properties();
    }
    
    public Reset() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_emp = new javax.swing.JTextField();
        alter_date = new com.toedter.calendar.JDateChooser();
        alter_date1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        DTAppr = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        DTdetails = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        DTAck = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TAacr = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAapr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TAemp = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Number:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Date Actual In:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Date Alter In:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReset.setHideActionText(true);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_emp)
                    .addComponent(alter_date, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(alter_date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(alter_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(alter_date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DTAppr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DTAppr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Approver", "Approved On"
            }
        ));
        DTAppr.getTableHeader().setResizingAllowed(false);
        DTAppr.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(DTAppr);

        DTdetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DTdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Date", "Status"
            }
        ));
        DTdetails.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        DTdetails.setShowGrid(false);
        DTdetails.getTableHeader().setResizingAllowed(false);
        DTdetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DTdetails);

        DTAck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DTAck.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acknowledger", "Acknowledged On"
            }
        ));
        DTAck.getTableHeader().setResizingAllowed(false);
        DTAck.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(DTAck);

        TAacr.setEditable(false);
        TAacr.setColumns(20);
        TAacr.setRows(5);
        jScrollPane4.setViewportView(TAacr);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Acknowledger Remarks:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Employee Alteration Reason:");

        TAapr.setEditable(false);
        TAapr.setColumns(20);
        TAapr.setRows(5);
        jScrollPane3.setViewportView(TAapr);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Approver Remarks:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("DETAILS:");

        TAemp.setEditable(false);
        TAemp.setColumns(20);
        TAemp.setRows(5);
        jScrollPane9.setViewportView(TAemp);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel8.setText("Welcome, Keithu-211608");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Today:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" Parser Keith">
//    public static void parseJson(JSONObject jsonObject) throws ParseException {
//
//    Set<Object> set = jsonObject.keySet();
//    Iterator<Object> iterator = set.iterator();
//    while (iterator.hasNext()) {
//        Object obj = iterator.next();
//        if (jsonObject.get(obj) instanceof JSONArray) {
//            System.out.println(obj.toString());
//            getArray(jsonObject.get(obj));
//        } else {
//            if (jsonObject.get(obj) instanceof JSONObject) {
//                parseJson((JSONObject) jsonObject.get(obj));
//            } else {
//                System.out.println(obj.toString() + "\t"
//                        + jsonObject.get(obj));
//            }
//        }
//    }
//}
//    
//public static void getArray(Object object2) throws ParseException {
//
//    JSONArray jsonArr = (JSONArray) object2;
//
//    for (int k = 0; k < jsonArr.size(); k++) {
//
//        if (jsonArr.get(k) instanceof JSONObject) {
//            parseJson((JSONObject) jsonArr.get(k));
//        } else {
//            System.out.println(jsonArr.get(k)+" hello");
//        }
//
//    }
//}
    //</editor-fold>
    

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
          Date dc2=this.alter_date.getDate();
          Date dc3=this.alter_date1.getDate();
       if(!"".equals(this.id_emp.getText()) && dc2!=null && dc3!=null){
       
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        JSONObject reqbod=new JSONObject();
        HTTPs conn= new HTTPs();
        Lister lis= new Lister();
        Gson g = new Gson();
        DefaultTableModel model = (DefaultTableModel) this.DTdetails.getModel();
        DefaultTableModel model2 = (DefaultTableModel) this.DTAppr.getModel();
        DefaultTableModel model3 = (DefaultTableModel) this.DTAck.getModel();
      
        List<String> lists = new ArrayList<String>();
        List<String> lists2 = new ArrayList<String>();
        List<String> lists3 = new ArrayList<String>();
         
        this.DTdetails.setEnabled(false);
        this.DTAppr.setEnabled(false);
        this.DTAck.setEnabled(false);
        
         empid= this.id_emp.getText();
         alterdate= df.format(this.alter_date.getDate());
         alterdate1= df.format(this.alter_date1.getDate());
        try {
            reqbod.put("emp_id", empid);
        } catch (JSONException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reqbod.put("date", alterdate);
        } catch (JSONException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reqbod.put("altdate", alterdate1);
        } catch (JSONException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String reqString= reqbod.toString();
        String APIUrl=  "http://10.86.0.84:6060/getAlterDetails";

        String response= conn.posterous(APIUrl,reqString); 
        String finality=response.replaceAll("\\[", "").replaceAll("\\]","");
        
        if (finality.isBlank()) {
             JOptionPane.showMessageDialog(null,
                "Alteration Date doesnt exist for this employee.",
                "HR-Alteration Helper Says.",
                JOptionPane.INFORMATION_MESSAGE);
        }else{
        
            JSONObject jsons;

            try {

                jsons = new JSONObject(finality);
               
                lists.add(jsons.getString("id_emp"));
                lists.add(jsons.getString("alteration_requestor"));
                lists.add(jsons.getString("date_alter"));
                lists.add(jsons.getString("status"));

                lists2.add(jsons.getString("approver"));
                lists2.add(jsons.getString("approver_action_at"));

                lists3.add(jsons.getString("acknowledger"));
                lists3.add(jsons.getString("hr_action_at"));

                
                 model.addRow(lists.toArray());
                   model2.addRow(lists2.toArray());
                   model3.addRow(lists3.toArray());
    //           JSONArray keys= jsons.names();
    //            //cant use this because jsonobject re-arranges the sequence by alphabetical order
    //            for (int i = 0; i < keys.length(); i++) {
    //                String keyer= keys.getString(i);
    //                 System.out.println(jsons.getString(keyer));
    //                 lists.add(jsons.getString(keyer));
    //            }
                mod= new Modeler(jsons.getString("id_emp"),jsons.getString("date_alter"),jsons.getString("status"),alterdate1);
                  
                    TableColumn column = null;
                    for (int i = 0; i < 4; i++) {
                        column = this.DTdetails.getColumnModel().getColumn(i);
                        if (i == 1) {
                            column.setPreferredWidth(200); //third column is bigger
                        } else {
                            column.setPreferredWidth(150);
                        }
                    }
                
//                    this.TAacr.setEditable(false);
//                    this.TAapr.setEditable(false);
//                    this.TAemp.setEditable(false);
                    this.TAacr.setLineWrap(true);
                    this.TAapr.setLineWrap(true);
                    this.TAemp.setLineWrap(true);
                    this.TAacr.setWrapStyleWord(true);
                    this.TAapr.setWrapStyleWord(true);
                    this.TAemp.setWrapStyleWord(true);
                    this.TAemp.append(jsons.getString("reason")+"\n");
                    this.TAapr.append(jsons.getString("approver_remarks"));
                    this.TAacr.append(jsons.getString("acknowledger_remarks"));
                    
                  

                
            }catch (JSONException | SecurityException | IllegalArgumentException ex) { //multi catch because im lazy af
                Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
       }else{
       JOptionPane.showMessageDialog(null,
                "Employee ID and date must not be empty.",
                "HR-Alteration Helper.",
                JOptionPane.INFORMATION_MESSAGE);
       }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        Clearer();
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Date dc=this.alter_date.getDate();
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        
       if (this.DTdetails.getModel().getRowCount() != 0 && !"".equals(this.id_emp.getText()) && !"".equals(this.TAacr.getText()) &&
           this.DTAck.getModel().getRowCount()!=0 && this.DTAppr.getModel().getRowCount() !=0 && !"".equals(this.TAapr.getText()) && 
           dc!=null && !"".equals(this.TAemp.getText())) {
           
            int result = JOptionPane.showConfirmDialog(null,"Sure? You want to reset?","HR-Alteration Helper Says.",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.INFORMATION_MESSAGE);
        
            switch (result) {
                case JOptionPane.YES_OPTION:                  
                    try {
                        
                        JSONObject reqbod=new JSONObject();
                        HTTPs conn= new HTTPs();
                        
                        
                        
                        String retValS = null;
                        try {
                            retValS =  mod.getData();
                        } catch (JSONException ex) {
                            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                        String reqString= retValS;
                        String APIUrl=  "http://10.86.0.84:6060/Reset";
                        
                        String response= conn.Reset(APIUrl,reqString);
                        String finality=response.replaceAll("\\[", "").replaceAll("\\]","");
                        
                        JSONObject  jsons= new JSONObject(finality);
                        int returvalue= jsons.getInt("retVal");
                        
                        if (returvalue!=1){
                            JOptionPane.showMessageDialog(null,
                                    jsons.getString("errmsg"),
                                    "HR-Alteration Helper Says.",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                     jsons.getString("errmsg")+ "\n Form will now be cleared",
                                    "HR-Alteration Helper Says.",
                                    JOptionPane.INFORMATION_MESSAGE);
                            Clearer();
                        }
                        
                    } catch (JSONException ex) {
                        Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case JOptionPane.NO_OPTION:
                    //  label.setText("You selected: No");
                    JOptionPane.showMessageDialog(null,
                            "You have cancelled the reset.",
                            "HR-Alteration Helper Says.",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    //label.setText("None selected"); //for x button
                    JOptionPane.showMessageDialog(null,
                        "Did not select Yes/No",
                        "HR-Alteration Helper Says.",
                        JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        
        } else {
            
           JOptionPane.showMessageDialog(null,
                "No data to reset. SEARCH data first.",
                "HR-Alteration Helper.",
                JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
      dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       updateFieldDate();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Reset().setVisible(true);   
                 
            }
 
        });
        
      
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DTAck;
    private javax.swing.JTable DTAppr;
    private javax.swing.JTable DTdetails;
    private javax.swing.JTextArea TAacr;
    private javax.swing.JTextArea TAapr;
    private javax.swing.JTextArea TAemp;
    private com.toedter.calendar.JDateChooser alter_date;
    private com.toedter.calendar.JDateChooser alter_date1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField id_emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDate;
    // End of variables declaration//GEN-END:variables
}
