import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType = "";
		String conversionOperation = "";
		double input = 0;
		double output = 0;
		String startingUnit = "";
		String finalUnit = "";

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
			startingUnit = "centimeters";
			finalUnit = "inches";
			break;
		case "Inches to Centimeters":
			startingUnit = "inches";
			finalUnit = "centimeters";
			break;
		case "Liters to Gallons":
			startingUnit = "liters";
			finalUnit = "gallons";
			break;
		case "Gallons to Liters":
			startingUnit = "gallons";
			finalUnit = "liters";
			break;
		case "Celsius to Farenheit":
			startingUnit = "degrees celsius";
			finalUnit = "degrees farenheit";
			break;
		case "Farenheit to Celsius":
			startingUnit = "degrees farenheit";
			finalUnit = "degrees celsius";
			break;
		}
		
		input = Double.parseDouble(JOptionPane.showInputDialog("How many " + finalUnit + "?"));
		
		switch (conversionOperation) {
		case "Centimeters to Inches":
			break;
		case "Inches to Centimeters":
			output = input * 2.54;
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
		
		JOptionPane.showMessageDialog(null, "" + input + " " + startingUnit + " is equal to " + output + " " + finalUnit + ".");
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