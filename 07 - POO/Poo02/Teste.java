package Poo02;

public class Teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.carro = "Fiat uno";
        carro01.ano = 1998;
        carro01.modelo = "Sport";

        Carro carro02 = new Carro();
        carro02.carro = "Fiat uno";
        carro02.ano = 1998;
        carro02.modelo = "Sport";
        
        System.out.println(carro01.ano);
        System.out.println(carro01.carro);
        System.out.println(carro01.modelo);
        System.out.println(carro02.ano);
        System.out.println(carro02.carro);
        System.out.println(carro02.modelo);
    }
}
