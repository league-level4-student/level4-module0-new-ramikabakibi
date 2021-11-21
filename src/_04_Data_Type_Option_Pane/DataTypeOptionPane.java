package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
	
	enum DataType{
		BYTE(8), SHORT(16), INT(32), LONG(64), FLOAT(32), DOUBLE(64), BOOLEAN(1), CHAR(16);
		private int bits;
		
		private DataType(int bits) {
			this.bits=bits;
		}
		public int getBits() {
			return this.bits;
		}
	}
    public static void main(String[] args) {

        DataType[] dataTypes=DataType.values();
        //ON NUMBER 6, NEED TO CREATE AN OPTION DIALOG USING THE DATATYPES ARRAY AS THE 
        //PARAMETER ARRAY, LOOK AT THE LINK ON THE DIRECTIONS FOR HOW TO MAKE A OPTION DIALOG
        //BASIALLY NEED TO DISPLAY THE DIFFERENT THINGS INSIDE THE DATATYPE ARRAY ON EACH BUTTON
        //AND EACH ONE CORRESPONDS TO THE ENUM'S NUMBER OR SOMETHING LIKE THAT
    }
    
}
