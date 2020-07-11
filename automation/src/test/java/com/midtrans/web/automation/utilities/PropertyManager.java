package com.midtrans.web.automation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Satish Garnayak
 * This class is used for reading property from properties file
 */
public class PropertyManager {

		   public static Properties readPropertiesFile(String fileName) throws IOException {
		      FileInputStream fis = null;
		      Properties prop = null;
		      try {
		         fis = new FileInputStream(fileName);
		         prop = new Properties();
		         prop.load(fis);
		      } catch(FileNotFoundException fnfe) {
		         fnfe.printStackTrace();
		      } catch(IOException ioe) {
		         ioe.printStackTrace();
		      } finally {
		         fis.close();
		      }
		      return prop;
		   }
		}

