package main;

// Importamos todas las clases que están en el paquete "modelo"
import model.Animal;
import model.Perro;
import model.Gato;
import model.Figura;
import model.Circulo;
import model.Rectangulo;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- PARTE 2: POLIMORFISMO CON ANIMALES ---");
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro(); // Polimorfismo
        Animal miGato = new Gato();   // Polimorfismo

        miAnimal.hacerSonido(); 
        miPerro.hacerSonido();  
        miGato.hacerSonido();   

        System.out.println("\n--- PARTE 3: DESAFÍO CON FIGURAS ---");
        
        // Arreglo de tipo Figura[] como pide el documento
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo(5.0);         
        figuras[1] = new Rectangulo(4.0, 6.0); 
        figuras[2] = new Circulo(2.5);         

        // Mostrar el área de cada una usando polimorfismo
        for (int i = 0; i < figuras.length; i++) {
            System.out.printf("Figura %d - Área calculada: %.2f\n", (i+1), figuras[i].calcularArea());
        }
    }
}