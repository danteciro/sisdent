/*
 * Created on 24/04/2012
 * Copyright (c) Rimac Seguros S.A.
 */
package mr_tooth.utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;


public class Parametros {
	Properties defaultProperties;

	public Parametros() {
		inicializa();
	}

	public void inicializa() {
		if (defaultProperties == null) {
			defaultProperties = new Properties();
			try {
				// prod E:\\malko\\SIS_DENTAL\\appDental\\
				File file = new File("src\\main\\resources\\dental_es.properties");
				
				if (file.isFile()) {
					InputStream propStream = new FileInputStream(file);
					defaultProperties.load(propStream);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String getProperty(String key) {
		String propiedad = null;
		propiedad = defaultProperties.getProperty(key);
		return propiedad;
	}
}
