public class MegaBytesConverter {

    //Creating the method
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB" +
                    " and " + kb + " KB");
        }
    }
}
