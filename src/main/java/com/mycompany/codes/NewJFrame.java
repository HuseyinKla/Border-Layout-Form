/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labdenemee2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hüseyin
 */
public class NewJFrame extends javax.swing.JFrame implements ActionListener{

    public void yazdir(String kelime){
        JButton mybutton = new JButton();
        mybutton.setText(kelime);
        mybutton.addActionListener(this);
        setVisible(true);
        
        if(kelime.equals("KUZEY")){
            add(mybutton, BorderLayout.PAGE_START);
           
        }
        if(kelime.equals("DOGU")){
            add(mybutton, BorderLayout.LINE_END);
            
        }
        if(kelime.equals("GUNEY")){
            add(mybutton, BorderLayout.PAGE_END);
            
        }
        if(kelime.equals("BATI")){
            add(mybutton, BorderLayout.LINE_START);
            

        }
        if(kelime.equals("MERKEZ")){
            add(mybutton, BorderLayout.CENTER);
        }
        
        
        
    }
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        /*setLayout( new BorderLayout());
        try{
            FileReader fr = new FileReader("dosya.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine(); // Satır okur
            String[] parcalar = new String[5];
            parcalar = line.split(",");
            for(int i = 0 ; i<5 ; i++){
                System.out.println(parcalar[i]);
                yazdir(parcalar[i]);
            }
            //System.out.println(parcalar[0]);

        }catch(IOException e){
            
        }*/
        
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

      String[] str = new String[5];


      try{
        FileReader fr = new FileReader("dosya.txt");

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine(); // Satır okur
        
           
            
                String parcala[] =  line.split(",");          
                
              
                str[0]=parcala[0];
                str[1]=parcala[1];
                str[2]=parcala[2];
                str[3]=parcala[3];
                str[4]=parcala[4];
                
             
                        
        } catch (IOException e) {
           
        } 
         JFrame  f=new JFrame(); 
         //JPanel panel = new JPanel();

         JButton kuzey = new JButton(str[0]);
         JButton dogu = new JButton(str[1]);
         JButton guney = new JButton(str[2]);
         JButton bati = new JButton(str[3]);
         JButton merkez = new JButton(str[4]);
         
         
         f.setLayout( new BorderLayout() );

         f.add(kuzey,BorderLayout.PAGE_START);
         f.add(guney,BorderLayout.PAGE_END);
         f.add(bati,BorderLayout.LINE_START);
         f.add(dogu,BorderLayout.LINE_END);
         f.add(merkez,BorderLayout.CENTER);

        f.setSize(500,500);    
        f.setVisible(true); 
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().getClass()==JButton.class){
            JButton b = (JButton) e.getSource();
            System.out.println(b.getText());
            System.out.println("seasadasd");
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
