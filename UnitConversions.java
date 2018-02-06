import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType;
		
		conversionType = getConversionType();
	}
	
	public static String getConversionType() {
		String str = JOptionPane.showInputDialog("enter conversion type: length, volume, or temperature");
		return str.toLowerCase();
		
	}
}
