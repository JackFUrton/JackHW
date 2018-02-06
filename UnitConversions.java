import javax.swing.JOptionPane;

public class UnitConversions {
	public static void main(String[] args) {
		String conversionType;

		conversionType = getConversionType();
	}

	public static String getConversionType() {
		String[] options = { "length", "volume", "temperature" };
		int n = JOptionPane.showOptionDialog(null, "Which unit of measure? ", "Integer Math",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		
		return options[n];


	}
}