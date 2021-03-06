/**
 * <h1>Board</h1>
 * <p>
 * <b> tsopeter@ku.edu </b>
 * </p>
 * <p>
 * The Board.java file handles the char[][] map object. It allows to fill in the
 * board with char board_marker and allows to add to board, get from board, and
 * get the dimensions of the board.
 *
 * It has two copy functions, It has getCopyBoard(), this passes an instance of
 * a Board Object that has the same value as this object It has getCopyMap(),
 * this passes an instance of a char[][] Objec that has the same value as
 * this.map Object.
 * </p>
 * <p>
 * <b> Note: </b>
 * </p>
 * <ul>
 * <li>There are no protections from OutOfBounds. Please implement protections
 * on your own code when using Board.java.</li>
 * </ul>
 * <p>
 * <b> Thank you. </b>
 * </p>
 * <p>
 *
 * @author tsopeter
 * @version 20200913
 * @since 09-05-2020
 * @since 09-08-2020
 * @since 09-13-2020
 *        </p>
 *        <p>
 *        <b> References: </b>
 *        </p>
 *        <ul>
 *        <li>https://www.tutorialspoint.com/java/java_documentation.html</li>
 *        <li>
 *        https://docs.oracle.com/javase/8/docs/technotes/tools/winodws/javadoc.html
 *        </li>
 *        </ul>
 */
public class Board {

	char[][] map;
	int xSize;
	int ySize;

	char board_marker;

	/**
	 * Must have valid dimensions and board marker
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have strictly positive x and y
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Makes a map with x and y dimensions
	 * </p>
	 *
	 * @param x              Int
	 * @param y              Int
	 * @param t_board_marker Char
	 */
	public Board(int x, int y, char t_board_marker) {
		this.xSize = 0;
		this.ySize = 0;
		this.board_marker = '\0';

		this.xSize = x;
		this.ySize = y;

		this.board_marker = t_board_marker;

		this.map = new char[this.ySize][this.xSize];
		for (int i = 0; i < this.ySize; i++) {
			for (int k = 0; k < this.xSize; k++) {
				this.map[i][k] = this.board_marker;
			}
		}
	}

	/**
	 * This returns this map object
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns this.map Object
	 * </p>
	 *
	 * @return char[][]
	 */
	public char[][] getBoard() {
		return this.map;
	}

	/**
	 * This returns a copy of the Map
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns a copy of this.map with char[][] copy
	 * </p>
	 *
	 * @return char[][]
	 */
	public char[][] getCopyMap() {
		char[][] copy = new char[this.ySize][this.xSize];
		for (int i = 0; i < this.ySize; i++) {
			for (int k = 0; k < this.xSize; k++) {
				copy[i][k] = this.map[i][k];
			}
		}
		return copy;
	}

	/**
	 * This returns a copy of the Board
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns a copy of this object with Board
	 * </p>
	 *
	 * @return Board
	 */
	public Board getCopyBoard() {
		Board copy = new Board(this.xSize, this.ySize, this.board_marker);
		for (int i = 0; i < this.ySize; i++) {
			for (int k = 0; k < this.xSize; k++) {
				copy.addMarker(this.map[i][k], i, k);
			}
		}
		return copy;
	}

	/**
	 * This returns the X size of the array
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns the x dimension
	 * </p>
	 *
	 * @return int
	 */
	public int getXSize() {
		return this.xSize;
	}

	/**
	 * This returns the Y size of the array
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns the y dimension
	 * </p>
	 *
	 * @return int
	 */
	public int getYSize() {
		return this.ySize;
	}

	/**
	 * This method adds to the Map
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed Must have valid address
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Adds a character to the map Object
	 * </p>
	 *
	 * @param marker Char
	 * @param x      Int
	 * @param y      Int
	 */
	public void addMarker(char marker, int x, int y) {
		this.map[y][x] = marker;
	}

	/**
	 * This method gets a character from Map
	 * <p>
	 * <b> Preconditions: </b>
	 * </p>
	 * <p>
	 * Must have been constructed Must have valid address
	 * </p>
	 * <p>
	 * <b> Postconditions: </b>
	 * </p>
	 * <p>
	 * Returns a character from a (x,y) position of map
	 * </p>
	 *
	 * @param x Int
	 * @param y Int
	 * @return char
	 */
	public char getMarker(int x, int y) {
		return this.map[y][x];
	}
}
