package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	
	private static final String ZERO = "zero";
	private static final String UN = "un";
	private static final String DEUX = "deux";
	private static final String TROIS = "trois";
	private static final String QUATRE = "quatre";
	private static final String CINQ = "cinq";
	private static final String SIX = "six";
	private static final String SEPT = "sept";
	private static final String HUIT = "huit";
	private static final String NEUF = "neuf";
	private static final String DIX = "dix";
	private static final String ONZE = "onze";
	private static final String DOUZE = "douze";
	private static final String TREIZE = "treize";
	private static final String QUATORZE = "quatorze";
	private static final String QUINZE = "quinze";
	private static final String SEIZE = "seize";
	
	private static final String VINGT = "vingt";
	private static final String TRENTE = "trente";
	private static final String QUARENTE = "quarente";
	private static final String CINQUANTE = "cinquante";
	private static final String SOIXANTE = "soixante";
	private static final String SOIXANTE_DIX = "soixante_dix";
	private static final String QUATRE_VINGT = "quatre_vingt";
	private static final String QUATRE_VINGT_DIX = "squatre_vingt_dix";
	
	private static final String CENT = "cent";
	
	
	
	public static String num2text(String input) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("0", ZERO);
		map.put("1", UN);
		map.put("2", DEUX);
		map.put("3", TROIS);
		map.put("4", QUATRE);
		map.put("5", CINQ);
		map.put("6", SIX);
		map.put("7", SEPT);
		map.put("8", HUIT);
		map.put("9", NEUF);
		map.put("10", DIX);
		map.put("11", ONZE);
		map.put("12", DOUZE);
		map.put("13", TREIZE);
		map.put("14", QUATORZE);
		map.put("15", QUINZE);
		map.put("16", SEIZE);
		
		map.put("20", VINGT);
		map.put("30", TRENTE);
		map.put("40", QUARENTE);
		map.put("50", CINQUANTE);
		map.put("60", SOIXANTE);
		map.put("70", SOIXANTE_DIX);
		map.put("80", QUATRE_VINGT);
		map.put("90", QUATRE_VINGT_DIX);
		
		return map.get(input);
	}
	public static String text2num(String input) {
		return null;
	}
	
}