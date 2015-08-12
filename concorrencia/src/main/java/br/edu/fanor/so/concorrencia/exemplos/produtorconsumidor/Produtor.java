/**
 * Professor Adriano Patrick do Nascimento Cunha
 * Disciplina de Sistemas Operacionais
 * Curso de Sistemas de Informação
 * Fanor - Faculdades Nordeste - DeVry Brasil
 */
package br.edu.fanor.so.concorrencia.exemplos.produtorconsumidor;

import java.util.Random;

import br.edu.fanor.so.concorrencia.exemplos.basico.Usuario;

/**
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public class Produtor implements Runnable {

	private Buffer buffer;

	public Produtor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				this.buffer.push(new Usuario(this.geraNome()));
//				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String geraNome() {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

		Random random = new Random();

		String armazenaChaves = "";
		int index = -1;
		for (int i = 0; i < 7; i++) {
			index = random.nextInt(letras.length());
			armazenaChaves += letras.substring(index, index + 1);
		}

		return armazenaChaves;
	}

}
