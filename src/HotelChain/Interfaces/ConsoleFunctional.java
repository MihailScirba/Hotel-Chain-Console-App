package HotelChain.Interfaces;

import java.util.Scanner;

public interface ConsoleFunctional {
    String RESET = "\033[0m";
    String BLUE_BOLD_BRIGHT = "\033[1;94m";
    String GREEN_BOLD_BRIGHT = "\033[1;92m";
    String RED_BOLD_BRIGHT = "\033[1;91m";
    String CYAN_BOLD_BRIGHT = "\033[1;96m";
    Scanner scanner = new Scanner(System.in);
}
