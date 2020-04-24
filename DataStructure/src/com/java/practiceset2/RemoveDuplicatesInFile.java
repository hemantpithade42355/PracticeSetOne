package com.java.practiceset2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesInFile {

	public static void main(String[] args) throws IOException {
		RemoveDuplicatesInFile duplicate = new RemoveDuplicatesInFile();
		duplicate.removeDuplicateFromFile();
	}

	public void removeDuplicateFromFile() throws IOException {

		try {
			FileReader reader = new FileReader("test.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			StringBuffer sb = new StringBuffer();
			String line;

			List<String> list = new LinkedList<>();
			list.add(bufferedReader.readLine().trim());
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
				System.out.println(line);
				// Iterator<String> itr = list.iterator();
				for (int i = 0; i < list.size(); i++) {
					String str = list.get(i);
					String str2[] = str.split(",");
					String str3[] = line.split(",");
					if (str2[0].trim().equals(str3[0].trim())
							|| str2[0].trim().equals(str3[1].trim())
							&& str2[1].trim().equals(str3[0].trim())
							|| str2[1].trim().equals(str3[1].trim())) {
						break;

					} else {
						list.add(line.trim());
						break;
					}
				}
			}

			Path path = Paths.get("test.txt");
			try (BufferedWriter writer = Files.newBufferedWriter(path)) {
				for (String s : list) {
					writer.write(s);
					writer.newLine();
				}
				System.out.println("Removed");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
