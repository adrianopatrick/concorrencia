/**
 * 
 */
package br.edu.fanor.so.concorrencia.exemplos.basico;

import java.util.Arrays;
import java.util.List;

/**
 * @author adrianopatrick@gmail.com
 * @since 12 de ago de 2015
 */
public class ExemploConcorrencia {

	public static void main(String[] args) {

		new Thread(() -> {
			List<Usuario> usuarios = Arrays.asList(new Usuario("Adriano"), new Usuario("Patrick"), new Usuario("Bernado"));
			usuarios.forEach(u -> {System.out.println(u.getNome()); 
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}});
		}).start();
		
		new Thread(() -> {
			List<Usuario> usuarios = Arrays.asList(new Usuario("Maria"), new Usuario("Paulo"), new Usuario("Xildes"));
			usuarios.forEach(u -> {System.out.println(u.getNome());
			try {
				Thread.sleep(15);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}});
		}).start();
	}

}
