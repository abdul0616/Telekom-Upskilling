

public class Enum {
    enum Color {
        RED("#FF0000"),
        GREEN("#008000"),
        BLUE("#0000FF"),
        YELLOW("#FFFF00"),
        BLACK("#000000");

        String colorCode;

        Color(String colorCode) {
            this.colorCode = colorCode;
        }

        public String getColorCode() {
            return colorCode;
        }
    }

    public static void printColorNCode() {
        for (Color myColor : Color.values()) {
            System.out.println("Color is: " + myColor + " and Color code is: " + myColor.getColorCode());
        }
    }

    public static void main(String[] args) {
        printColorNCode();
    }

}