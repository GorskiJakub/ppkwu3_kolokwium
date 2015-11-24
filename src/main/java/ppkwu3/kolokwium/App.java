package ppkwu3.kolokwium;


import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import bibliotekaSzyfr.Szyfr;
import biblioteki.FileTypeDetermine;

public class App 
{
    public static void main( String[] args ) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, IOException
    {
    	System.out.println("Podaj sciezke do pliku");
    	Scanner s = new Scanner(System.in);
    	String pathToCheckType = s.next();
    	
    	FileTypeDetermine.getFileTypeFromPath(pathToCheckType);
    	try {
			FileTypeDetermine.previewFile(pathToCheckType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String FileName = "encryptedtext.txt";
        String FileName2 = "decryptedtext.txt";
        String pass = "test1";
        String secretID="sekret";
    	
    	//Szyfr.szyfrowanie(FileName, pass, secretID );
	    //Szyfr.deszyfrowanie(FileName2, pass, secretID);
    	
    }
}
