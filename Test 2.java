/*
 *Test
 *Version 1.0
 *Copyright Margaret M. Curtis
 *CSC 171 Fall 2014
 *Project 01
 *Margaret M. Curtis
 *Thursday 4:50-6:05 P.M
 *
 *Last Revised: October 21,2014
 */
import java.io.*;//import io, util, swing to use
import java.util.*;
import javax.swing.*;

public class Test //start of class
{
	public static void main(String[] args) throws Exception//start of main method
	{
		JFileChooser fileChooser=new JFileChooser();//creates new filechooser- http://stackoverflow.com/questions/8402889/working-with-jfilechooser-getting-access-to-the-selected-file
		if (fileChooser.showOpenDialog(null)==fileChooser.APPROVE_OPTION)//opens window to select file
		{
			File selectedfile= fileChooser.getSelectedFile();//chooses file that user clicks
			Scanner scan=new Scanner(selectedfile);//import scanner-http://www.journaldev.com/867/how-to-read-file-in-java-using-bufferedreader-scanner-files-with-encoding-support-and-filereader
			while(scan.hasNextLine())//reads next line
			{
				String line=scan.nextLine();//scans lines
				String[] array=line.split("[,]");//splits where comma-http://stackoverflow.com/questions/19431710/splitting-an-array-of-strings-in-java-using-split
				String[] array2=array[0].split("[/]");//splits where "/"
				String[] array3=array[1].split("[/]");
				Rational rat1=new Rational(Double.parseDouble(array2[0]),Double.parseDouble(array2[1]));//parse double
				Rational rat2=new Rational(Double.parseDouble(array3[0]),Double.parseDouble(array3[1]));
				System.out.println(rat1.addition(rat2)+", "+ rat1.subtraction(rat2)+", "+rat1.multiplication(rat2)+", "+rat1.division(rat2)+", "+rat1.equals(rat2)+", "+rat1.compareTo(rat2)+".");//prints rational values
			}
			scan.close();//close scanner
		}//end main method
		if(fileChooser.showOpenDialog(null)==fileChooser.APPROVE_OPTION)//exactly the same as previous if
		{
			File selectedfile=fileChooser.getSelectedFile();
			Scanner scan=new Scanner(selectedfile);
			while(scan.hasNextLine())
			{
				String line=scan.nextLine();
				String[] array=line.split("[,]");//split array for formatting and separating evaluation
				String[] array2=array[0].split("[(]");//split where "("
				String[] array3=array[1].split("[(]");
				array2=array2[1].split("[)]");//...split where ")"
				array3=array3[1].split("[)]");
				
				array2=array2[0].split("[;]");//split where ";"
				array3=array3[0].split("[;]");
				Imaginary im1=new Imaginary(Double.parseDouble(array2[0]),Double.parseDouble(array2[1]));//parse doubles
				Imaginary im2=new Imaginary(Double.parseDouble(array3[0]),Double.parseDouble(array3[1]));
				System.out.println(im1.addition(im2)+", "+im1.subtraction(im2)+", "+im1.multiplication(im2)+", "+im1.division(im2)+", "+im1.equals(im2)+", "+im2.getRadius(im1)+", "+im2.getAngle(im1)+"\n");//prints all values
				}
			scan.close();//close scanner
		}
	}
	}
	
