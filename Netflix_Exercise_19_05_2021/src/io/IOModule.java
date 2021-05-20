package io;

import java.util.Scanner;

public class IOModule {

    public void write(String text) {
        System.out.println(text);
    }

    private String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
