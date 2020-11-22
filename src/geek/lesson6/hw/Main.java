package geek.lesson6.hw;

/*  1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
    2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    * 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
    ** 4. Написать метод, проверяющий, есть ли указанное слово в файлах внутри папки*/



import java.io.*;

import static geek.lesson6.hw.FileWork.*;


public class Main {
    public static void main(String[] args){
        try {
            fileContent("text.txt","The purpose of this series is to teach by example. The plan is to build an application using multiple technologies.");
            fileContent("text1.txt"," These books will document the process, with each book focusing on a specific technology or framework.");
            concat("text.txt","text1.txt");
            System.out.println(fileSearch("text1.txt","the"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


