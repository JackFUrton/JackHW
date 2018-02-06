import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType;
		String finalUnit;
	
		conversionType = getConversionType();
		
		switch(conversionType) {
		case "length":
			finalUnit = getCentimetersOrInches();
			break;
		case "volume":
			finalUnit = getLitersOrGallons
			break;
		case "temperature":
			finalUnit = getCelsiusorFarenheit
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

   public static String getLitersorGallons() {
		String[] options = {"Liters to Gallons", "Gallons to Liters" };
		int n = JOptionPane.showOptionDialog(null, "", "",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            
   public static String getCelsiusorFarenheit() {
		String[] options = {"Celsius to Farenheit", "Farenheit to Celsius" };
		int n = JOptionPane.showOptionDialog(null, "", "",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
		return options[n];
	}
}
