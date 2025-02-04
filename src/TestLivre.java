public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Petit Prince", 12.99f, 5);
        Livre livre2 = new Livre("1984", 15.50f, 3);
        Livre livre3 = new Livre("L'Alchimiste", 18.75f, 7);

        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
    }
}