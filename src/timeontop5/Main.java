/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeontop5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import static javax.management.timer.Timer.ONE_SECOND;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Tabascomang
 */
public class Main extends javax.swing.JFrame {

 

   public static String timezoneuserinput;
   public static String ErrorLabel;
   public static boolean PM_AND_AM_MODE_ENABLED = false;
   public static boolean SECONDS_ENABLED = true;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        StartTHEFUCKINGTHINGALREADYFUCK();
        lblstoprainbow.setVisible(false);
    }
    
    
JDialog dialog = new JDialog();
JLabel label = new JLabel("<html>Simple Always ontop Clock with shadow option. Red green or blue clocktext. <br>Credits to Raexilta (c) 2020. <br><br>In order to hide the buttons, simply hover the mouse over the clocktext and then move <br> the mouse away from the clocktext.<br><br> Version 1.0<br><br><br>TO-DO:<br><br>Sanitize TimeZone input (making even a single wrong<br>entry will crash the timer requiring a restart.)<br>For a list of timezones, see this website:<br><a>https://www.mkyong.com/java/java-display-list-of-timezone-with-gmt/</a></html>");
timer gitthetime = new timer();
int rainbowcolorstate = 0;

int timesREDpressed = 0;
int timesBLUEpressed = 0;
int timesGREENpressed = 0;
        //SHIT
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...

                //System.out.println("GAY");
                
                //This part does absolutely fucking nothing. Thanks for nothing. You fuck.
                
            }

       @Override
       public void actionPerformed(java.awt.event.ActionEvent e) {
           
           String[] THEFUCKINGTIMEISNEAR = gitthetime.grabtime();
           FUCKINGSETTHECLOCKTEXTREEEEEEEEEEEEEEEEEE(THEFUCKINGTIMEISNEAR[0]);
           if (THEFUCKINGTIMEISNEAR.length > 1) {
               ERRORMEUPSCOTT(THEFUCKINGTIMEISNEAR[1]);
           }
           
           
       }
        };
        
        public void ERRORMEUPSCOTT (String shit) {
            lblcurrenttimezone.setText(shit);
            lblcurrenttimezone.setForeground(Color.red);
            Font Nigga = lblcurrenttimezone.getFont();
            Nigga.deriveFont(Font.BOLD);
        }
        
        
        ActionListener rainbowcolormode = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...

                //System.out.println("GAY");
                
                //This part does absolutely fucking nothing. Thanks for nothing. You fuck.
                
            }

       @Override
       public void actionPerformed(java.awt.event.ActionEvent e) {
           
           
           colorchangemethod();
           
       }
        };
        
        private void StartTHEFUCKINGTHINGALREADYFUCK() {
            
            
            
        Timer timer = new Timer(1000, taskPerformer);
        timer.start();
        }
        
        
        
        public void FUCKINGSETTHECLOCKTEXTREEEEEEEEEEEEEEEEEE(String bitch) {
            this.lblClockText.setText(bitch);
            this.lblClockShadow.setText(bitch);
        }
        
       public void colorchangemethod() {
           
           switch(rainbowcolorstate) {
            case 1:
            lblClockText.setForeground(Color.red);
            this.rainbowcolorstate = 2;
            this.repaint();
            break;
            case 2:
            lblClockText.setForeground(Color.orange);
            this.rainbowcolorstate = 3;
            this.repaint();
            break;
            case 3:
            lblClockText.setForeground(Color.yellow);
            this.rainbowcolorstate = 4;
            this.repaint();
            break;
            case 4:
            lblClockText.setForeground(Color.green);
            this.rainbowcolorstate = 5;
            this.repaint();
            break;
            case 5:
            lblClockText.setForeground(Color.blue);
            this.rainbowcolorstate = 6;
            this.repaint();
            break;
            case 6:
            lblClockText.setForeground(Color.cyan);
            this.rainbowcolorstate = 7;
            this.repaint();
            break;
            case 7:
            lblClockText.setForeground(Color.pink);
            this.rainbowcolorstate = 1;
            this.repaint();
            break;
            default:
            lblClockText.setForeground(Color.red);
            this.rainbowcolorstate = 1;
            this.repaint();
            }
           
           
       }
        
       Timer timer22 = new Timer(50, rainbowcolormode);

        //OH MY GOD JOJO
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnSetClockTextRed = new javax.swing.JButton();
        btnSetClockTextGreen = new javax.swing.JButton();
        btnSetClockTextBlue = new javax.swing.JButton();
        btnToggleClockShadow = new javax.swing.JButton();
        btnExitProgram = new javax.swing.JButton();
        btnOpenAbout = new javax.swing.JButton();
        lblClockText = new javax.swing.JLabel();
        lblClockShadow = new javax.swing.JLabel();
        txtTimeZoneInput = new javax.swing.JTextField();
        btnChangeTimeZone = new javax.swing.JButton();
        lblcurrenttimezone = new javax.swing.JLabel();
        lblstoprainbow = new javax.swing.JButton();
        btnChangeTimeFormat = new javax.swing.JButton();
        btnToggleSeconds = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(202, 202, 202));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSetClockTextRed.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSetClockTextRed.setForeground(new java.awt.Color(255, 0, 0));
        btnSetClockTextRed.setText("RED");
        btnSetClockTextRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetClockTextRedMouseEntered(evt);
            }
        });
        btnSetClockTextRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetClockTextRedActionPerformed(evt);
            }
        });
        getContentPane().add(btnSetClockTextRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 147, -1));

        btnSetClockTextGreen.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSetClockTextGreen.setForeground(new java.awt.Color(51, 255, 51));
        btnSetClockTextGreen.setText("GREEN");
        btnSetClockTextGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetClockTextGreenMouseEntered(evt);
            }
        });
        btnSetClockTextGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetClockTextGreenActionPerformed(evt);
            }
        });
        getContentPane().add(btnSetClockTextGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        btnSetClockTextBlue.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSetClockTextBlue.setForeground(new java.awt.Color(51, 51, 255));
        btnSetClockTextBlue.setText("BLUE");
        btnSetClockTextBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetClockTextBlueMouseEntered(evt);
            }
        });
        btnSetClockTextBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetClockTextBlueActionPerformed(evt);
            }
        });
        getContentPane().add(btnSetClockTextBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 147, -1));

        btnToggleClockShadow.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnToggleClockShadow.setText("SHADOW OFF");
        btnToggleClockShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnToggleClockShadowMouseEntered(evt);
            }
        });
        btnToggleClockShadow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleClockShadowActionPerformed(evt);
            }
        });
        getContentPane().add(btnToggleClockShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnExitProgram.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnExitProgram.setText("EXIT");
        btnExitProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitProgramMouseEntered(evt);
            }
        });
        btnExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitProgramActionPerformed(evt);
            }
        });
        getContentPane().add(btnExitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 107, -1));

        btnOpenAbout.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnOpenAbout.setText("ABOUT");
        btnOpenAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpenAboutMouseEntered(evt);
            }
        });
        btnOpenAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenAboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpenAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 107, -1));

        lblClockText.setFont(new java.awt.Font("Valken", 1, 36)); // NOI18N
        lblClockText.setForeground(new java.awt.Color(102, 255, 102));
        lblClockText.setText("00:00:00");
        getContentPane().add(lblClockText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        lblClockShadow.setFont(new java.awt.Font("Valken", 0, 39)); // NOI18N
        lblClockShadow.setText("00:00:00");
        getContentPane().add(lblClockShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, -1));
        getContentPane().add(txtTimeZoneInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, -1));

        btnChangeTimeZone.setText("<html>Change <br>TimeZone");
        btnChangeTimeZone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangeTimeZoneMouseEntered(evt);
            }
        });
        btnChangeTimeZone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTimeZoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeTimeZone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        getContentPane().add(lblcurrenttimezone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 170, 20));

        lblstoprainbow.setText("<html>Stop<br>Rain<br>bow");
        lblstoprainbow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblstoprainbowActionPerformed(evt);
            }
        });
        getContentPane().add(lblstoprainbow, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 50, 90));

        btnChangeTimeFormat.setText("<html>Switch<br>to<br>AM/PM");
        btnChangeTimeFormat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangeTimeFormatMouseEntered(evt);
            }
        });
        btnChangeTimeFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTimeFormatActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeTimeFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 60, 60));

        btnToggleSeconds.setText("Disable Seconds");
        btnToggleSeconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleSecondsActionPerformed(evt);
            }
        });
        getContentPane().add(btnToggleSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetClockTextRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetClockTextRedActionPerformed
        // TODO add your handling code here:
        lblClockText.setForeground(Color.red);
        this.timesREDpressed += 1;
        
    }//GEN-LAST:event_btnSetClockTextRedActionPerformed

    private void btnOpenAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenAboutActionPerformed
        
        this.dialog.setLocationRelativeTo(this);
        this.dialog.setTitle("About");
        this.dialog.add(label);
        this.dialog.pack();
        this.dialog.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnOpenAboutActionPerformed

    private void btnSetClockTextBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetClockTextBlueActionPerformed
        // TODO add your handling code here:
        lblClockText.setForeground(Color.blue);
        this.timesBLUEpressed += 1;
    }//GEN-LAST:event_btnSetClockTextBlueActionPerformed

    private void btnExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitProgramActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitProgramActionPerformed
static int xx,yy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formFocusGained

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(false);
        this.btnSetClockTextBlue.setVisible(false);
        this.btnSetClockTextGreen.setVisible(false);
        this.btnSetClockTextRed.setVisible(false);
        this.btnToggleClockShadow.setVisible(false);
        this.btnExitProgram.setVisible(false);
        //new buttons
        this.btnChangeTimeFormat.setVisible(false);
        this.btnChangeTimeZone.setVisible(false);
        this.lblcurrenttimezone.setVisible(false);
        this.txtTimeZoneInput.setVisible(false);
        this.btnToggleSeconds.setVisible(false);
        
        this.repaint();
    }//GEN-LAST:event_formMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
          this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
        
    }//GEN-LAST:event_formMouseEntered

    private void btnSetClockTextRedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetClockTextRedMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnSetClockTextRedMouseEntered

    private void btnSetClockTextGreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetClockTextGreenMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnSetClockTextGreenMouseEntered

    private void btnSetClockTextBlueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetClockTextBlueMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnSetClockTextBlueMouseEntered

    private void btnOpenAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenAboutMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnOpenAboutMouseEntered

    private void btnToggleClockShadowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToggleClockShadowMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnToggleClockShadowMouseEntered

    private void btnExitProgramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitProgramMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnExitProgramMouseEntered

    private void btnSetClockTextGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetClockTextGreenActionPerformed
        // TODO add your handling code here:
        lblClockText.setForeground(Color.green);
        this.timesGREENpressed += 1;
    }//GEN-LAST:event_btnSetClockTextGreenActionPerformed

    private void btnToggleClockShadowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleClockShadowActionPerformed
        // TODO add your handling code here:
        if (lblClockShadow.isVisible() == true) {
            lblClockShadow.setVisible(false);
            btnToggleClockShadow.setText("SHADOW ON");
        } else {
            lblClockShadow.setVisible(true);
            btnToggleClockShadow.setText("SHADOW OFF");
        }
        
        //Easter egg, check if red green and blue buttons has been pressed seperately 3 times or more.
        if (this.timesBLUEpressed >= 3) {
            if (this.timesGREENpressed >= 3) {
                if (this.timesREDpressed >= 3) {
                    
                    
                    
                    if (timer22.isRunning()) { //if timer is already is running we do not want to start another one
                        System.out.print("I AM ALREADY RUNNING!");
                    } else {
                        timer22.start();
                        lblstoprainbow.setVisible(true);
                    }
                    
                }
            }
        }
    }//GEN-LAST:event_btnToggleClockShadowActionPerformed

    private void btnChangeTimeZoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTimeZoneActionPerformed
        // TODO add your handling code here:
        this.timezoneuserinput = txtTimeZoneInput.getText();
        this.lblcurrenttimezone.setText(txtTimeZoneInput.getText());
        Font Nigga = lblcurrenttimezone.getFont();
        Nigga.deriveFont(Font.PLAIN);
        this.lblcurrenttimezone.setForeground(Color.black);
        this.lblcurrenttimezone.repaint();
    }//GEN-LAST:event_btnChangeTimeZoneActionPerformed

    private void lblstoprainbowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblstoprainbowActionPerformed
this.timer22.stop();
this.timesBLUEpressed = 0;
this.timesREDpressed = 0;
this.timesGREENpressed = 0;
this.lblstoprainbow.setVisible(false);
    }//GEN-LAST:event_lblstoprainbowActionPerformed

    private void btnChangeTimeFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTimeFormatActionPerformed
        // TODO add your handling code here:
        if (this.PM_AND_AM_MODE_ENABLED == false) {
          this.PM_AND_AM_MODE_ENABLED = true;
          this.btnChangeTimeFormat.setText("<html>Switch<br>to<br>24-Hour");
            
        } else {
          this.PM_AND_AM_MODE_ENABLED = false;
          this.btnChangeTimeFormat.setText("<html>Switch<br>to<br>AM/PM");
        }
        
        
    }//GEN-LAST:event_btnChangeTimeFormatActionPerformed

    private void btnChangeTimeFormatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeTimeFormatMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnChangeTimeFormatMouseEntered

    private void btnChangeTimeZoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeTimeZoneMouseEntered
        // TODO add your handling code here:
        this.btnOpenAbout.setVisible(true);
        this.btnSetClockTextBlue.setVisible(true);
        this.btnSetClockTextGreen.setVisible(true);
        this.btnSetClockTextRed.setVisible(true);
        this.btnToggleClockShadow.setVisible(true);
        this.btnExitProgram.setVisible(true);
        //new buttons
        this.btnChangeTimeFormat.setVisible(true);
        this.btnChangeTimeZone.setVisible(true);
        this.lblcurrenttimezone.setVisible(true);
        this.txtTimeZoneInput.setVisible(true);
        this.btnToggleSeconds.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_btnChangeTimeZoneMouseEntered

    private void btnToggleSecondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleSecondsActionPerformed
        // TODO add your handling code here:
        if (this.SECONDS_ENABLED == false) {
            this.SECONDS_ENABLED = true;
            this.btnToggleSeconds.setText("Disable Seconds");
        } else {
            this.SECONDS_ENABLED = false;
            this.btnToggleSeconds.setText("Enable Seconds");
        }
        
        
        
        
    }//GEN-LAST:event_btnToggleSecondsActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeTimeFormat;
    private javax.swing.JButton btnChangeTimeZone;
    private javax.swing.JButton btnExitProgram;
    private javax.swing.JButton btnOpenAbout;
    private javax.swing.JButton btnSetClockTextBlue;
    private javax.swing.JButton btnSetClockTextGreen;
    private javax.swing.JButton btnSetClockTextRed;
    private javax.swing.JButton btnToggleClockShadow;
    private javax.swing.JButton btnToggleSeconds;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClockShadow;
    private javax.swing.JLabel lblClockText;
    private javax.swing.JLabel lblcurrenttimezone;
    private javax.swing.JButton lblstoprainbow;
    private javax.swing.JTextField txtTimeZoneInput;
    // End of variables declaration//GEN-END:variables
}
