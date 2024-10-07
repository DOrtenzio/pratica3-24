package squadra;

public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;

    //Metodi get e set
    public int getGoal() { return goal; }
    public String getNome() { return nome; }
    public boolean isCapitano() { return capitano; }

    public void setCapitano(boolean capitano) { this.capitano = capitano; }
    public void setGoal(int goal) { this.goal = goal; }
    public void setNome(String nome) { this.nome = nome; }

    //Costruttori
    public Giocatore(){
        nome=null;
        capitano=false;
        goal=0;
    }
    public Giocatore(String nome){
        this.nome=nome;
        capitano=false;
        goal=0;
    }
    public Giocatore(boolean capitano){
        nome=null;
        this.capitano=capitano;
        goal=0;
    }
    public Giocatore(int goal){
        nome=null;
        capitano=false;
        this.goal=goal;
    }
    public Giocatore(String nome, boolean capitano){
        this.nome=nome;
        this.capitano=capitano;
        goal=0;
    }
    public Giocatore(String nome, int goal){
        this.nome=nome;
        capitano=false;
        this.goal=goal;
    }
    public Giocatore(boolean capitano, int goal){
        nome=null;
        this.capitano=capitano;
        this.goal=goal;
    }
    public Giocatore(String nome,boolean capitano, int goal){
        this.nome=nome;
        this.capitano=capitano;
        this.goal=goal;
    }

    public boolean controllaCapitani (Giocatore [] squadra, int indexInseriti){
        for (int i=0;i<indexInseriti;i++){
            if ( squadra[i].isCapitano() )
                return true;
        }
        return  false;
    }
}

