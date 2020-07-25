package examplejava.datasource;

//Base Interface for file reading and writing operations
public interface DataSource {
    void writeData(String data);

    String readData();
}
