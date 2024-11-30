import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Login{  
   String Username = "james3302";  
   String Password = "pass";  
   String msg = " ";  
   JTextField txtUsername = new JTextField(20);  
   JTextField txtPassword = new JTextField(20);
   public static void main(String[] args){  
     Login gui = new Login();  
     gui.go();  
   }  
   public void go(){  
     JFrame frame = new JFrame();  
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     JPanel panel = new JPanel();  
     JLabel lblUsername = new JLabel("Username:");    
     JLabel lblPassword = new JLabel("Password:");    
     JButton btnLogin = new JButton("Login");  
     btnLogin.addActionListener(new LoginListener());  
     JButton btnCancel = new JButton("Cancel");  
     btnCancel.addActionListener(new CancelListener());  
     panel.add(lblUsername);  
     panel.add(txtUsername);  
     panel.add(lblPassword);  
     panel.add(txtPassword);   
     panel.add(btnLogin); 
     frame.getContentPane().add(BorderLayout.CENTER,panel);  
     frame.setSize(300,300);  
     frame.setVisible(true);  
   }  
   public class LoginListener implements ActionListener{  
     public void actionPerformed(ActionEvent event){  
       if(Username.equals(txtUsername.getText())){  
         if(Password.equals(txtPassword.getText())){  
           msg = "Login Granted!";  
         }else{  
           msg = "Login Denied";  
         }  
       }else{  
         msg = "Login Denied";  
       }    
       JOptionPane.showMessageDialog(null,msg);            
     }  
   }  
   public class CancelListener implements ActionListener{  
     public void actionPerformed(ActionEvent event){  
       txtUsername.setText(Username);  
       txtPassword.setText(Password);  
       txtUsername.requestFocus();  
     }  
   }  
 }  
