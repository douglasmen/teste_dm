package br.com.dm;

import org.apache.commons.lang3.StringUtils;

public class Questao8 {

	private static final String ESPACO_EM_BRANCO = " ";
	private static final int MIL = 1000000;
	
	/**
	 * define o valor de C
	 * Se a ou b não é informado retorna 0
	 * @param a
	 * @param b
	 * @return
	 */
	public int defineValorC(String a, String b) {
		Integer valor = 0;
		if (StringUtils.isNotBlank(a) && StringUtils.isNotBlank(b)){
			a = a.replaceAll(ESPACO_EM_BRANCO, StringUtils.EMPTY);
			b = b.replaceAll(ESPACO_EM_BRANCO, StringUtils.EMPTY);
			StringBuilder c = new StringBuilder();
			if (a.length() != b.length()){
				if (a.length() > b.length()){
					b = igualaTamanho(b, a.length());
				} else {
					a = igualaTamanho(a, b.length());
				}
			}
			
			for (int i = 0; i < a.length(); i++){
				c.append(a.charAt(i)).append(b.charAt(i));
			}
			
			valor = Integer.valueOf(c.toString().replaceAll(ESPACO_EM_BRANCO, StringUtils.EMPTY));
			return valor >  MIL ? -1 : valor;
			
		}
		return valor;
	}

	/**
	 * Iguala o tamanho dos numeros
	 * @param numero
	 * @param tamanho
	 * @return
	 */
	private String igualaTamanho(String numero, int tamanho) {
		return StringUtils.rightPad(numero, tamanho);
	}

}
