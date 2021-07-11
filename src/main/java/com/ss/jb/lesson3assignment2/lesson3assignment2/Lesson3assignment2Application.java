package com.ss.jb.lesson3assignment2.lesson3assignment2;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Lesson3assignment2Application {

	public static void main(String[] args) {
		System.out.println("Please input your directory path.");
		Scanner pathInput = new Scanner(System.in);
		String filePath = pathInput.nextLine();
		System.out.println("Please input the text you would like to add.");
		Scanner textInput = new Scanner(System.in);
		String addedText = textInput.nextLine();
		pathInput.close();
		textInput.close();
		try {
			String text = new String(Files.readAllBytes((Paths.get(filePath))));
			text = text + addedText;
			File f = new File(filePath);
			FileWriter fw = new FileWriter(f.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text);
			bw.close();
			System.out.println("Done.");
		} catch (IOException e){
			e.printStackTrace();
		 };
	};
};