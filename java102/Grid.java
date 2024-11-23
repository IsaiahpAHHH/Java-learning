package java102;

import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;
    public static int maxside = 0;

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
        if (this.sideLength > maxside){
            maxside = this.sideLength;
        }
       
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
		}
	}

	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
    public ArrayList<T> diagonal(Grid<T> gridd) {
        int numberLoops = this.sideLength;
        ArrayList<T> diags = new ArrayList<>();
        for(int lops = 0; lops < numberLoops; lops++) {
            for(int lips = 0; lips <numberLoops; lips++){
                diags.add(gridd.get(lops,lips));
            }
        }
        return diags;
//heres ur nonstatic function! it doesnt workm in the main file cause main is static but i assume it would work in a non static file ig
    }
    public static int maxSideLength(){
        return maxside;
    }
//this is cheating but idc
}