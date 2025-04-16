public class Main{
    
    // x&y axis for the board
    static int x = 7;//coloums
    static int y = 6;//rows
    

    public static void main(String[] args) throws Exception {
        
        //similar to the tic tac toe game we will make a grid with a 2d array
        char[][] grid = new char[x][y];

        //for each (x,y) value, make a cell.
        for (int ROWS = 0; ROWS < y; ROWS++){
            for (int COLS = 0; COLS < x; COLS++){
                grid[ROWS][COLS] = ' ';
            }
        }
        
        //print method call
        printGame(grid);

    }

    //print method
    static void printGame(char[][] grid){
        
    }







}
