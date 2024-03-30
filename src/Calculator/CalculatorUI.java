package Calculator;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CalculatorUI extends javax.swing.JFrame {

    private String strResult = "";

    public CalculatorUI() {
        initComponents();
        customizeJPanel(bclear);
        customizeJPanel(bminus);
        customizeJPanel(bplus);
        customizeJPanel(bdivide);
        customizeJPanel(btimes);
        customizeJPanel(bpercent);
        customizeJPanel(bdel);
        customizeJPanel(bequals);
        numbers(bdot);
        numbers(b0);
        numbers(b1);
        numbers(b2);
        numbers(b3);
        numbers(b4);
        numbers(b5);
        numbers(b6);
        numbers(b7);
        numbers(b8);
        numbers(b9);
    }

    public void setTxtResult(String str) {
        inputted.setText(str);
    }

    private void customizeJPanel(JPanel panel) {
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border border = BorderFactory.createLineBorder(new Color(239, 239, 239), 30, true);
                panel.setBorder(border);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Border border = BorderFactory.createLineBorder(new Color(253, 238, 195), 30, true);
                panel.setBorder(border);
            }
        });
    }

    private void numbers(JPanel panel) {
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border border = BorderFactory.createLineBorder(new Color(253, 238, 195), 30, true);
                panel.setBorder(border);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Border border = BorderFactory.createLineBorder(new Color(239, 239, 239), 30, true);
                panel.setBorder(border);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bpercent = new javax.swing.JPanel();
        nmodulo = new javax.swing.JLabel();
        bdivide = new javax.swing.JPanel();
        ndiv = new javax.swing.JLabel();
        btimes = new javax.swing.JPanel();
        ntimes = new javax.swing.JLabel();
        bplus = new javax.swing.JPanel();
        nplus = new javax.swing.JLabel();
        bminus = new javax.swing.JPanel();
        nminus = new javax.swing.JLabel();
        bequals = new javax.swing.JPanel();
        nequals = new javax.swing.JLabel();
        b7 = new javax.swing.JPanel();
        n7 = new javax.swing.JLabel();
        bdel = new javax.swing.JPanel();
        ndel = new javax.swing.JLabel();
        bclear = new javax.swing.JPanel();
        nclear = new javax.swing.JLabel();
        bdot = new javax.swing.JPanel();
        ndot = new javax.swing.JLabel();
        b0 = new javax.swing.JPanel();
        n0 = new javax.swing.JLabel();
        b4 = new javax.swing.JPanel();
        n4 = new javax.swing.JLabel();
        b6 = new javax.swing.JPanel();
        n6 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        n3 = new javax.swing.JLabel();
        b8 = new javax.swing.JPanel();
        n8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        n2 = new javax.swing.JLabel();
        b9 = new javax.swing.JPanel();
        n9 = new javax.swing.JLabel();
        b5 = new javax.swing.JPanel();
        n5 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        inputted = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bpercent.setBackground(new java.awt.Color(255, 255, 255));
        bpercent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bpercent.setForeground(new java.awt.Color(102, 204, 0));
        bpercent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nmodulo.setBackground(new java.awt.Color(153, 153, 153));
        nmodulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nmodulo.setForeground(new java.awt.Color(195, 161, 80));
        nmodulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nmodulo.setText("%");
        nmodulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmoduloMouseClicked(evt);
            }
        });
        bpercent.add(nmodulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bpercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, 60));

        bdivide.setBackground(new java.awt.Color(255, 255, 255));
        bdivide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bdivide.setForeground(new java.awt.Color(102, 204, 0));
        bdivide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ndiv.setBackground(new java.awt.Color(153, 153, 153));
        ndiv.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ndiv.setForeground(new java.awt.Color(195, 161, 80));
        ndiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ndiv.setText("÷");
        ndiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ndivMouseClicked(evt);
            }
        });
        bdivide.add(ndiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jPanel1.add(bdivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 60, 60));

        btimes.setBackground(new java.awt.Color(255, 255, 255));
        btimes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        btimes.setForeground(new java.awt.Color(102, 204, 0));
        btimes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ntimes.setBackground(new java.awt.Color(153, 153, 153));
        ntimes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ntimes.setForeground(new java.awt.Color(195, 161, 80));
        ntimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ntimes.setText("X");
        ntimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ntimesMouseClicked(evt);
            }
        });
        btimes.add(ntimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(btimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, 60));

        bplus.setBackground(new java.awt.Color(255, 255, 255));
        bplus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bplus.setForeground(new java.awt.Color(102, 204, 0));
        bplus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nplus.setBackground(new java.awt.Color(153, 153, 153));
        nplus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nplus.setForeground(new java.awt.Color(195, 161, 80));
        nplus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nplus.setText("+");
        nplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nplusMouseClicked(evt);
            }
        });
        bplus.add(nplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 60, 60));

        bminus.setBackground(new java.awt.Color(255, 255, 255));
        bminus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bminus.setForeground(new java.awt.Color(102, 204, 0));
        bminus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nminus.setBackground(new java.awt.Color(153, 153, 153));
        nminus.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nminus.setForeground(new java.awt.Color(195, 161, 80));
        nminus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nminus.setText("-");
        nminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nminusMouseClicked(evt);
            }
        });
        bminus.add(nminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel1.add(bminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 60, 60));

        bequals.setBackground(new java.awt.Color(255, 255, 255));
        bequals.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 193, 60), 30, true));
        bequals.setForeground(new java.awt.Color(102, 204, 0));
        bequals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nequals.setBackground(new java.awt.Color(153, 153, 153));
        nequals.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nequals.setForeground(new java.awt.Color(191, 169, 128));
        nequals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nequals.setText("=");
        nequals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nequalsMouseClicked(evt);
            }
        });
        bequals.add(nequals, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bequals, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 60, 60));

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b7.setForeground(new java.awt.Color(102, 204, 0));
        b7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n7.setBackground(new java.awt.Color(153, 153, 153));
        n7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n7.setForeground(new java.awt.Color(51, 51, 51));
        n7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n7.setText("7");
        n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n7MouseClicked(evt);
            }
        });
        b7.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 60));

        bdel.setBackground(new java.awt.Color(255, 255, 255));
        bdel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bdel.setForeground(new java.awt.Color(102, 204, 0));
        bdel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ndel.setBackground(new java.awt.Color(153, 153, 153));
        ndel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ndel.setForeground(new java.awt.Color(195, 161, 80));
        ndel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ndel.setText("Del");
        ndel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ndelMouseClicked(evt);
            }
        });
        bdel.add(ndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 60));

        bclear.setBackground(new java.awt.Color(255, 255, 255));
        bclear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 238, 195), 30, true));
        bclear.setForeground(new java.awt.Color(102, 204, 0));
        bclear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nclear.setBackground(new java.awt.Color(153, 153, 153));
        nclear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nclear.setForeground(new java.awt.Color(195, 161, 80));
        nclear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nclear.setText("C");
        nclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nclearMouseClicked(evt);
            }
        });
        bclear.add(nclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 60));

        bdot.setBackground(new java.awt.Color(255, 255, 255));
        bdot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        bdot.setForeground(new java.awt.Color(102, 204, 0));
        bdot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ndot.setBackground(new java.awt.Color(153, 153, 153));
        ndot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ndot.setForeground(new java.awt.Color(51, 51, 51));
        ndot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ndot.setText(".");
        ndot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ndotMouseClicked(evt);
            }
        });
        bdot.add(ndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(bdot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 60, 60));

        b0.setBackground(new java.awt.Color(255, 255, 255));
        b0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b0.setForeground(new java.awt.Color(102, 204, 0));
        b0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n0.setBackground(new java.awt.Color(153, 153, 153));
        n0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n0.setForeground(new java.awt.Color(51, 51, 51));
        n0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n0.setText("0");
        n0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n0MouseClicked(evt);
            }
        });
        b0.add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 40));

        jPanel1.add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 130, 60));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b4.setForeground(new java.awt.Color(102, 204, 0));
        b4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n4.setBackground(new java.awt.Color(153, 153, 153));
        n4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n4.setForeground(new java.awt.Color(51, 51, 51));
        n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n4.setText("4");
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n4MouseClicked(evt);
            }
        });
        b4.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 60, 60));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b6.setForeground(new java.awt.Color(102, 204, 0));
        b6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n6.setBackground(new java.awt.Color(153, 153, 153));
        n6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n6.setForeground(new java.awt.Color(51, 51, 51));
        n6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n6.setText("6");
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n6MouseClicked(evt);
            }
        });
        b6.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 60, 60));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b1.setForeground(new java.awt.Color(102, 204, 0));
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setBackground(new java.awt.Color(153, 153, 153));
        n1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n1.setForeground(new java.awt.Color(51, 51, 51));
        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n1.setText("1");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });
        b1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 60));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b3.setForeground(new java.awt.Color(102, 204, 0));
        b3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n3.setBackground(new java.awt.Color(153, 153, 153));
        n3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n3.setForeground(new java.awt.Color(51, 51, 51));
        n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n3.setText("3");
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n3MouseClicked(evt);
            }
        });
        b3.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 60, 60));

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b8.setForeground(new java.awt.Color(102, 204, 0));
        b8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n8.setBackground(new java.awt.Color(153, 153, 153));
        n8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n8.setForeground(new java.awt.Color(51, 51, 51));
        n8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n8.setText("8");
        n8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n8MouseClicked(evt);
            }
        });
        b8.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("8");
        b8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, 60));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b2.setForeground(new java.awt.Color(102, 204, 0));
        b2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n2.setBackground(new java.awt.Color(153, 153, 153));
        n2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n2.setForeground(new java.awt.Color(51, 51, 51));
        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n2.setText("2");
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n2MouseClicked(evt);
            }
        });
        b2.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 60, 60));

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b9.setForeground(new java.awt.Color(102, 204, 0));
        b9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n9.setBackground(new java.awt.Color(153, 153, 153));
        n9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n9.setForeground(new java.awt.Color(51, 51, 51));
        n9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n9.setText("9");
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
        });
        b9.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, 60));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 239, 239), 30, true));
        b5.setForeground(new java.awt.Color(102, 204, 0));
        b5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n5.setBackground(new java.awt.Color(153, 153, 153));
        n5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        n5.setForeground(new java.awt.Color(51, 51, 51));
        n5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n5.setText("5");
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
        });
        b5.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 60, 60));

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(255, 255, 255));
        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        txtResult.setForeground(new java.awt.Color(51, 51, 51));
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.setBorder(null);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 250, 60));

        inputted.setEditable(false);
        inputted.setBackground(new java.awt.Color(255, 255, 255));
        inputted.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputted.setForeground(new java.awt.Color(51, 51, 51));
        inputted.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputted.setBorder(null);
        jPanel1.add(inputted, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        strResult = strResult + n1.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n1MouseClicked

    private void nequalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nequalsMouseClicked
        Calculator clc = new Calculator();
        System.out.println(strResult);
        double result = clc.evaluate(strResult);
        txtResult.setText(Double.toString(result));
        //txtResult.setText("i miss you babs");
        strResult = "";
    }//GEN-LAST:event_nequalsMouseClicked

    private void n2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseClicked
        strResult = strResult + n2.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n2MouseClicked

    private void n4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseClicked
        strResult = strResult + n4.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n4MouseClicked

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
        strResult = strResult + n5.getText();
        setTxtResult(strResult);    }//GEN-LAST:event_n5MouseClicked

    private void n6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseClicked
        strResult = strResult + n6.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n6MouseClicked

    private void n7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MouseClicked
        strResult = strResult + n7.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n7MouseClicked

    private void n8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MouseClicked
        strResult = strResult + n8.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n8MouseClicked

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked
        strResult = strResult + n9.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_n9MouseClicked

    private void ndotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ndotMouseClicked
        strResult = strResult + ndot.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_ndotMouseClicked

    private void n0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n0MouseClicked
        strResult = strResult + n0.getText();
        setTxtResult(strResult);    }//GEN-LAST:event_n0MouseClicked

    private void nminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nminusMouseClicked
        strResult = strResult + nminus.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_nminusMouseClicked

    private void nplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nplusMouseClicked
        strResult = strResult + nplus.getText();
        setTxtResult(strResult);    }//GEN-LAST:event_nplusMouseClicked

    private void ntimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntimesMouseClicked
        strResult = strResult + ntimes.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_ntimesMouseClicked

    private void ndivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ndivMouseClicked
        strResult = strResult + ndiv.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_ndivMouseClicked

    private void nmoduloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmoduloMouseClicked
        strResult = strResult + nmodulo.getText();
        setTxtResult(strResult);
    }//GEN-LAST:event_nmoduloMouseClicked

    private void ndelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ndelMouseClicked
        strResult = inputted.getText();
        int l = strResult.length();
        if (l > 0) {
            strResult = strResult.substring(0, l - 1);
            setTxtResult(strResult);
        }
    }//GEN-LAST:event_ndelMouseClicked

    private void nclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nclearMouseClicked
        strResult = "";
        txtResult.setText("");
        setTxtResult(strResult);
    }//GEN-LAST:event_nclearMouseClicked

    private void n3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseClicked
        strResult = strResult + n3.getText();
        setTxtResult(strResult);    }//GEN-LAST:event_n3MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b0;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JPanel b6;
    private javax.swing.JPanel b7;
    private javax.swing.JPanel b8;
    private javax.swing.JPanel b9;
    private javax.swing.JPanel bclear;
    private javax.swing.JPanel bdel;
    private javax.swing.JPanel bdivide;
    private javax.swing.JPanel bdot;
    private javax.swing.JPanel bequals;
    private javax.swing.JPanel bminus;
    private javax.swing.JPanel bpercent;
    private javax.swing.JPanel bplus;
    private javax.swing.JPanel btimes;
    private javax.swing.JTextField inputted;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel n0;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel nclear;
    private javax.swing.JLabel ndel;
    private javax.swing.JLabel ndiv;
    private javax.swing.JLabel ndot;
    private javax.swing.JLabel nequals;
    private javax.swing.JLabel nminus;
    private javax.swing.JLabel nmodulo;
    private javax.swing.JLabel nplus;
    private javax.swing.JLabel ntimes;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
