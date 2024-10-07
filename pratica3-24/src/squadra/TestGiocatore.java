package squadra;

import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Giocatore [] squadra=new Giocatore[100];
        int scelta, indexInseriti=0, gol;

        do {
            System.out.println("Scegli una fra le sceguenti opzioni: " +
                    "\n 0) aggiungere un giocatore alla squadra;" +
                    "\n 1) visualizzare tutti i giocatori della squadra;" +
                    "\n 2) modificare i dati di un giocatore a scelta;" +
                    "\n 3) cancellare un giocatore dalla squadra;" +
                    "\n 4) visualizzare i giocatori che hanno realizzato più di 5 goal;" +
                    "\n 5) visualizzare il nome del capitano;" +
                    "\n 6) assegnare il ruolo di capitano in modo casuale se non ancora presente.");
            scelta=Integer.parseInt(in.next());
            switch (scelta){
                case 0:
                    System.out.println("Stai inserendo un nuovo giocatore: \n Inseriti il suo nome:");
                    squadra[indexInseriti]=new Giocatore(in.next());
                    do {
                        System.out.println("Inserire il numero di goal: ");
                        gol=Integer.parseInt(in.next());
                        if (gol<0)
                            System.out.println("Inserire numero corretto di gol");
                    }while (gol<0);
                    squadra[indexInseriti].setGoal(gol);
                    if (!squadra[indexInseriti].controllaCapitani(squadra,indexInseriti)) {
                            System.out.println("E' capitano? true/false");
                            squadra[indexInseriti].setCapitano(in.nextBoolean());
                    }
                    System.out.println("Inserito");
                    break;
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Selezionare solo un'opzione tra quelle proposte.");
            }
        }while (scelta!=7);
    }
}