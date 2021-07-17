package OfficerPackage;


import java.awt.BorderLayout;

public class CaseChief extends javax.swing.JPanel {

    AddCase Acase;
    BorderLayout b;
    AddCriminal criminal;
    
    public CaseChief() {
        initComponents();
        Acase = new AddCase();
        b = new BorderLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScroolPanel = new javax.swing.JPanel();
        SearchBtn = new javax.swing.JButton();
        SearchTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(31, 40, 51));

        AddBtn.setBackground(new java.awt.Color(197, 198, 199));
        AddBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setBorder(null);
        AddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBtn.setFocusable(false);
        AddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ScroolPanel.setBackground(new java.awt.Color(11, 12, 16));

        javax.swing.GroupLayout ScroolPanelLayout = new javax.swing.GroupLayout(ScroolPanel);
        ScroolPanel.setLayout(ScroolPanelLayout);
        ScroolPanelLayout.setHorizontalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1234, Short.MAX_VALUE)
        );
        ScroolPanelLayout.setVerticalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ScroolPanel);

        SearchBtn.setBackground(new java.awt.Color(197, 198, 199));
        SearchBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        SearchBtn.setBorder(null);
        SearchBtn.setBorderPainted(false);
        SearchBtn.setContentAreaFilled(false);
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setFocusable(false);
        SearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        SearchTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchBtn)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SearchBtn)
                        .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        this.setLayout(b);
        this.add(Acase);

        AddBtn.setVisible(false);
        jScrollPane1.setVisible(false);
        SearchTxt.setVisible(false);
        SearchBtn.setVisible(false);
        Acase.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel ScroolPanel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}