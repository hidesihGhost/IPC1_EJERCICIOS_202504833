package javaapplication3;

public class Grados extends javax.swing.JFrame {
 
    public Grados() {
        initComponents();
        btnCelsiusFah.setContentAreaFilled(true); //Mantener el color del boton
        btnCelsiusFah.setFocusPainted(false); //Quitar el cuadro punteado que se forma antes de dar click
        
        btnCelsiusKelv.setContentAreaFilled(true); //Mantener el color del boton
        btnCelsiusKelv.setFocusPainted(false); //Quitar el cuadro punteado que se forma antes de dar click
        
        btnSalir.setContentAreaFilled(true); //Mantener el color del boton
        btnSalir.setFocusPainted(false); //Quitar el cuadro punteado que se forma antes de dar click
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCelsiusFah = new javax.swing.JButton();
        btnCelsiusKelv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMostrarRes = new javax.swing.JLabel();
        txtGradosCel = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("BIENVENIDO AL PROGARMA DE CONVERSIÓN DE GRADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 370, 30));

        btnCelsiusFah.setBackground(new java.awt.Color(51, 0, 51));
        btnCelsiusFah.setForeground(new java.awt.Color(204, 204, 255));
        btnCelsiusFah.setText("De Celsius a Fahrenheit");
        btnCelsiusFah.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCelsiusFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusFahActionPerformed(evt);
            }
        });
        jPanel1.add(btnCelsiusFah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 200, 40));

        btnCelsiusKelv.setBackground(new java.awt.Color(149, 71, 200));
        btnCelsiusKelv.setForeground(new java.awt.Color(51, 0, 51));
        btnCelsiusKelv.setText("De Celsius a Kelvin");
        btnCelsiusKelv.setBorder(null);
        btnCelsiusKelv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusKelvActionPerformed(evt);
            }
        });
        jPanel1.add(btnCelsiusKelv, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 200, 40));

        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Ingrese los grados en Celsius");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, 40));

        lblMostrarRes.setForeground(new java.awt.Color(0, 0, 51));
        lblMostrarRes.setText("El resultado es de:");
        jPanel1.add(lblMostrarRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 230, 30));

        txtGradosCel.setBackground(new java.awt.Color(204, 204, 255));
        txtGradosCel.setForeground(new java.awt.Color(51, 0, 51));
        txtGradosCel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtGradosCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradosCelActionPerformed(evt);
            }
        });
        jPanel1.add(txtGradosCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 110, 30));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 363, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelsiusFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusFahActionPerformed
      try {
       
        String texto = txtGradosCel.getText(); //Obtener el texto
        
        double celsius = Double.parseDouble(texto);//valdiar que sea un numero
        
        if (celsius < -273.15 || celsius > 1000) {//Validar los limites
            javax.swing.JOptionPane.showMessageDialog(this, "Grados fuera de rango (-273.15 a 1000)");
            return;
        }
        
        double resultado = (celsius * 1.8) + 32;//calcular resulado
        lblMostrarRes.setText(String.format("El resultado es de: "+"%.2f °F", resultado));//El %.2f redonde a 2 decimales y que sea float (funciona para double y float)
        
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingresa un número válido.");//Si no es un numero muestra el error
    }      
    }//GEN-LAST:event_btnCelsiusFahActionPerformed

    private void txtGradosCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradosCelActionPerformed
        
    }//GEN-LAST:event_txtGradosCelActionPerformed

    private void btnCelsiusKelvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusKelvActionPerformed
        try {
        String texto = txtGradosCel.getText();
        double celsius = Double.parseDouble(texto);//Verificar que se un numero
        
        if (celsius < -273.15 || celsius > 1000) {//Grados dentro del interavalo
            javax.swing.JOptionPane.showMessageDialog(this, "Grados fuera de rango.");
            return;
        }
        
        double resultado = celsius + 273.15;//Calcular grados
        lblMostrarRes.setText(String.format("El resultado es de: "+"%.2f K", resultado));//El %.2f redonde a 2 decimales y que sea float (funciona para double y float)
        
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingresa un número válido.");//No es nu numero
    }
    }//GEN-LAST:event_btnCelsiusKelvActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "¿Quieres salir del sistema?", 
            "Confirmar salida", 
            javax.swing.JOptionPane.YES_NO_OPTION, 
            javax.swing.JOptionPane.QUESTION_MESSAGE
    );

    //Si dice que si
    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);//Cierra el programa
    }
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelsiusFah;
    private javax.swing.JButton btnCelsiusKelv;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMostrarRes;
    private javax.swing.JTextField txtGradosCel;
    // End of variables declaration//GEN-END:variables
}
