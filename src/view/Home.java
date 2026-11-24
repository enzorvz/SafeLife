package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Home {

   public static void main(String[] args) {
        new Home();
    }
    public  Home(){
        JFrame home =new JFrame("Home");

        //toolkit e basicamente para pegar as informaçao da interfase grafica

        //inicio do painel
        Dimension d =  Toolkit.getDefaultToolkit().getScreenSize();
        home.setSize(d.width,d.height);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLocationRelativeTo(null);

        home.setLayout(new BorderLayout());
        home.getContentPane().setBackground(Color.BLACK);


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
        logo.setBorder(BorderFactory.createEmptyBorder(23,0,0,-30));


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
        JLabel inicio = new JLabel("-> Inicio");

        inicio.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        inicio.setForeground(new Color(255,0,0,255));

        JMenu produto = new JMenu("Produtos");
        produto.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        produto.setForeground(new Color(255,255,255,255));

        JMenuItem cadastrar = new JMenuItem("Cadastrar");
        cadastrar.addActionListener(e->{
            new CadastroProduto();
          home.dispose();
        });
        produto.add(cadastrar);

        JMenuItem telasProdutos = new JMenuItem("Tela Produtos");
        telasProdutos.addActionListener(e->{
            new HomeProduto();
          home.dispose();
        });
        produto.add(telasProdutos);

        JMenuItem pedirResEstoque = new JMenuItem("Pedir re-estoque");
        pedirResEstoque.addActionListener(e->{
            new ReEstoque();
            home.dispose();
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

        JMenu clientes = new JMenu("Clientes");
        clientes.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        clientes.setForeground(new Color(255,255,255,255));

        JMenuItem cadastrarCliente = new JMenuItem("Cadastrar");
        cadastrarCliente.addActionListener( e->{
            new CadastroCliente();
            home.dispose();
        });
        clientes.add(cadastrarCliente);

        JMenuItem telasCliente = new JMenuItem("Tela Clientes");
        telasCliente.addActionListener(e->{
            new HomeCliente();
            home.dispose();
        });
        clientes.add(telasCliente);


        JMenu relatorio = new JMenu("Relatorio");
        relatorio.setBorder(BorderFactory.createEmptyBorder(10,20,0,0));
        relatorio.setForeground(new Color(255,255,255,255));

        JMenuItem relatorioCliente = new JMenuItem("Clientes");
        relatorioCliente.addActionListener(e->{
            new RelatorioDoCliente();
            home.dispose();
        });
        relatorio.add(relatorioCliente);

        JMenuItem relatorioProduto = new JMenuItem("Produtos");
        relatorioProduto.addActionListener(e->{
            new RelatorioDoProduto();
            home.dispose();
        });
        relatorio.add(relatorioProduto);
        relatorio.add(relatorioProduto);
        JMenuItem relatoriotela = new JMenuItem("Tela Relatorio");
        relatoriotela.addActionListener(e->{
            new HomeRelatorio();
            home.dispose();
        });
        relatorio.add(relatoriotela);

        JPanel painelesquerdoinferior =new JPanel();
        painelesquerdoinferior.setBackground(new Color(53, 53, 53));
        painelesquerdoinferior.setBorder( BorderFactory.createMatteBorder( 0, 0, 0, 0, new Color(53, 53, 53)));

//fim do painel







        JPanel parteCentral =new JPanel();
        parteCentral.setBackground(new Color(0,0,0,255));
        parteCentral.setLayout(new GridLayout(3,1));

        JPanel parteCentralsuperior =new JPanel();
        parteCentralsuperior.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        parteCentralsuperior.setBackground(new Color(0,0,0,255));
        parteCentralsuperior.setLayout(new BorderLayout());

        JPanel parteCentralsuperiorparteTexto =new JPanel();
        parteCentralsuperiorparteTexto.setLayout(new GridLayout(2,4));
        parteCentralsuperiorparteTexto.setBackground(null);

       JLabel textopainelgeral = new JLabel("Painel Geral ");

       textopainelgeral.setBorder(BorderFactory.createEmptyBorder(10,30,0,0));
       textopainelgeral.setFont(new Font("arial",Font.BOLD,20));
       textopainelgeral.setForeground(Color.WHITE);
       parteCentralsuperiorparteTexto.add(textopainelgeral);

       parteCentralsuperior.add(parteCentralsuperiorparteTexto,BorderLayout.NORTH);

        JLabel descricaoTextopaingeral = new JLabel("Visão geral do estoque, vendas e clientes");
        descricaoTextopaingeral.setBorder(BorderFactory.createEmptyBorder(0,30,20,0));


        parteCentralsuperiorparteTexto.add(descricaoTextopaingeral);
        parteCentral.add(parteCentralsuperior);

        JPanel informacaoGeral = new JPanel();
        informacaoGeral.setBorder(BorderFactory.createEmptyBorder(10,40,0,40));
        informacaoGeral.setLayout(new GridLayout(1 , 3,80,80));
        informacaoGeral.setBackground(Color.BLACK);

        JPanel painelgeralprodutoEstoque=new JPanel(){
            @Override
            protected void paintComponent(Graphics g ){
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }};
        painelgeralprodutoEstoque.setOpaque(false);

        painelgeralprodutoEstoque.setLayout(new BorderLayout());
        painelgeralprodutoEstoque.setBackground(new Color(53,53,53,255));

        JLabel produtoemEstoque = new JLabel("Produto em estoque");
        produtoemEstoque.setForeground(Color.WHITE);
        painelgeralprodutoEstoque.add(produtoemEstoque,BorderLayout.NORTH);
        produtoemEstoque.setBorder(BorderFactory.createEmptyBorder(20,35,0,0));

        JLabel numeroprodutoemEstoque = new JLabel();
        numeroprodutoemEstoque.setText("000");
        numeroprodutoemEstoque.setForeground(Color.WHITE);
        painelgeralprodutoEstoque.add(numeroprodutoemEstoque,BorderLayout.LINE_START);
        numeroprodutoemEstoque.setFont(new Font("arial",Font.BOLD,50));
        numeroprodutoemEstoque.setBorder(BorderFactory.createEmptyBorder(0,35,0,0));

        JLabel numeroCategoriaAtiva = new JLabel();
        numeroCategoriaAtiva.setText("0 categoria ativa");
        numeroCategoriaAtiva.setForeground(Color.GREEN);
        painelgeralprodutoEstoque.add(numeroCategoriaAtiva,BorderLayout.SOUTH);

        numeroCategoriaAtiva.setBorder(BorderFactory.createEmptyBorder(0,35,30,0));







        JPanel painelgeralEstoqueBaixo=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 =(Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                 g2.dispose();
            }
        };
        painelgeralEstoqueBaixo.setOpaque(false);

        painelgeralEstoqueBaixo.setLayout(new BorderLayout());
        painelgeralEstoqueBaixo.setBackground(new Color(53,53,53,255));

        JLabel estoquebaixo = new JLabel("Estoque Baixo");
        estoquebaixo.setForeground(Color.WHITE);
        painelgeralEstoqueBaixo.add(estoquebaixo,BorderLayout.NORTH);
        estoquebaixo.setBorder(BorderFactory.createEmptyBorder(20,35,0,0));

        JLabel numeroestoquebaixo = new JLabel();
        numeroestoquebaixo.setText("000");
        numeroestoquebaixo.setForeground(Color.red);
        painelgeralEstoqueBaixo.add(numeroestoquebaixo,BorderLayout.LINE_START);
        numeroestoquebaixo.setFont(new Font("arial",Font.BOLD,50));
        numeroestoquebaixo.setBorder(BorderFactory.createEmptyBorder(0,35,0,0));

        JLabel numeroRequeratencao = new JLabel();
        numeroRequeratencao.setText("Requer atencao");
        numeroRequeratencao.setForeground(Color.red);
        painelgeralEstoqueBaixo.add(numeroRequeratencao,BorderLayout.SOUTH);
        numeroRequeratencao.setBorder(BorderFactory.createEmptyBorder(0,35,30,0));



        JPanel painelgeralClienteCadastrado=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }
        };
        painelgeralClienteCadastrado.setOpaque(false);



        painelgeralClienteCadastrado.setLayout(new BorderLayout());
        painelgeralClienteCadastrado.setBackground(new Color(53,53,53,255));

        JLabel clienteCadastrado = new JLabel("Clientes cadastrados");
        clienteCadastrado.setForeground(Color.WHITE);
        painelgeralClienteCadastrado.add(clienteCadastrado,BorderLayout.NORTH);
        clienteCadastrado.setBorder(BorderFactory.createEmptyBorder(20,35,0,0));

        JLabel numeroclienteCadastrado = new JLabel();
        numeroclienteCadastrado.setText("000");
        numeroclienteCadastrado.setForeground(Color.WHITE);
        painelgeralClienteCadastrado.add(numeroclienteCadastrado,BorderLayout.LINE_START);
        numeroclienteCadastrado.setFont(new Font("arial",Font.BOLD,50));
        numeroclienteCadastrado.setBorder(BorderFactory.createEmptyBorder(0,35,0,0));

        JLabel numeronovaessasemana = new JLabel();
        numeronovaessasemana.setText("0 novos essa semana");
        numeronovaessasemana.setForeground(Color.GREEN);
        painelgeralClienteCadastrado.add(numeronovaessasemana,BorderLayout.SOUTH);
        numeronovaessasemana.setBorder(BorderFactory.createEmptyBorder(0,35,30,0));



        informacaoGeral.add(painelgeralprodutoEstoque);
        informacaoGeral.add(painelgeralEstoqueBaixo);
        informacaoGeral.add(painelgeralClienteCadastrado);

       // informacaoGeral.setBackground(null);
        parteCentralsuperior.add(informacaoGeral);

        JPanel parteCentralcentral =new JPanel();

        parteCentralcentral.setLayout(new GridLayout(1,2,40,40));
        parteCentralcentral.setBackground(Color.BLACK);
        parteCentralcentral.setBorder(BorderFactory.createEmptyBorder(20,30,20,20));


        JPanel parteCentralcentralesqurdo=new JPanel();
        parteCentralcentralesqurdo.setBackground(Color.BLACK);
        parteCentralcentralesqurdo.setLayout(new BorderLayout());
        parteCentralcentralesqurdo.setBorder(BorderFactory.createEmptyBorder(0,5,0,0));

        JLabel alertaDeEstoqueBaixo = new JLabel("Alertas de Estoque Baixo");
        alertaDeEstoqueBaixo.setForeground(Color.WHITE);
        alertaDeEstoqueBaixo.setFont(new Font("arial",Font.BOLD,15));
        parteCentralcentralesqurdo.add(alertaDeEstoqueBaixo,BorderLayout.NORTH);

        JPanel infoalertaDeEstoqueBaixo=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d=(Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2d.setColor(getBackground());
                g2d.dispose();
            }
        };

        infoalertaDeEstoqueBaixo.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        infoalertaDeEstoqueBaixo.setOpaque(false);
        infoalertaDeEstoqueBaixo.setLayout(new BorderLayout());
        parteCentralcentralesqurdo.add(infoalertaDeEstoqueBaixo,BorderLayout.CENTER);

        JPanel infoalertaDeEstoqueBaixopartesuperior = new  JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }
        };
        infoalertaDeEstoqueBaixopartesuperior.setBackground(Color.WHITE);
        infoalertaDeEstoqueBaixopartesuperior.setLayout(new GridLayout(3,1,0,1));
        infoalertaDeEstoqueBaixopartesuperior.setBorder(BorderFactory.createMatteBorder(1,0,0,0,new Color(53,53,53)));
        infoalertaDeEstoqueBaixopartesuperior.setOpaque(false);
        infoalertaDeEstoqueBaixo.add( infoalertaDeEstoqueBaixopartesuperior,BorderLayout.CENTER);

        JLabel textouminfoalertaDeEstoqueBaixopartesuperior = new JLabel();
        textouminfoalertaDeEstoqueBaixopartesuperior.setLayout(new BorderLayout());
        textouminfoalertaDeEstoqueBaixopartesuperior.setOpaque(true);
        textouminfoalertaDeEstoqueBaixopartesuperior.setBackground(new Color(53,53,53));
        infoalertaDeEstoqueBaixopartesuperior.add(textouminfoalertaDeEstoqueBaixopartesuperior);



        JLabel textouminfoalertaDeEstoqueBaixopartesuperiorp1= new JLabel(" informaçao so primeiro slote");
        textouminfoalertaDeEstoqueBaixopartesuperior.add(textouminfoalertaDeEstoqueBaixopartesuperiorp1,BorderLayout.WEST);
        textouminfoalertaDeEstoqueBaixopartesuperiorp1.setOpaque(true);
        textouminfoalertaDeEstoqueBaixopartesuperiorp1.setForeground(Color.WHITE);
        textouminfoalertaDeEstoqueBaixopartesuperiorp1.setBackground(new Color(53,53,53));

        JLabel textouminfoalertaDeEstoqueBaixopartesuperiorp2= new JLabel("? un. ");
        textouminfoalertaDeEstoqueBaixopartesuperior.add(textouminfoalertaDeEstoqueBaixopartesuperiorp2,BorderLayout.EAST);
        textouminfoalertaDeEstoqueBaixopartesuperiorp2.setOpaque(true);
        textouminfoalertaDeEstoqueBaixopartesuperiorp2.setForeground(Color.red);
        textouminfoalertaDeEstoqueBaixopartesuperiorp2.setBackground(new Color(53,53,53));


        JLabel textodoisinfoalertaDeEstoqueBaixopartesuperior = new JLabel();
        textodoisinfoalertaDeEstoqueBaixopartesuperior.setLayout(new BorderLayout());
        textodoisinfoalertaDeEstoqueBaixopartesuperior.setOpaque(true);
        textodoisinfoalertaDeEstoqueBaixopartesuperior.setBackground(new Color(53,53,53));
        infoalertaDeEstoqueBaixopartesuperior.add(textodoisinfoalertaDeEstoqueBaixopartesuperior);



        JLabel textodoisinfoalertaDeEstoqueBaixopartesuperiorp1= new JLabel(" informaçao so dois slote");
        textodoisinfoalertaDeEstoqueBaixopartesuperior.add(textodoisinfoalertaDeEstoqueBaixopartesuperiorp1,BorderLayout.WEST);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp1.setOpaque(true);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp1.setForeground(Color.WHITE);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp1.setBackground(new Color(53,53,53));

        JLabel textodoisinfoalertaDeEstoqueBaixopartesuperiorp2= new JLabel("? un. ");
        textodoisinfoalertaDeEstoqueBaixopartesuperior.add(textodoisinfoalertaDeEstoqueBaixopartesuperiorp2,BorderLayout.EAST);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp2.setOpaque(true);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp2.setForeground(Color.red);
        textodoisinfoalertaDeEstoqueBaixopartesuperiorp2.setBackground(new Color(53,53,53));


        JLabel textoterceiroinfoalertaDeEstoqueBaixopartesuperior = new JLabel();
        textoterceiroinfoalertaDeEstoqueBaixopartesuperior.setLayout(new BorderLayout());
        textoterceiroinfoalertaDeEstoqueBaixopartesuperior.setBackground(new Color(53,53,53));
        textoterceiroinfoalertaDeEstoqueBaixopartesuperior.setOpaque(true);
        infoalertaDeEstoqueBaixopartesuperior.add(textoterceiroinfoalertaDeEstoqueBaixopartesuperior);

        JLabel textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp1= new JLabel(" informaçao so terceiro slote");
        textoterceiroinfoalertaDeEstoqueBaixopartesuperior.add(textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp1,BorderLayout.WEST);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp1.setOpaque(true);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp1.setForeground(Color.WHITE);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp1.setBackground(new Color(53,53,53));

        JLabel textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp2= new JLabel("? un. ");
        textoterceiroinfoalertaDeEstoqueBaixopartesuperior.add(textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp2,BorderLayout.EAST);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp2.setOpaque(true);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp2.setForeground(Color.red);
        textoterceiroinfoalertaDeEstoqueBaixopartesuperiorp2.setBackground(new Color(53,53,53));




        JPanel infoalertaDeEstoqueBaixoparteinferior =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }
        };
        infoalertaDeEstoqueBaixoparteinferior.setOpaque(false);
        infoalertaDeEstoqueBaixo.add( infoalertaDeEstoqueBaixoparteinferior,BorderLayout.SOUTH);
       infoalertaDeEstoqueBaixoparteinferior.setBackground(new Color(53,53,53));

       JLabel maisestoquebaixo= new JLabel("Ver todos os produtos com estoque baixo");
       maisestoquebaixo.setForeground(Color.white);
        infoalertaDeEstoqueBaixoparteinferior.add(maisestoquebaixo);




        JPanel parteCentralcentradireita=new JPanel();
        parteCentralcentradireita.setBackground(Color.BLACK);
        parteCentralcentradireita.setLayout(new BorderLayout());
        parteCentralcentradireita.setBorder(BorderFactory.createEmptyBorder(0,5,0,0));

        JLabel ultimavanda = new JLabel("Ultimas Vendas");
        ultimavanda.setForeground(Color.WHITE);
        ultimavanda.setFont(new Font("arial",Font.BOLD,15));
        parteCentralcentradireita.add(ultimavanda,BorderLayout.NORTH);

        JPanel infoalertaDeultimavanda=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D gd2=(Graphics2D) g.create();
                gd2.setColor(getBackground());
                gd2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                gd2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                gd2.dispose();
            }

        };
        infoalertaDeultimavanda.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        infoalertaDeultimavanda.setOpaque(false);
        infoalertaDeultimavanda.setLayout(new BorderLayout());
infoalertaDeultimavanda.setBackground(new Color(53,53,53));
        parteCentralcentradireita.add(infoalertaDeultimavanda,BorderLayout.CENTER);


        JPanel infoalertaDeultimavandapartesuperior = new  JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }
        };
        infoalertaDeultimavandapartesuperior.setBackground(Color.WHITE);
        infoalertaDeultimavandapartesuperior.setLayout(new GridLayout(3,1,0,1));
        infoalertaDeultimavandapartesuperior.setBorder(BorderFactory.createMatteBorder(1,0,0,0,new Color(53,53,53)));
        infoalertaDeultimavandapartesuperior.setOpaque(false);
        infoalertaDeultimavanda.add(   infoalertaDeultimavandapartesuperior ,BorderLayout.CENTER);

        JLabel textouminfoalertaDeultimavandapartesuperior = new JLabel();
        textouminfoalertaDeultimavandapartesuperior.setLayout(new BorderLayout());
        textouminfoalertaDeultimavandapartesuperior.setOpaque(true);
        textouminfoalertaDeultimavandapartesuperior.setBackground(new Color(53,53,53));
        infoalertaDeultimavandapartesuperior.add(textouminfoalertaDeultimavandapartesuperior);

        JLabel textouminfoalertaDeultimavandapartesuperiorp1= new JLabel(" informaçao so primeiro slote");
        textouminfoalertaDeultimavandapartesuperior.add(textouminfoalertaDeultimavandapartesuperiorp1,BorderLayout.WEST);
        textouminfoalertaDeultimavandapartesuperiorp1.setOpaque(true);
        textouminfoalertaDeultimavandapartesuperiorp1.setForeground(Color.WHITE);
        textouminfoalertaDeultimavandapartesuperiorp1.setBackground(new Color(53,53,53));

        JLabel  textouminfoalertaDeultimavandapartesuperiorp2= new JLabel("+? un. ");
        textouminfoalertaDeultimavandapartesuperior.add( textouminfoalertaDeultimavandapartesuperiorp2,BorderLayout.EAST);
        textouminfoalertaDeultimavandapartesuperiorp2.setOpaque(true);
        textouminfoalertaDeultimavandapartesuperiorp2.setForeground(Color.green);
        textouminfoalertaDeultimavandapartesuperiorp2.setBackground(new Color(53,53,53));


        JLabel textodoisinfoalertaDeultimavandapartesuperior = new JLabel();
        textodoisinfoalertaDeultimavandapartesuperior.setLayout(new BorderLayout());
        textodoisinfoalertaDeultimavandapartesuperior.setOpaque(true);
        textodoisinfoalertaDeultimavandapartesuperior.setBackground(new Color(53,53,53));
        infoalertaDeultimavandapartesuperior.add(textodoisinfoalertaDeultimavandapartesuperior);



        JLabel textodoisinfoalertaDeultimavandapartesuperiorp1= new JLabel(" informaçao so dois slote");
        textodoisinfoalertaDeultimavandapartesuperior.add(textodoisinfoalertaDeultimavandapartesuperiorp1,BorderLayout.WEST);
        textodoisinfoalertaDeultimavandapartesuperiorp1.setOpaque(true);
        textodoisinfoalertaDeultimavandapartesuperiorp1.setForeground(Color.WHITE);
        textodoisinfoalertaDeultimavandapartesuperiorp1.setBackground(new Color(53,53,53));

        JLabel textodoisinfoalertaDeultimavandapartesuperiorp2= new JLabel("+? un. ");
        textodoisinfoalertaDeultimavandapartesuperior.add(textodoisinfoalertaDeultimavandapartesuperiorp2,BorderLayout.EAST);
        textodoisinfoalertaDeultimavandapartesuperiorp2.setOpaque(true);
        textodoisinfoalertaDeultimavandapartesuperiorp2.setForeground(Color.green);
        textodoisinfoalertaDeultimavandapartesuperiorp2.setBackground(new Color(53,53,53));



        JLabel textoterceiroinfoalertaDeultimavandapartesuperior = new JLabel();
        textoterceiroinfoalertaDeultimavandapartesuperior.setLayout(new BorderLayout());
        textoterceiroinfoalertaDeultimavandapartesuperior.setBackground(new Color(53,53,53));
        textoterceiroinfoalertaDeultimavandapartesuperior.setOpaque(true);
        infoalertaDeultimavandapartesuperior.add(textoterceiroinfoalertaDeultimavandapartesuperior);

        JLabel textoterceiroinfoalertaDeultimavandapartesuperiorp1= new JLabel(" informaçao so terceiro slote");
        textoterceiroinfoalertaDeultimavandapartesuperior.add(textoterceiroinfoalertaDeultimavandapartesuperiorp1,BorderLayout.WEST);
        textoterceiroinfoalertaDeultimavandapartesuperiorp1.setOpaque(true);
        textoterceiroinfoalertaDeultimavandapartesuperiorp1.setForeground(Color.WHITE);
        textoterceiroinfoalertaDeultimavandapartesuperiorp1.setBackground(new Color(53,53,53));


        JLabel textoterceiroinfoalertaDeultimavandapartesuperiorp2= new JLabel("+? un. ");
        textoterceiroinfoalertaDeultimavandapartesuperior.add(textoterceiroinfoalertaDeultimavandapartesuperiorp2,BorderLayout.EAST);
        textoterceiroinfoalertaDeultimavandapartesuperiorp2.setOpaque(true);
        textoterceiroinfoalertaDeultimavandapartesuperiorp2.setForeground(Color.GREEN);
        textoterceiroinfoalertaDeultimavandapartesuperiorp2.setBackground(new Color(53,53,53));

        JPanel infoalertaDeultimavandaparteinferior =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
                g2.dispose();
            }
        };
        infoalertaDeultimavandaparteinferior.setOpaque(false);
        infoalertaDeultimavanda.add( infoalertaDeultimavandaparteinferior,BorderLayout.SOUTH);
        infoalertaDeultimavandaparteinferior.setBackground(new Color(53,53,53));

        JLabel ultimasvendas= new JLabel("Ver todas as ultimas vendas");
        ultimasvendas.setForeground(Color.white);
        infoalertaDeultimavandaparteinferior.add(ultimasvendas);


        parteCentralcentral.add(parteCentralcentralesqurdo);
        parteCentralcentral.add(parteCentralcentradireita);
        parteCentral.add(parteCentralcentral);












        JPanel parteCentralinferior =new JPanel();
        parteCentralinferior.setBorder(BorderFactory.createEmptyBorder(80,0,0,0));
        parteCentralinferior.setBackground(Color.BLACK);

        JPanel bordadeCriarnovoproduto =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),10,10);
                g2.dispose();
            }};
        bordadeCriarnovoproduto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==1){
                    new CadastroCliente();
                    home.dispose();
                };
            }
        }

    );
        bordadeCriarnovoproduto.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
        bordadeCriarnovoproduto.setLayout(new BorderLayout());
        bordadeCriarnovoproduto.setOpaque(false);

        parteCentralinferior.add(bordadeCriarnovoproduto,BorderLayout.CENTER);
        bordadeCriarnovoproduto.setBackground(Color.white);
        bordadeCriarnovoproduto.setLocation(parteCentralinferior.getX()/2,parteCentralinferior.getY()/2);

        JPanel bordadeCriarnovoprodutoexterior =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(getBackground());
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),10,10);
                g2.dispose();
            }};
        bordadeCriarnovoprodutoexterior.setOpaque(false);
        bordadeCriarnovoprodutoexterior.setBorder(BorderFactory.createEmptyBorder(5,40,5,40));
        bordadeCriarnovoproduto.add(bordadeCriarnovoprodutoexterior);
        bordadeCriarnovoprodutoexterior.setBackground(Color.BLACK);

        JButton criarNovoProduto =new JButton("+Novo Produto");
        criarNovoProduto.addActionListener(e->{
            new CadastroCliente();
            home.dispose();
        });
         criarNovoProduto.setBorder(null);
        criarNovoProduto.setForeground(Color.WHITE);

        criarNovoProduto.setBackground(new Color(0,0,0));
        criarNovoProduto.setFont(new Font("ARIAL",Font.BOLD,12));
        bordadeCriarnovoprodutoexterior.add(criarNovoProduto);
        bordadeCriarnovoproduto.setLocation(parteCentralinferior.getWidth()/2-bordadeCriarnovoproduto.getWidth()/2,parteCentralinferior.getHeight()/2-bordadeCriarnovoproduto.getHeight()/2);

        parteCentral.add(parteCentralinferior);




        painelesquerdosuperior.add(inicio);
        painelesquerdosuperior.add(produto);
        painelesquerdosuperior.add(perfil);
        painelesquerdosuperior.add(clientes);
        painelesquerdosuperior.add(relatorio);





        painelesquerdo.add(painelesquerdosuperior);
        painelesquerdo.add(painelesquerdoinferior);
        partedecimadalogo.add(   logo, BorderLayout.CENTER);
        partedecimadalogo.add(gestor,BorderLayout.EAST);
        home.add(rotbar);
        home.add(partedecimadalogo, BorderLayout.NORTH);
        rotbar.add(arquivo);
        rotbar.add(menuAjuda);
        home.setJMenuBar(rotbar);
        home.add(painelesquerdo,BorderLayout.WEST);
       home.add(parteCentral);


        home.setVisible(true);


    }
}
