/*
 * SettingsPane.java
 *
 * Created on July 24, 2008, 4:25 PM
 */

package com.webreach.mirth.client.ui;

/**
 *
 * @author  jacobb
 */
public class SettingsPane extends javax.swing.JPanel {

    /** Creates new form SettingsPane */
    public SettingsPane() {
        initComponents();
    }
    
    public SettingsPanel getSettingsPanel() {
        return settingsPanel;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        settingsPanel = new com.webreach.mirth.client.ui.SettingsPanel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(settingsPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 330, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 293, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.webreach.mirth.client.ui.SettingsPanel settingsPanel;
    // End of variables declaration//GEN-END:variables

}
