package example;

import example.dialogs.Dialog;
import example.dialogs.WebDialog;
import example.dialogs.WindowsDialog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    private static Dialog dialog;

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String fileName = bufferedReader.readLine();
        initialize(fileName);
        dialog.render();
    }

    private static void initialize(String fileName) {
        switch (fileName) {
            case "Windows":
                dialog = new WindowsDialog();
                break;
            case "Web":
                dialog = new WebDialog();
                break;
            default:
                System.out.println("Exception");
        }
    }
}
