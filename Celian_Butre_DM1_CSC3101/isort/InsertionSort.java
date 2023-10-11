class InsertionSort {
    public static void main(String args[]) {
        int[] sorted = new int[args.length];
        
        //print du tableau avant le tri

        System.out.print("tableau : { " + args[0]);//tab[0] affiché pour gérer le nombre inférieur de virgules
        for (int i = 1; i < args.length; i++) {
            System.out.print(", " + args[i] );
        }
        System.out.println(" }");

        //triage de tableau
        for (int i = 0; i < args.length; i++) { //i = le nombre de chiffres bien placées
            int numb2Place = Integer.parseInt(args[i]);
            System.out.println("Insertion de l'élément " + numb2Place + ":");
            System.out.println("  État initial:");
            System.out.println("    Nombre d'éléments déjà insérés: " + i);
            
            if (i == 0) { //pour gérer le premier point d'interrogation s'il est en position 0
                System.out.print("    Tableau: [?");
            } else {
                System.out.print("    Tableau: [" + sorted[0]);
            }
            
            for (int m = 1; m < sorted.length; m++) { //impression des éléments triés puis des points d'interrogations
                if (m < i) {
                    System.out.print(" " + sorted[m]);
                } else {
                    System.out.print(" ?");
                }
            }
            System.out.println("]");


            int dest = i; //variable qui stock l'emplacement du premier élément plus grand que l'élément à placer (s'il n'y en a pas, c'est l'emplacement du premier point d'interrogation)
            System.out.println("  Étape 1: Trouver la position à laquelle insérer l'élément");
            for (int j = 0; j < i; j++) {
                if (numb2Place < sorted[j]){ //si le numéro à la case j est finalement plus grand que le nombre à placer (cette action n'a lieu qu'une fois grâce au break manuel à la fin du if)
                    dest = j;
                    System.out.println("    Emplacement d'insertion: "+dest+  " (car l'élément " + sorted[dest] + " est plus grand que l'élément " + numb2Place +  " à insérer)");
                    //décalage de tout les éléments plus grand que le numéro à placer d'une case vers la droite
                    for (int k = i-1; k >= j; k--){
                        sorted[k+1] = sorted[k];
                    }
                    System.out.println("  Étape 2: Décaler d'un cran à droite la partie droite du tableau");
                    System.out.println("    Nombre d'éléments déjà insérés: " + i);
                    
                    
                    //Impression du tableau dans son état décalé mais sans le numéro à placer
                    System.out.print("    Tableau: [" + sorted[0]);
                    for (int m = 1; m < sorted.length; m++) {
                        if (m < i+1) {
                            System.out.print(" " + sorted[m]);
                        } else {
                            System.out.print(" ?");
                        }
                    }
                    System.out.println("]");



                    System.out.println("  Étape 3: Insérer l'élément " + numb2Place);
                    int iPlusUn = i+1;
                    System.out.println("    Nombre d'éléments déjà insérés: " + iPlusUn);
                    sorted[j] = numb2Place;
                    System.out.print("    Tableau: [" + sorted[0]);
                    
                    //impression du tableau avec le numéro placé
                    for (int m = 1; m < sorted.length; m++) {
                        if (m < i+1) {
                            System.out.print(" " + sorted[m]);
                        } else {
                            System.out.print(" ?");
                        }
                    }
                    System.out.println("]");


                    j = i; //pour sortir de la boucle car on a finit de placer le chiffre à placer
                }
            }
            if (dest == i) { //Si jamais tout les nombres déjà placés sont plus petit que le nombre à placer
                if (i == 0){ //disjonction de dialogue si c'est le premier élément (car on ne peut comparer avec aucun nombre déjà placé)
                    System.out.println("    Emplacement d'insertion: "+dest+  " (car la liste est encore vide)");
                } else {
                    System.out.println("    Emplacement d'insertion: "+dest+  " (car le plus grand élément déjà placé est " + sorted[dest-1] + " et est plus petit que l'élément à insérer " + numb2Place + ")");
                }


                System.out.println("  Étape 2: Décaler d'un cran à droite la partie droite du tableau (Rien à faire)");
                System.out.println("  Étape 3: Insérer l'élément " + numb2Place);
                int iPlusUn = i+1;
                System.out.println("    Nombre d'éléments déjà insérés: " + iPlusUn);
                sorted[i] = numb2Place;
                System.out.print("    Tableau: [" + sorted[0]);
                

                //impression du tableau avec le numéro inséré au bout de la partie déjà trié
                for (int m = 1; m < sorted.length; m++) {
                    if (m < i+1) {
                        System.out.print(" " + sorted[m]);
                    } else {
                        System.out.print(" ?");
                    }
                }
                System.out.println("]");
            }
        }

        //même technique d'impression mais une fois que le tableau est trié
        System.out.print("tableau trié : { " + sorted[0]);
        for (int i = 1; i < sorted.length; i++) {
            System.out.print(", " + sorted[i] );
        }
        System.out.println(" }");
    }
}