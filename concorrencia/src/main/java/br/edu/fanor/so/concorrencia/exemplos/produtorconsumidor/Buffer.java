/**
 * Professor Adriano Patrick do Nascimento Cunha
 * Disciplina de Sistemas Operacionais
 * Curso de Sistemas de Informação
 * Fanor - Faculdades Nordeste - DeVry Brasil
 */
package br.edu.fanor.so.concorrencia.exemplos.produtorconsumidor;

import java.util.ArrayList;
import java.util.List;

import br.edu.fanor.so.concorrencia.exemplos.basico.Usuario;

/**
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public class Buffer {

	private List<Usuario> usuarios = new ArrayList<>();

	public void push(Usuario usuario) throws InterruptedException {
		usuarios.add(usuario);
		System.out.println("tamanho buffer[push]: " + usuarios.size());
		if (usuarios.size() >= QtdaUsers.MAX.limite()) {
			synchronized (this) {
				wait();
			}
		}
	}

	public Usuario pop() throws InterruptedException {
		if (usuarios.size() <= QtdaUsers.MIN.limite()) {
			synchronized (this) {
				notifyAll();
			}
		}
		if (usuarios.size() > 0) {
			Usuario usuario = usuarios.get(usuarios.size() - 1);
			usuarios.remove(usuarios.size() - 1);
			System.out.println("tamanho buffer[pop]: " + usuarios.size());
			return usuario;
		} else {
			return null;
		}

	}

}
