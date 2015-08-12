/**
 * Professor Adriano Patrick do Nascimento Cunha
 * Disciplina de Sistemas Operacionais
 * Curso de Sistemas de Informação
 * Fanor - Faculdades Nordeste - DeVry Brasil
 */
package br.edu.fanor.so.concorrencia.exemplos.produtorconsumidor;

/**
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public enum QtdaUsers {
	
	MAX(10),
	MIN(5);
	
	private Integer limite;
	QtdaUsers(Integer limite){
		this.limite = limite;
	}
	
	/**
	 * @return the limite do enum
	 */
	public Integer limite() {
		return limite;
	}
	
}
