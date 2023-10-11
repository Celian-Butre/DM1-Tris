class BubbleSort {
    public static void main(String args[]) {
        double[] tab = { 2.3, 17.0, 3.14, 8.83, 7.26 }; //l'énoncé nous dit d'utiliser ce tableau

         //print du tableau avant le tri

        System.out.print("tableau : { " + tab[0]); //tab[0] affiché pour gérer le nombre inférieur de virgules
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i] );
        }
        System.out.println(" }");
        //triage de tableau
        double save = 0; //initialisation de la variable qui sert pour faire les swaps
        for (int i = tab.length - 1; i >= 0 ; i--) {//i = l'indice de la plus grande case non triée, sert pour les preuves de correction (invariant de boucle)
            for (int j = 0; j < i; j++) { //pour chaque case non triée (sauf la dernière)
                if (tab[j] >= tab[j+1]){ //si son suivant est plus petit
                    //inversion
                    save = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = save;
                }
            }
        }
        //même technique d'impression mais une fois le tableau trié
        System.out.print("tableau trié : { " + tab[0]);
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i] );
        }
        System.out.println(" }");
    }
}