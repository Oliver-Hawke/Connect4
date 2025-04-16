public class Player {
    
    private String Name; //declare name var
    private char ID; //declare whether "X" or "O" like in tictactoe

    //Player constructor to be called in main
    public Player(String Name, char ID){
        this.Name = Name;
        this.ID = ID;
    }

    //getters
    public String getName(){
        return Name;
    }
    public char getID(){
        return ID;
    }

}
