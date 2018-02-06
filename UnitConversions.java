import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType = ""
		String conversionOperation = "";

		conversionType = getConversionType();

		switch (conversionType) {
		case "length":
			conversionOperation = getCentimetersOrInches();
			break;
		case "volume":
			conversionOperation = getLitersOrGallons();
			break;
		case "temperature":
			conversionOperation = getCelsiusorFarenheit();
			break;
		}
		
		switch (conversionOperation) {
		case "Centimeters to Inches":
			break;
		case "Inches to Centimeters":
			break;
		case "Liters to Gallons":
			break;
		case "Gallons to Liters":
			break;
		case "Celsius to Farenheit":
			break;
		case "Farenheit to Celsius":
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
		String[] options = { "Centimeters to Inches", "Inches to Centimeters" };
		int n = JOptionPane.showOptionDialog(null, "", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		return options[n];

	}

	public static String getLitersOrGallons() {
		String[] options = { "Liters to Gallons", "Gallons to Liters" };
		int n = JOptionPane.showOptionDialog(null, "", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		return options[n];

	}

	public static String getCelsiusorFarenheit() {
		String[] options = { "Celsius to Farenheit", "Farenheit to Celsius" };
		int n = JOptionPane.showOptionDialog(null, "", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);

		return options[n];
	}
}