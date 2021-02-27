public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long megaBytes = (long) (kiloBytes / 1024);
            int rem_kiloBytes = (int) (kiloBytes % 1024);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rem_kiloBytes + " KB");
        }
    }
}
