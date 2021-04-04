package WriteReadFromFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Write {
    public static String fileLocation;
    public static File file ;

    static {
        System.out.println("Enter file location path:");
        Scanner scanner = new Scanner(System.in);
        fileLocation=scanner.next();
        file = new File(fileLocation);
    }


    private static void WriterInFile(Person person) throws IOException {
        String line = person.getName() + " , " + person.getLastname() + " , " + person.getYearOfBirth();
        FileWriter writer = new FileWriter(file, true);
        writer.write(line);
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println();
        printWriter.close();
        writer.close();

    }


    public static void WritePersonInfo() throws IOException {
        boolean finish = false;
        String yearOfBirth;
        Scanner scanner = new Scanner(System.in);
        while (finish == false) {
            Person person = new Person();
            System.out.println("Enter name:");
            person.setName(scanner.next());
            System.out.println("Enter lasname:");
            person.setLastname(scanner.next());
            System.out.println("Enter year of birth:");
            yearOfBirth = scanner.next();
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(yearOfBirth);
            if (m.matches()) {
                person.setYearOfBirth(Integer.parseInt(yearOfBirth));
            } else {
                System.out.println("The year of birth format is incorrect, please ry again.");
                continue;
            }
            Write.WriterInFile(person);
            System.out.println("If you want finish enter true");
            finish = scanner.nextBoolean();

        }

    }
}
