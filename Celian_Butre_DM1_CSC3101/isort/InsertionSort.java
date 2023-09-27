class InsertionSort {
    public static void main(String args[]) {
        int[] sorted = new int[args.length];
        /* for (int i = 0; i < sorted.length; i++) {
            sorted[i] = Integer.parseInt(args[i]);
        } */
        System.out.print("tableau : { " + args[0]);
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
            
            if (i == 0) {
                System.out.print("    Tableau: [?");
            } else {
                System.out.print("    Tableau: [" + sorted[0]);
            }
            
            for (int m = 1; m < sorted.length; m++) {
                if (m < i) {
                    System.out.print(" " + sorted[m]);
                } else {
                    System.out.print(" ?");
                }
            }
            System.out.println("]");
            int dest = i;
            System.out.println("  Étape 1: Trouver la position à laquelle insérer l'élément");
            //System.out.println("c'est bon là");
            for (int j = 0; j < i; j++) {
                //System.out.println("c'est bon");
                if (numb2Place < sorted[j]){
                    dest = j;
                    System.out.println("    Emplacement d'insertion: "+dest+  " (car l'élément " + sorted[dest] + " est plus grand que l'élément " + numb2Place +  " à insérer)");
                    for (int k = i-1; k >= j; k--){
                        sorted[k+1] = sorted[k];
                    }
                    System.out.println("  Étape 2: Décaler d'un cran à droite la partie droite du tableau");
                    System.out.println("    Nombre d'éléments déjà insérés: " + i);
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
                    
                    for (int m = 1; m < sorted.length; m++) {
                        if (m < i+1) {
                            System.out.print(" " + sorted[m]);
                        } else {
                            System.out.print(" ?");
                        }
                    }
                    System.out.println("]");
                    j = i; //break manuel
                }
            }
            //System.out.println("c'est bon ici");
            if (dest == i) {
                //System.out.println("c'est bon?");
                if (i == 0){
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
        //System.out.println("c'est bon ou pas");
        System.out.print("tableau trié : { " + sorted[0]);
        for (int i = 1; i < sorted.length; i++) {
            System.out.print(", " + sorted[i] );
        }
        System.out.println(" }");
    }
}