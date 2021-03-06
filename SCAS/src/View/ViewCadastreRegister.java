/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Enum.TypePayment;
import Model.CashRegister;
import Model.Employee;
import Model.MonthlyPayment;
import Model.Registration;
import Model.Study;
import Repositories.MonthlyPaymentRepository;
import Repositories.RegistrationRepository;
import Repositories.StudyRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author georgeborsato
 */
public class ViewCadastreRegister extends javax.swing.JDialog {

    /**
     * Creates new form ViewCadastreRegister
     */
    
    private CashRegister cashRegister;
    private StudyRepository studyRepository;
    private RegistrationRepository registrationRepository;
    private Registration registration;
    private Employee employee;
    
    public ViewCadastreRegister(java.awt.Frame parent, boolean modal, CashRegister cashRegister, Employee employee) {
        super(parent, modal);
        initComponents();
        this.cashRegister = cashRegister;
        this.studyRepository = new StudyRepository();
        this.registrationRepository = new RegistrationRepository();
        this.employee = employee;
        
    }

    private ViewCadastreRegister(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jStudyTable = new javax.swing.JTable();
        jName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSearchAluno = new javax.swing.JButton();
        jFormRegister = new javax.swing.JPanel();
        jDataRegistration = new javax.swing.JFormattedTextField();
        jValueRegistration = new javax.swing.JFormattedTextField();
        jTypePayment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDisc = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jCodStudy = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jHandleRegistration = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 90, 128));

        jPanel2.setBackground(new java.awt.Color(222, 226, 230));

        jLabel1.setBackground(new java.awt.Color(61, 90, 128));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 90, 128));
        jLabel1.setText("CADASTRAR MATRICULA");

        jStudyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO ALUNO", "NOME", "IDADE", "CPF", "ENDEREÇO"
            }
        ));
        jScrollPane1.setViewportView(jStudyTable);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 90, 128));
        jLabel2.setText("NOME ALUNO");

        jSearchAluno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jSearchAluno.setForeground(new java.awt.Color(61, 90, 128));
        jSearchAluno.setText("BUSCAR");
        jSearchAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSearchAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSearchAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jFormRegister.setBackground(new java.awt.Color(222, 226, 230));

        try {
            jDataRegistration.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(61, 90, 128));
        jLabel5.setText("DATA MATRICULA");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(61, 90, 128));
        jLabel6.setText("VALOR MATRICULA");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(61, 90, 128));
        jLabel7.setText("TIPO PAGAMENTO");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(61, 90, 128));
        jLabel8.setText("DESCONTO");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(61, 90, 128));
        jLabel10.setText("CODIGO ALUNO");

        jHandleRegistration.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jHandleRegistration.setForeground(new java.awt.Color(61, 90, 128));
        jHandleRegistration.setText("MATRICULAR");
        jHandleRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHandleRegistrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHandleRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHandleRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFormRegisterLayout = new javax.swing.GroupLayout(jFormRegister);
        jFormRegister.setLayout(jFormRegisterLayout);
        jFormRegisterLayout.setHorizontalGroup(
            jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFormRegisterLayout.createSequentialGroup()
                        .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFormRegisterLayout.createSequentialGroup()
                                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDataRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jValueRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jCodStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDisc)
                            .addGroup(jFormRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jFormRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jFormRegisterLayout.setVerticalGroup(
            jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormRegisterLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDisc)
                    .addComponent(jDataRegistration)
                    .addComponent(jValueRegistration)
                    .addComponent(jTypePayment, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFormRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCodStudy, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addComponent(jFormRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jFormRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CADASTRAR MATRICULA", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void showStudiesTable(Study study){
         DefaultTableModel tableSutdy = (DefaultTableModel) jStudyTable.getModel();
         tableSutdy.addRow(new Object[] {study.getId(),study.getName(), study.getAge(), study.getCpf(), study.getAddress()});
    }
    
    private void jSearchAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchAlunoActionPerformed
        String name = jName.getText();
        
        if(!name.trim().equals("")){
            
             try{
                List<Study> studies = this.studyRepository.seachStudies(name);
                for(Study s : studies){
                    this.showStudiesTable(s);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }else{
             JOptionPane.showMessageDialog(null, "Preencha o campo de nome para realizar a busca", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jSearchAlunoActionPerformed
    
    private Date convertDate(String date) throws ParseException{
         Date dateConvert = null;
         try{
            dateConvert = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println(dateConvert);
            return dateConvert;
         }catch(ParseException ex){
             System.out.println(ex.getMessage());
         }
        return null;
    }
    
    private TypePayment validadeTypeMPayment(String typePayment){
        if(typePayment.toUpperCase().equals("AVISTA")){
            return TypePayment.AVISTA;
        }
        else if(typePayment.toUpperCase().equals("DEBITO")){
            return TypePayment.DEBITO;
        }
        
        else if(typePayment.toUpperCase().equals("CREDITO")){
            return TypePayment.CREDITO;
        }
        
        return TypePayment.AVISTA;
    }
    
    private void insertRegistration(String dataRegistration, String valueRegistraion, String desc, 
        String typePayment, String codStudy){
        this.registration = new Registration();
        try{
            Date dateConvert = this.convertDate(dataRegistration);
            this.registration.setDateRegistration(dateConvert);
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
        
        Double valueConvert =  Double.valueOf(valueRegistraion);
        Double DescConvert = Double.valueOf(desc);
        
        this.registration.setValue( valueConvert);
        this.registration.setRebate(DescConvert);
       
        this.registration.setTypePayment(this.validadeTypeMPayment(typePayment));
        Integer codConvert = Integer.parseInt(codStudy);
        Study study = new Study();
        study.setId(Integer.parseInt(codStudy));
        
        this.registration.setStudy(study);
        this.registration.setEmployee(employee);
        
        MonthlyPayment monthlyPayment = new MonthlyPayment();
        monthlyPayment.setRegistration(registration);
        monthlyPayment.setValue(registration.getValue() - registration.getRebate());
        monthlyPayment.setCashRegister(cashRegister);
        monthlyPayment.setRegistrationDate(new Date());
        
        System.out.println(monthlyPayment.toString());
        this.registration.addMonthlyPayment(monthlyPayment);
        
        try{
            this.registrationRepository.insert(registration);
             JOptionPane.showMessageDialog(null, "Aluno matriculado(a) com sucesso");
            
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        
    }
    
    
    private Boolean validateDate(String data, String value, String desc, String typePayment, String cod){
        if(data.trim().equals("")
                || value.trim().equals("")
                || typePayment.trim().equals("") 
                || desc.trim().equals("")
                || cod.trim().equals("")){
            return true;
        }
        else
            return false;
    }
    
    private void jHandleRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHandleRegistrationActionPerformed
        String dataRegistration = jDataRegistration.getText();
        String valueRegistration = jValueRegistration.getText();
        String desc = jDisc.getText();
        String typePayment = jTypePayment.getText();
        String codStudy = jCodStudy.getText();
        
        if(this.validateDate(desc, desc, desc, typePayment, desc)){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios", "Alert", JOptionPane.WARNING_MESSAGE);
        }else{
            this.insertRegistration(dataRegistration, valueRegistration, desc, typePayment, codStudy);
        }
        
    }//GEN-LAST:event_jHandleRegistrationActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastreRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastreRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastreRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastreRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewCadastreRegister dialog = new ViewCadastreRegister(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCodStudy;
    private javax.swing.JFormattedTextField jDataRegistration;
    private javax.swing.JFormattedTextField jDisc;
    private javax.swing.JPanel jFormRegister;
    private javax.swing.JButton jHandleRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchAluno;
    private javax.swing.JTable jStudyTable;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTypePayment;
    private javax.swing.JFormattedTextField jValueRegistration;
    // End of variables declaration//GEN-END:variables
}
