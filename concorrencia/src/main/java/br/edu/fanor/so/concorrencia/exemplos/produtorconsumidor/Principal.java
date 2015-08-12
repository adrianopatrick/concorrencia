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
 * -XX:+UseParallelGC
 * -XX:ParallelGCThreads=n
 * -XX:+AggressiveOpts
 */
public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer();
		
		Thread t1 = new Thread(new Produtor(buffer));
		Thread t2 = new Thread(new Consumidor(buffer));
		
		t1.setName("Produtor");
		t1.setPriority(1);
		t2.setName("Consumidor");
		t2.setPriority(5);
		
		t1.start();
		t2.start();
		
	}

}
