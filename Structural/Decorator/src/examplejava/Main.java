package examplejava;

import examplejava.datasource.DataSource;
import examplejava.datasource.FileDataSource;
import examplejava.decorators.CompressionDecorator;
import examplejava.decorators.DataSourceDecorator;
import examplejava.decorators.EncryptionDecorator;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Smith, 100000\nSteven Jobs, 912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutPutDemo.txt")
                )
        );
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutDemo.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
