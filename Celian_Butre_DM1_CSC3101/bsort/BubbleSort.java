class BubbleSort {
    public static void main(String args[]) {
        double[] tab = { 2.3, 17.0, 3.14, 8.83, 7.26 };
        System.out.print("tableau : { " + tab[0]);
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i] );
        }
        System.out.println(" }");

        //triage de tableau
        double save = 0;
        for (int i = tab.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (tab[j] >= tab[j+1]){
                    save = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = save;
                }
            }
        }
        System.out.print("tableau trié : { " + tab[0]);
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i] );
        }
        System.out.println(" }");
    }
}