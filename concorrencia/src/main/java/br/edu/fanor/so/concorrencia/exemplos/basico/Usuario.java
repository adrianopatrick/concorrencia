/**
 * Professor Adriano Patrick do Nascimento Cunha
 * Disciplina de Sistemas Operacionais
 * Curso de Sistemas de Informação
 * Fanor - Faculdades Nordeste - DeVry Brasil
 */
package br.edu.fanor.so.concorrencia.exemplos.basico;

/**
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public class Usuario {
	
	private String nome;
	
	/**
	 * 
	 */
	public Usuario(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
