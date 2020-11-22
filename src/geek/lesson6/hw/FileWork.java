/*  1.Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
    2.Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
*   3.Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).*/

package geek.lesson6.hw;

import java.io.*;

public class FileWork {
    public static void fileContent(String fileName, String text) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(fileName))) {
            wr.write(text);
        }
        fos.flush();
        fos.close();
        }

    public static void concat(String fileinone, String fileintwo) throws IOException {
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(String.valueOf(fileinone), true));
        BufferedInputStream read = new BufferedInputStream(new FileInputStream(fileintwo));
        int ch;
        while ((ch = read.read()) != -1) {
            out.write(ch);
        }
        out.flush();
        out.close();
        read.close();
        }
    

    public static boolean fileSearch(String fileName, String wordSearch) throws IOException {
        FileInputStream fis = new FileInputStream(new File(fileName));
        byte[] fileText = new byte[fis.available()];
        fis.read(fileText);
        fis.close();
        String[] lines = new String(fileText).split("\n");
        for (String line : lines) {
            String[] words = line.split(" ");
             for (String word : words) {
                 if (word.equalsIgnoreCase(wordSearch)) {
                    return true;
                }
            }
        }
        return false;
        }

}







