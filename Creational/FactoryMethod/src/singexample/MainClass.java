package singexample;

import singexample.musicians.Composer;
import singexample.musicians.Musician;
import singexample.musicians.Singer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    private static Musician musician;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String musicianRole = reader.readLine();

        configMusician(musicianRole);
        musician.performComposition();

    }

    private static void configMusician(String musicianRole) {
        switch (musicianRole) {
            case "Singer":
                musician = new Singer();
                break;
            case "Composer":
                musician = new Composer();
                break;
            default:
                System.out.println("Exception!");
        }
    }

}
