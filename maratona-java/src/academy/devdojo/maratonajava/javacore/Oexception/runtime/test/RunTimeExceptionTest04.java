package src.academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Dentro do FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Dentro do IOException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

//        try {
//           talvezLanceException();
//       } catch (SQLException | IOException | IllegalArgumentException e) {
//           System.out.println("Dentro do SQLException | IOException | IllegalArgumentException");
//       } catch (RuntimeException e) {
//           System.out.println("Dentro do RuntimeException");
//       }
//    }
//
//    private static void talvezLanceException() throws SQLException, IOException, IllegalArgumentException {
//
//    }
    }
}

