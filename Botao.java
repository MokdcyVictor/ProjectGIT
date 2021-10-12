import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;

public class Botao extends JFrame{

        private JButton but1,but2,but3,but4;

        public Botao (){
            super("criando botao");
            setLayout(new FlowLayout());

            Icon login = new ImageIcon("login.png");
            but1 = new JButton("cala a boca");
            but2 = new JButton("seu");
            but3 = new JButton("carioca");
            but4 = new JButton("o seu cafe da manha e bala de ponto 50");

            add(but1);
            add(but2);
            add(but3);
            add(but4);
        }

    public static void main(String[] args) {
        Botao botao = new Botao();


        botao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao.setSize(350,80);
        botao.setVisible(true);
        }
}