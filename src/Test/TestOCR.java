package Test;

import java.io.File;  
import java.io.IOException;

import ocr.OCR;  
  


public class TestOCR {
	 public static void main(String[] args) {  
	        String path = "E://ImageRecognitionTest//1.jpg";  //C://temp//OCRcode//4.png 
	        System.out.println("ORC Test Begin......");
	        try { 
	            String valCode = new OCR().recognizeText(new File(path), "jpg");       
	            System.out.println(valCode);       
	        } catch (IOException e) {       
	            e.printStackTrace();       
	        } catch (Exception e) {    
	            e.printStackTrace();    
	        }         
	        System.out.println("ORC Test End......");  
	    }   
	
}
