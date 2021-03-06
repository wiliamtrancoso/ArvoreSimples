package br.com.trabalho.global;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import br.com.trabalho.view.componente.CFolha;

public abstract class Design {
	public static final Color BACKGROUND_PRINCIPAL = Color.WHITE;
	public static final Color TITULO_PRINCIPAL = new Color(20, 140, 60);
	public static final Color NOME_INTEGRANTES = new Color(160, 200, 175);
	public static final Color TITULO_INTEGRANTES = new Color(70, 140, 90);
			
	public static final Font FONTE_PADRAO = new Font("Arial", Font.PLAIN, 15);
	public static final Font FONTE_TITULO2 = new Font("Arial", Font.BOLD, 22);
	public static final Font FONTE_TITULO3 = new Font("Serif", Font.BOLD + Font.ITALIC, 17);
	public static final Font FONTE_TITULO1 = new Font("Arial", Font.BOLD, 27);
	public static final Font FONTE_INTEGRANTES = new Font("Serif", Font.BOLD + Font.ITALIC, 21);
	
	public static final int TAMANHO_TELA_X = 1800;
	public static final int TAMANHO_TELA_Y = 960;
	
	public static final String INTEGRANTES = "Ninjas";
	
	public static ArrayList<CFolha> getPosicoes(){
		ArrayList<CFolha> retorno = new ArrayList<>();
		
		retorno.add(new CFolha(null, 660, 120));
		
		retorno.add(new CFolha(null, 340, 240));
		retorno.add(new CFolha(null, 980, 240));
		
		retorno.add(new CFolha(null, 180, 360));
		retorno.add(new CFolha(null, 500, 360));
		retorno.add(new CFolha(null, 820, 360));
		retorno.add(new CFolha(null, 1140, 360));
		
		retorno.add(new CFolha(null, 100, 480));
		retorno.add(new CFolha(null, 260, 480));
		retorno.add(new CFolha(null, 420, 480));
		retorno.add(new CFolha(null, 580, 480));
		retorno.add(new CFolha(null, 740, 480));
		retorno.add(new CFolha(null, 900, 480));
		retorno.add(new CFolha(null, 1060, 480));
		retorno.add(new CFolha(null, 1220, 480));
		
		retorno.add(new CFolha(null, 60, 600));
		retorno.add(new CFolha(null, 140, 600));
		retorno.add(new CFolha(null, 220, 600));
		retorno.add(new CFolha(null, 300, 600));
		retorno.add(new CFolha(null, 380, 600));
		retorno.add(new CFolha(null, 460, 600));
		retorno.add(new CFolha(null, 540, 600));
		retorno.add(new CFolha(null, 620, 600));
		retorno.add(new CFolha(null, 700, 600));
		retorno.add(new CFolha(null, 780, 600));
		retorno.add(new CFolha(null, 860, 600));
		retorno.add(new CFolha(null, 940, 600));
		retorno.add(new CFolha(null, 1020, 600));
		retorno.add(new CFolha(null, 1100, 600));
		retorno.add(new CFolha(null, 1180, 600));
		retorno.add(new CFolha(null, 1260, 600));
		
		arrumarFilhas(retorno);
		
		return retorno;
	}
	
	public static ArrayList<CFolha> arrumarFilhas(ArrayList<CFolha> lista){
		int contador = 0;
		for (int i = 0; i < lista.size()/2; i++) {
			lista.get(i).setFolhas(lista.get(++contador), lista.get(++contador));
		}
		
		return lista;
	}
}
