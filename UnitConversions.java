import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType;
		String conversionOperation;
	
		conversionType = getConversionType();
		
		switch(conversionType) {
		case "length":
			conversionOperation = getCentimetersOrInches();
			break;
		case "volume":
			// code to ask....
			break;
		case "temperature":
			// code to ask c or f
			break;
		}
	}

	public static String getConversionType() {
		String[] options = { "length", "volume", "temperature" };
		int n = JOptionPane.showOptionDialog(null, "Which unit of measure? ", "Conversion Type",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		
		return options[n];
	}
	
	public static String getCentimetersOrInches() {
		String[] options = {"Centimeters to Inches", "Inches to Centimeters" };
		int n = JOptionPane.showOptionDialog(null, "", "",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		
		return options[n];
	}
}