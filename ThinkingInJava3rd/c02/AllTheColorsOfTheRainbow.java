public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.println("old hue is: " + rainbow.anIntegerRepresentingColors);
        rainbow.changeTheHueOfTheColor(11);
        System.out.println("new hue is: " + rainbow.anIntegerRepresentingColors);
    }
}