package lessons.lesson26_serialization._01_remaind;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final String PATH_TO_INPUT = "src\\lessons.lesson26_serialization\\_01_remaind\\resourses\\test.file";
    private static final String PATH_TO_OUTPUT = "src\\lessons.lesson26_serialization\\_01_remaind\\resourses\\output.file";

    public static void main(String[] args) {

//        try (Scanner scanner = new Scanner(new FileInputStream(PATH_TO_INPUT));
//             OutputStream os = new FileOutputStream(PATH_TO_OUTPUT)) {
//            while (scanner.hasNextLine()) {
//                byte[] bytes = scanner.nextLine().getBytes();
//                os.write(bytes);
//                os.write("\n".getBytes());
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedReader br = new BufferedReader(new FileReader(PATH_TO_INPUT));
             Stream<String> stream = br.lines();
             OutputStream os = new FileOutputStream(PATH_TO_OUTPUT)) {
            String collect = stream.collect(Collectors.joining("\n"));
            os.write(collect.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
