package JavaBasico.POO.PilaresPOO.src;

// FUNDAMENTOS ENCAPSULAMENTO, HERANÇA, ABSTRAÇÃO E POLIMORFISMO


public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("S54SDS548");

        Moto z4 = new Moto();
        z4.setChassi("G9J8GH98");
        z4.ligar();
        
    }
}
