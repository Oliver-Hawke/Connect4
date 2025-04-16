public class Main{
    
    // x&y axis for the board
    static int x = 7; //columns
    static int y = 6; //rows

    
//---------------------------------------------------MAIN METHOD-----------------------------------------
    public static void main(String[] args) throws Exception {
        
        //similar to the tic tac toe game we will make a grid with a 2d array
        char[][] grid = new char[x][y];

        //for each (x,y) value, make a cell.
        for (int ROWS = 0; ROWS < y; ROWS++){
            for (int COLS = 0; COLS < x; COLS++){
                grid[COLS][ROWS] = ' ';
            }
        }
        
        //print method call
        printGame(grid);

    }

//-------------------------------------------THE BOARD SETUP-------------------------------------
    //print method
    static void printGame(char[][] grid){
        
        //add height row separators
        for (int row = 0; row < 7; row++) { //declare row = 0, for each row in height of grid(7) loop, then add 1 to row
            System.out.print("|"); //print rows
            //add width separators
            for (int col = 0; col < 6; col++) { //declare col = 0, for each col in length of grid(6) loop, then add 1 to col
                System.out.print(" " + grid[row][col] + " |");
            }
            System.out.println();
        }
        
        // Print col numbers at the bottom
        System.out.print(" "); //space between numbers
        for (int col = 0; col < 6; col++) { //declare col = 0, for each col in length of grid(6) loop, then add 1 to col
            System.out.print(" " + col + "  "); //print (space, "col number", space)
        }
        System.out.println(); //separate from console for clean look
    }
//--------------------------------THE PLAYERS----------------------------------






//---------------------------------THE MOVE-----------------------------------






}
