/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForm;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 211608
 */
public class Upload extends javax.swing.JFrame {

    /**
     * Creates new form Upload
     */
    //Global variable keith
     public attachClass atc= new attachClass();
     ImageIcon imgIco= new ImageIcon();
     Image imge;
     public String fname;
     
    public Upload() {
        initComponents();
        this.jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpload = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imageViewer = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        id_emp = new javax.swing.JTextField();
        actualDate = new com.toedter.calendar.JDateChooser();
        alterDate = new com.toedter.calendar.JDateChooser();
        lblAlteredDate = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblActualIn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnFinalUpload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUpload.setText("Attach");
        btnUpload.setEnabled(false);
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imageViewer.setToolTipText("Click me to display a zoomed image.");
        imageViewer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imageViewer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageViewerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageViewerMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(imageViewer, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(imageViewer, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAlteredDate.setText("Altered Date:");

        lblEmployeeID.setText("Employee ID:");

        lblActualIn.setText("Actual In:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblActualIn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actualDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAlteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(alterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(actualDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblActualIn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAlteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ));
        tbl1.setEnabled(false);
        tbl1.getTableHeader().setResizingAllowed(false);
        tbl1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl1);

        tbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actual Date", "Alter Date"
            }
        ));
        tbl2.setEnabled(false);
        jScrollPane2.setViewportView(tbl2);

        tbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status"
            }
        ));
        tbl3.setEnabled(false);
        jScrollPane3.setViewportView(tbl3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Previous Attachment to be Overwrited");
        jLabel1.setToolTipText("Click me to view previous attachment");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btnFinalUpload.setText("Upload");
        btnFinalUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpload)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnFinalUpload))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear)
                                    .addComponent(btnFinalUpload))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpload)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here: Attach button
            //set-up filechooser
            JFileChooser filechooser = new JFileChooser();
            filechooser.setDialogTitle("Choose Your File For Re-uploading");
            filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileFilter imageFilter = new FileNameExtensionFilter(
             "Image files", ImageIO.getReaderFileSuffixes());
            filechooser.addChoosableFileFilter(imageFilter);
            filechooser.setAcceptAllFileFilterUsed(false);
            
            String classVal= atc.attach;
            System.out.println(classVal);
            
            // below code selects the file 
            int returnval = filechooser.showOpenDialog(this);
            if (returnval == JFileChooser.APPROVE_OPTION)
            {
                File file = filechooser.getSelectedFile();
                long bytes= file.length();
                fname= file.getName();
               
                if((bytes/1024)>4000){
                    JOptionPane.showMessageDialog(null,
                "Image is "+(bytes/1024)+"kb and is too large, try file size below 4000kb.",
                "HR-Alteration Helper Says",
                JOptionPane.ERROR_MESSAGE);                 
                }else{
                    BufferedImage bi;
                    try {
                        imge=null;
                        // display the image in a Jlabel
                        bi = ImageIO.read(file);
                        Image dimg= bi.getScaledInstance(imageViewer.getWidth(), imageViewer.getHeight(),Image.SCALE_SMOOTH);
                        imge=dimg;
                        ImageIcon imageIcon = new ImageIcon(dimg);
                        imgIco=imageIcon;
                        imageViewer.setIcon(imageIcon);
                        this.jLabel1.setVisible(true);
                    } catch(IOException e) {
                        e.printStackTrace(); // todo: implement proper error handeling
                    }
                    this.pack();
                }
                
            }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            // TODO add your handling code here:
            HTTPs connie= new HTTPs();
             
            SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
            JSONObject reqbod=new JSONObject();
            
            String eID=this.id_emp.getText();
            String actualD= df.format(this.actualDate.getDate());
            String alteredD= df.format(this.alterDate.getDate());
            
            reqbod.put("emp", eID);
            reqbod.put("actual_date",actualD);
            reqbod.put("altered_date",alteredD);
            
            String reqbodString= reqbod.toString();
            String APIUrl=  "http://10.86.0.84:6060/getAttachmentDetails";
            
            String response=connie.AttachmentDetails(APIUrl,reqbodString); 
            String finality=response.replaceAll("\\[", "").replaceAll("\\]","");
            JSONObject jsons;
            jsons = new JSONObject(finality);
            System.out.println(jsons);
            
            //populating atc class
            int returnVal=jsons.getInt("retVal");

            atc.attach=jsons.getString("attach");
            atc.id200=jsons.getString("id200");
            atc.objid=jsons.getString("objid");
            atc.lName=jsons.getString("empLastname");


            String bx64=jsons.getString("bx64");
            if(returnVal==1){
               
                //decode bx64 here and display on my imageviewer, decode bx64 without saving it
                if(bx64!=""){
                    byte[] imageBytes= Base64.getDecoder().decode(bx64);
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image image = imageIcon.getImage();
                    
                        // Maintain aspect ratio and fit the image within the label
                       int labelWidth = this.imageViewer.getWidth();
                       int labelHeight = this.imageViewer.getHeight();
                        Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                        this.imageViewer.setIcon(new ImageIcon(scaledImage));
                       
                }
                imgIco=(ImageIcon) imageViewer.getIcon();
                
                List<String> lists = new ArrayList<String>();
                List<String> lists2 = new ArrayList<String>();
                List<String> lists3 = new ArrayList<String>();
                DefaultTableModel model = (DefaultTableModel) this.tbl1.getModel();
                DefaultTableModel model2 = (DefaultTableModel) this.tbl2.getModel();
                DefaultTableModel model3 = (DefaultTableModel) this.tbl3.getModel();
                lists.add(jsons.getString("idemp"));
                lists.add(jsons.getString("empname"));
                lists2.add(jsons.getString("act_date"));
                lists2.add(jsons.getString("alt_date"));
                lists3.add(jsons.getString("stat"));
                
               
                 model.addRow(lists.toArray());
                 model2.addRow(lists2.toArray());
                 model3.addRow(lists3.toArray());
                 
                this.btnUpload.setEnabled(true);
               
            }else{
                JOptionPane.showMessageDialog(null,
                jsons.getString("errmsg"),
                "HR-Alteration Helper Says",
                JOptionPane.INFORMATION_MESSAGE );  
                System.out.println(jsons.getInt("retVal")+" yawa");
            }
           
        } catch (JSONException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    private void updateImage(JLabel label, Image originalImage, double scaleFactor) {
            Image scaledImage = scaleImage(originalImage, scaleFactor);
            label.setIcon(new ImageIcon(scaledImage));
        }
    private Image scaleImage(Image originalImage, double scaleFactor) {
        int scaledWidth = (int) (originalImage.getWidth(null) * scaleFactor);
        int scaledHeight = (int) (originalImage.getHeight(null) * scaleFactor);
        return originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
    }
    private void showFullscreenImage(ImageIcon imageIcon) {
       // Retrieve the current image from the JLabel
       // ImageIcon imageIcon = (ImageIcon) imageViewer.getIcon();
        
        if (imageIcon != null) {
            Image originalImage = imageIcon.getImage();

            // Create a mutable container for scaleFactor
            double[] scaleFactor = {0.9};  // Adjusted to 10% reduction

            // Scale the image by 10% initially
            Image scaledImage = scaleImage(originalImage, scaleFactor[0]);

            // Create a new JFrame for fullscreen display
            JFrame fullscreenFrame = new JFrame();
            fullscreenFrame.setTitle("Fullscreen Image Viewer");

            // Create a JLabel to display the scaled image
            JLabel fullscreenLabel = new JLabel(new ImageIcon(scaledImage));

            // Create zoom-in and zoom-out buttons
            JButton zoomInButton = new JButton("Zoom In");
            JButton zoomOutButton = new JButton("Zoom Out");

            zoomInButton.addActionListener(e -> {
                scaleFactor[0] *= 1.2;  // Increase the scale factor
                updateImage(fullscreenLabel, originalImage, scaleFactor[0]);
            });

            zoomOutButton.addActionListener(e -> {
                scaleFactor[0] /= 1.2;  // Decrease the scale factor
                updateImage(fullscreenLabel, originalImage, scaleFactor[0]);
            });

            // Create a close button
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(e -> fullscreenFrame.dispose());

            // Set layout for the frame
            fullscreenFrame.setLayout(new BorderLayout());
            fullscreenFrame.add(zoomInButton, BorderLayout.NORTH);
            fullscreenFrame.add(fullscreenLabel, BorderLayout.CENTER);
            fullscreenFrame.add(zoomOutButton, BorderLayout.SOUTH);
            fullscreenFrame.add(closeButton, BorderLayout.EAST);

            // Make the frame fullscreen
            fullscreenFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            fullscreenFrame.setUndecorated(true);

            // Set the JFrame visible
            fullscreenFrame.setVisible(true);
        }  
    }
    
    private void imageViewerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageViewerMouseClicked
        // TODO add your handling code here:
         // Handle label click event
        if (evt.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(evt)) {
            // If left mouse button is clicked once, show fullscreen image
            ImageIcon imageIcon = (ImageIcon) imageViewer.getIcon();
            showFullscreenImage(imageIcon);
        }
    }//GEN-LAST:event_imageViewerMouseClicked

    private void imageViewerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageViewerMouseEntered
        // TODO add your handling code here:
         
    }//GEN-LAST:event_imageViewerMouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
       showFullscreenImage(imgIco);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clearer();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFinalUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalUploadActionPerformed
        // TODO add your handling code here:
        RemarksFrame rf= new RemarksFrame(atc.attach,atc.objid,atc.id200,atc.lName,imgIco,fname);
        rf.setVisible(true);
        
    }//GEN-LAST:event_btnFinalUploadActionPerformed
    
    private void Clearer(){
        this.actualDate.setDate(null);
        this.alterDate.setDate(null);
        this.imageViewer.setIcon(null);
        this.id_emp.setText("");
        ImageIcon emptyIcon = new ImageIcon();
        imgIco=emptyIcon;
        
        DefaultTableModel model = (DefaultTableModel) this.tbl1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) this.tbl2.getModel();
        DefaultTableModel model3 = (DefaultTableModel) this.tbl3.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        
        this.btnUpload.setEnabled(false);
        this.jLabel1.setVisible(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(Upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upload().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser actualDate;
    private com.toedter.calendar.JDateChooser alterDate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFinalUpload;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpload;
    private javax.swing.JTextField id_emp;
    private javax.swing.JLabel imageViewer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblActualIn;
    private javax.swing.JLabel lblAlteredDate;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    // End of variables declaration//GEN-END:variables
}
