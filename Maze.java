public class Maze{
    private int[][] maze;
    
    public Maze(int length, int width){
		maze = new int[ length][ width];
   	 }

    public int numOfRows(){
		return maze.length;
	}
	
	public int numOfColumns(){
		return maze[0].length;
	}
	
	public String toString(){
		System.out.println( "This maze is of size" + this.numberOfRows() + this.numberOfColumns());
	}
}
