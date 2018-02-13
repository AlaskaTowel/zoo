package zoo;

public class Main {

    public static void main(String[] args) {
        Gallina ruperta  = new Gallina (Animal.Habitat.BOSQUE, "trigo", 10, 60);
        Gallina golfreda = new Gallina (Animal.Habitat.BOSQUE, "maíz", 10, 60);
        
        Leon leopoldo = new Leon ();
        leopoldo.setHabitat(Animal.Habitat.ESTEPA);
        leopoldo.setComida("gacelas");
        leopoldo.setLongevidad(20);
        leopoldo.setPeriodoLactancia(30);
        
        ruperta.comer();
        golfreda.comer();
        
        leopoldo.desplazar();
        leopoldo.comer();
        leopoldo.rugir();
        leopoldo.setRugido ("GRRRRRR  GRRR  GRRR");
        leopoldo.rugir();
        
        System.out.println("Existen " + Animal.getNumAnimales() + " animales");
        System.out.println("Existen " + Mamifero.getNumMamiferos() + " mamíferos");
        System.out.println("Existen " + Ave.getNumAves() + " aves");
        
    }
    
}
