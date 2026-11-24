package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

//jf=login
 //jp=painelInterno
 //jl=h1
    //jll=tituloemail
    //jtf=inputEmail
public static void main(String[] args) {
    new Login();
}
  public Login(){
        JFrame login =new JFrame("login Do SafeLife");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        login.setSize(500,700);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLayout(null);
        login.setLocationRelativeTo(null);
        login.getContentPane().setBackground(new Color(0,0,0,255));
        login.setVisible(true);



ImageIcon logo1 =new ImageIcon(new ImageIcon("src/imagem/logo.jpeg").getImage().getScaledInstance(400,300,5));
        JLabel logo = new JLabel(logo1);
        logo.setSize(500,100);


        JPanel painelInterno=new JPanel(){
            @Override
            protected void paintComponent(Graphics textura) {
                super.paintComponent(textura);
                Graphics2D text2=(Graphics2D) textura.create();
                text2.setColor(getBackground());
                text2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                text2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                text2.dispose();
            }
        };
        painelInterno.setBackground(new Color(50, 50, 50,255));
        painelInterno.setLayout(null);
        painelInterno.setOpaque(false);
        painelInterno.setSize(400,400);

        JLabel h1=new JLabel("Entrar na sua conta");
        h1.setBackground(Color.BLACK);
        h1.setForeground(Color.WHITE);
        h1.setFont(new Font("Arial", Font.BOLD, 25));
        h1.setBounds(80, 40, 700, 30);

        JLabel tituloemail=new JLabel("E-mail");
        tituloemail.setBounds(40, 100, 700, 30);
        tituloemail.setBackground(Color.BLACK);
        tituloemail.setForeground(Color.WHITE);
        tituloemail.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField inputEmail = new JTextField();
        inputEmail.setBounds(40,130,700,30);
        inputEmail.setSize(320,30);
    inputEmail.setBorder(null);

        JLabel tituloSenha=new JLabel("Senha");
        tituloSenha.setBounds(40, 170, 700, 30);
        tituloSenha.setBackground(Color.BLACK);
        tituloSenha.setForeground(Color.WHITE);
        tituloSenha.setFont(new Font("Arial", Font.BOLD, 15));

        JPasswordField inputSenha = new JPasswordField();
        inputSenha.setBounds(40,200,700,30);
        inputSenha.setSize(230,30);
        inputSenha.setBorder(null);

        JButton mostrarSenha =new JButton("mostrar");
        mostrarSenha.setBorder(null);
        mostrarSenha.addActionListener(e->{
            if (inputSenha.getEchoChar() == 0) {
                inputSenha.setEchoChar('•');
                mostrarSenha.setText("Mostrar");
            } else {
                inputSenha.setEchoChar((char) 0);
                mostrarSenha.setText("Ocultar");
            }
        });

        mostrarSenha.setForeground(Color.BLACK);
        mostrarSenha.setBackground(Color.WHITE);
        mostrarSenha.setBounds(270,200,700,30);
        mostrarSenha.setSize(90,30);

        JLabel esqueciMinhaSenha =new JLabel("Esqueci minha senha");
        esqueciMinhaSenha.setForeground(new Color(0,125,0,255));
        esqueciMinhaSenha.setFont(new Font("arial",Font.BOLD,15));
        esqueciMinhaSenha.setBounds(200,235,700,30);

        JButton enviar=new JButton("Enviar");
        enviar.setForeground(Color.white);
        enviar.setBackground(Color.red);
        enviar.setBounds(40,274,700,30);
        enviar.setSize(320,40);
        enviar.addActionListener(c->{
            if(inputSenha.getPassword().length!=0){

                System.out.println("usar o jdbc aqui");
            }

        });login.add(logo);
        login.add(painelInterno);

        painelInterno.add(h1);
        painelInterno.add(tituloemail);
        painelInterno.add(inputEmail);
        painelInterno.add(tituloSenha);
        painelInterno.add(inputSenha);
        painelInterno.add(mostrarSenha);
        painelInterno.add(enviar);
        painelInterno.add(esqueciMinhaSenha);

Timer timer=new Timer(1000,e->{
    painelInterno.setLocation(login.getWidth()/2-200,login.getHeight()/2-200);
    logo.setLocation(login.getWidth()/2-250,painelInterno.getY()-100);
});
timer.start();
}

}
