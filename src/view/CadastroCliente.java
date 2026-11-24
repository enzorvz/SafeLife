package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.Toolkit.getDefaultToolkit;

public class CadastroCliente {
    public CadastroCliente(){

        JFrame cadastroCliente =new JFrame("Cadastro dos Clientes");

        //toolkit e basicamente para pegar as informaçao da interfase grafica
        Dimension d =  getDefaultToolkit().getScreenSize();
        cadastroCliente.setSize(d.width,d.height);
        cadastroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastroCliente.setLocationRelativeTo(null);

        cadastroCliente.setLayout(new BorderLayout());
        cadastroCliente.getContentPane().setBackground(Color.BLACK);


        JMenuBar rotbar = new JMenuBar();
        rotbar.setBackground(new Color(53, 53, 53));
        rotbar.setPreferredSize(new Dimension(d.width,40).getSize());
        rotbar.setBorder(BorderFactory.createEmptyBorder(0,20,0,0));

        JMenu arquivo = new JMenu("Arquivo");
        arquivo.setForeground(Color.WHITE);
        arquivo.setFont(new Font("arial",Font.PLAIN,13));

        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setForeground(Color.WHITE);
        menuAjuda.setFont(new Font("arial",Font.PLAIN,13));


        JPanel partedecimadalogo=new JPanel();
        partedecimadalogo.setPreferredSize(new Dimension(d.width, 50));
        partedecimadalogo.setBackground(Color.BLACK);
        partedecimadalogo.setLayout(new BorderLayout());
        partedecimadalogo.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(53, 53, 53)));

        ImageIcon imagemlogo = new ImageIcon(new ImageIcon("src/imagem/logo2.jpeg")
                .getImage().getScaledInstance(200,200,1));
        JLabel logo = new JLabel(imagemlogo);
        logo.setBorder(BorderFactory.createEmptyBorder(23,0,0,0));


        JLabel gestor=new JLabel("Gestor: Admin");
        gestor.setBorder(BorderFactory.createMatteBorder(0,0,0,20,Color.black));

        JPanel painelesquerdo =new JPanel();
        painelesquerdo.setBackground(new Color(53, 53, 53));
        painelesquerdo.setPreferredSize(new Dimension(250,d.height));
        painelesquerdo.setLayout(new GridLayout(2,1));
        painelesquerdo.setBorder( BorderFactory.createMatteBorder( 0, 0, 0, 0,new Color(53, 53, 53)));
        JMenuBar painelesquerdosuperior =new JMenuBar();
        painelesquerdosuperior.setLayout(new GridLayout(7,1));

        painelesquerdosuperior.setBorder( BorderFactory.createMatteBorder( 0, 0, 0, 0, new Color(53, 53, 53)));

        painelesquerdosuperior.setBackground(new Color(53, 53, 53));
        JLabel inicio = new JLabel("Inicio");

        inicio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()==1){
                    new Home();
                    cadastroCliente.dispose();

                }}
        });
        inicio.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        inicio.setForeground(new Color(255,255,255,255));

        JMenu produto = new JMenu("Produtos");
        produto.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        produto.setForeground(new Color(255,255,255,255));

        JMenuItem cadastrar = new JMenuItem("Cadastrar");
        cadastrar.addActionListener(e->{
            new CadastroProduto();
            cadastroCliente.dispose();
        });
        produto.add(cadastrar);

        JMenuItem telasProdutos = new JMenuItem("Tela Produtos");
        telasProdutos.addActionListener(e->{
            new HomeProduto();
            cadastroCliente.dispose();
        });
        produto.add(telasProdutos);

        JMenuItem pedirResEstoque = new JMenuItem("Pedir re-estoque");
        pedirResEstoque.addActionListener(e->{
            new ReEstoque();
            cadastroCliente.dispose();
        });
        produto.add(pedirResEstoque);

        JLabel perfil = new JLabel("Perfil");
        perfil.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        perfil.setForeground(new Color(255,255,255,255));
        perfil.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()==1){

                    System.out.println("adicionar logica depois");
                }}
        });

        JMenu clientes = new JMenu("->Clientes");
        clientes.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        clientes.setForeground(new Color(255,0,0,255));

        JMenuItem cadastrarCliente = new JMenuItem("Cadastrar");
        cadastrarCliente.setForeground(new Color(150,0,0));
        clientes.add(cadastrarCliente);

        JMenuItem telasCliente = new JMenuItem("Tela Clientes");
        telasCliente.addActionListener(e->{
            new HomeCliente();
            cadastroCliente.dispose();
        });
        clientes.add(telasCliente);


        JMenu relatorio = new JMenu("Relatorio");
        relatorio.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        relatorio.setForeground(new Color(255,255,255,255));

        JMenuItem relatorioCliente = new JMenuItem("Clientes");
        relatorioCliente.addActionListener(e->{
            new RelatorioDoCliente();
            cadastroCliente.dispose();
        });
        relatorio.add(relatorioCliente);

        JMenuItem relatorioProduto = new JMenuItem("Produtos");
        relatorioProduto.addActionListener(e->{
            new RelatorioDoProduto();
            cadastroCliente.dispose();
        });
        relatorio.add(relatorioProduto);
        JMenuItem relatoriotela = new JMenuItem("Tela Relatorio");
        relatoriotela.addActionListener(e->{
         new HomeRelatorio();
            cadastroCliente.dispose();
         });
        relatorio.add(relatoriotela);


        JPanel painelesquerdoinferior =new JPanel();
        painelesquerdoinferior.setBackground(new Color(53, 53, 53));
        painelesquerdoinferior.setBorder( BorderFactory.createMatteBorder( 0, 0, 0, 0, new Color(53, 53, 53)));

        painelesquerdosuperior.add(inicio);
        painelesquerdosuperior.add(produto);
        painelesquerdosuperior.add(perfil);
        painelesquerdosuperior.add(clientes);
        painelesquerdosuperior.add(relatorio);

        painelesquerdo.add(painelesquerdosuperior);
        painelesquerdo.add(painelesquerdoinferior);
        partedecimadalogo.add(   logo, BorderLayout.CENTER);
        partedecimadalogo.add(gestor,BorderLayout.EAST);
        cadastroCliente.add(rotbar);
        cadastroCliente.add(partedecimadalogo, BorderLayout.NORTH);
        rotbar.add(arquivo);
        rotbar.add(menuAjuda);
        cadastroCliente.setJMenuBar(rotbar);
        cadastroCliente.add(painelesquerdo,BorderLayout.WEST);
        cadastroCliente.setVisible(true);
    }
}
