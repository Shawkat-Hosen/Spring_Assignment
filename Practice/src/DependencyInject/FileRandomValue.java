package DependencyInject;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileRandomValue implements FortuneServiceInterface {	

		private String fileName = "src/Abc.txt";
		private List<String> theFortunes;
		// create a random number generator
		private Random myRandom = new Random();
		
		@PostConstruct
		public void FileRan() {
			File theFile = new File(fileName);			
			System.out.println("Reading fortunes from file: " + theFile);
			System.out.println("File exists: " + theFile.exists());			
			// initialize array list
			theFortunes = new ArrayList<String>();			
			// read fortunes from file
			try (BufferedReader br = new BufferedReader(
					new FileReader(theFile))) {
				String tempLine;
				while ((tempLine = br.readLine()) != null) {
					theFortunes.add(tempLine);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public String  wishLuck(){
			return null;
			
		}
		
		@Override
		public String randomShow() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String rdValue() {
			int index = myRandom.nextInt(theFortunes.size());
			String tempFortune = theFortunes.get(index);
			return tempFortune;
		}

}
