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
        int answer= JOptionPane.showOptionDialog(null, "Pick one option to learn about it", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dataTypes, null);
        
        switch(dataTypes[answer]) {
        
        case BYTE:
        	JOptionPane.showMessageDialog(null, "A "+dataTypes[answer]+  " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case SHORT:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case INT:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case LONG:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case FLOAT:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case DOUBLE:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case BOOLEAN:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        case CHAR:
        	JOptionPane.showMessageDialog(null, "A "+ dataTypes[answer]+ " has "+dataTypes[answer].getBits()+ " bits");
        	break;
        }
    }
    
}
