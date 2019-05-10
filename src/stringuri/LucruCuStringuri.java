package stringuri;

public class LucruCuStringuri {
  
  public static void main(String[] args) {
    /*
     * Stringurile sunt obiecte imutabile, adica o data creat un string nu ii putem schimba valoarea.
     * Daca dorim sa il modificam se va salva un nou obiect in memorie
     */
    String h = "Hello";
    String w = "World!";
    String text = h + ", " + w; //operatie numita concatenare.
    System.out.println(text);
    
    String propozitie = "Ana are mere!";
    
    /* Meoda substring() extrage o parte din valoare, in functie de parametri
     * Indexul (numaratoarea) in programare incepe intotdeauna de la 0, nu de la 1
     */
    String substring = propozitie.substring(8);
    System.out.println("Incepand cu index == 8: " + substring);
  
    String substring1 = propozitie.substring(8, 12);
    System.out.println("Incepand cu index == 8 si pana la index == 12: " + substring1);
  
    int length = propozitie.length();
    System.out.println("Lungimea stringului se afla cu metoda length(): " + length);
  
    System.out.println("Convertire la majuscule: " + propozitie.toUpperCase());
    System.out.println("Convertire la minuscule: " + propozitie.toLowerCase());
    
    System.out.println("Obtinem caracterul la pozitia 1: " + propozitie.charAt(1));
    System.out.println("Obtinem pozitia caracterului 'm': " + propozitie.indexOf('m'));
    System.out.println("Obtinem ultima pozitie a caracterului 'a': " + propozitie.indexOf('a'));
  
    String propozitieCuMajuscule = propozitie.toUpperCase();
    String propozitieCuMinuscule = propozitie.toLowerCase();
    System.out.println("Verificam daca valorile a 2 stringuri sunt egale, fara sa tinem cont de majuscule: " +
            propozitieCuMajuscule.equalsIgnoreCase(propozitieCuMinuscule));
  
    System.out.println("Verificam daca se termina cu caracterele re! : " + propozitie.endsWith("re!"));
    System.out.println("Inlocuim caractere din string: " + propozitie.replace("Ana", "Elena"));
    
    /*
     * Daca avem de facut multe operatii pe un singur string, pentru a evita folosirea memoriei excesiv folosim
     * tipul de date (clasa) StringBuilder
     */
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("O");
    stringBuilder.append(" ");
    stringBuilder.append("propozitie");
    stringBuilder.append(" ");
    stringBuilder.append("destul");
    stringBuilder.append(" ");
    stringBuilder.append("de");
    stringBuilder.append(" ");
    stringBuilder.append("complicata");
    stringBuilder.append(".");
  
    System.out.println(stringBuilder);
    // daca vrem sa obtinem tipul de data String putem oricand apela metoda mostenita de la Object: .toString()
    String propozitieComplexa = stringBuilder.toString();
    System.out.println(propozitieComplexa);
    
  }
}
