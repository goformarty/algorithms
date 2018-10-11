public class Main {

    public static void main(String[] args) {
        System.out.println("it works!");

        QuickFind myQF = new QuickFind(8);
        myQF.unite(1,3);
        myQF.displayIds();
        // System.out.println(myQF);
    }

}
