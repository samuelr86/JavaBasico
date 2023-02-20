package ENUM;

public class SistemaIbge {

	public static void main(String[] args) {
		
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		
		System.out.println(eb.getNome()); // Piauí

		System.out.println(eb.getNomeMaiusculo()); //PIAUÍ

		System.out.println(eb.getSigla());// PI
		
		System.out.println(eb.getIbge()); //13
	}
}
