/**
 * Professor Adriano Patrick do Nascimento Cunha
 * Disciplina de Sistemas Operacionais
 * Curso de Sistemas de Informação
 * Fanor - Faculdades Nordeste - DeVry Brasil
 */
package br.edu.fanor.so.concorrencia.exemplos.produtorconsumidor;

/**
 * Classe que representa um consumidor que demora mais
 * pra consumir do que o produtor consegue produzir
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public class Consumidor implements Runnable {

	private Buffer buffer;

	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
//				Thread.sleep(1000);
				this.buffer.pop();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
