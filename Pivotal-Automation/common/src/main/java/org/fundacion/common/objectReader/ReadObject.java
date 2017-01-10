package org.fundacion.common.objectReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {

  Properties properties = new Properties();

  public Properties getObjectRepository() throws IOException {
    //Read object repository file
    InputStream stream = new FileInputStream(new File(System.getProperty("user.dir").replace("common", "automation") + "\\src\\resource\\configuration\\configurationFile.properties"));
    //load all objects
    properties.load(stream);
    return properties;
  }

}