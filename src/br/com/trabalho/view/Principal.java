package br.com.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class Principal extends JFrame{

	private JPanel frame;
	private JScrollPane scroll;

	public static void main(String[] args) {
		Principal principal = new Principal("�rvore Bin�ria");
		
		principal.criaElementos();
		principal.adicionaElementos();
		principal.addListeners();
		
		principal.proximasExecucoes();
		principal.repaint();
		
	}
	
	
	private void proximasExecucoes() {
	}


	}
	public Principal() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	
	public Principal(String title) {
		super(title);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
			this.setVisible(true);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setExtendedState(Frame.MAXIMIZED_BOTH);
			this.setLayout(new BorderLayout());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void criaElementos() {
		//CRIA O ELEMENTO RESPONSAVEL PELO SCROLL E DEPOIS O PAINEL INTERNO COM O TAMANHO DESEJADO
		frame = new JPanel();
		scroll = new JScrollPane(frame);
		
		frame.setBorder(BorderFactory.createLineBorder(Color.red));
        frame.setPreferredSize(new Dimension(2000, 4000));
        frame.setLayout(null);
        
	}
	
	private void adicionaElementos() {
		add(scroll, BorderLayout.CENTER);
		this.setVisible(true);
		
		
	}
	private void addListeners() {
		
	}
}
