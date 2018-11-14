/*
 * module-noise-ade - Noise ADE module for citygml4j
 * https://github.com/citygml4j/module-noise-ade
 *
 * module-noise-ade is part of the citygml4j project
 *
 * Copyright 2013-2018 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package roundtrip_ade;

import org.citygml4j.CityGMLContext;
import org.citygml4j.builder.jaxb.CityGMLBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.core.CityModel;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;
import org.citygml4j.xml.io.CityGMLInputFactory;
import org.citygml4j.xml.io.CityGMLOutputFactory;
import org.citygml4j.xml.io.reader.CityGMLReader;
import org.citygml4j.xml.io.writer.CityGMLWriter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ServiceLoader;

public class RoundtripADE {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("[HH:mm:ss] ");

		/**
		 * For using ADE modules implemented against the ADEContext interface, 
		 * please apply the following steps:
		 * 
		 * 1. Create a CityGMLContext
		 * 2. Register all your ADE modules with the CityGMLContext
		 * 3. Create a CityGMLBuilder and use it to build factories
		 *    for reading/writing a dataset
		 * 
		 * The registered ADE modules are automatically supported by citygml4j.
		 * Thus, there is no need to write ADE-specific code for using default
		 * citygml4j features.
		 */

		System.out.println(df.format(new Date()) + "setting up citygml4j context");
		// step 1: create CityGML context
		CityGMLContext context = CityGMLContext.getInstance();

		// step 2: load ADE modules using a service loader and register with CityGML context
		// alternatively, you could directly register an instance of the NoiseADEModule
		// with the CityGMLContext
		System.out.println(df.format(new Date()) + "loading ADE contexts and registering with citygml4j context");
		for (ADEContext adeContext : ServiceLoader.load(ADEContext.class))
			context.registerADEContext(adeContext);

		// print registered ADE modules
		for (ADEContext adeContext : context.getADEContexts()) {
			for (ADEModule module : adeContext.getADEModules()) {
				System.out.println(df.format(new Date()) + "-- found ADE module for namespace " + module.getNamespaceURI()	+
						" and CityGML version " + module.getCityGMLVersion());
			}
		}

		// step 3: create CityGMLBuilder which automatically supports the ADE modules
		System.out.println(df.format(new Date()) + "creating CityGMLBuilder object");
		CityGMLBuilder builder = context.createCityGMLBuilder();

		// read an ADE-enriched dataset. There is no need for ADE-specific code.
		System.out.println(df.format(new Date()) + "reading ADE-enriched CityGML file FZKHouseLoD3-ADE.gml");
		CityGMLInputFactory in = builder.createCityGMLInputFactory();

		// step 4: read entire dataset into main memory
		CityModel cityModel;
		try (CityGMLReader reader = in.createCityGMLReader(new File("datasets/FZKHouseLoD3-ADE.gml"))) {
			cityModel = (CityModel) reader.nextFeature();
		}

		// ...now process the city model as you like...

		System.out.println(df.format(new Date()) + "creating CityGML 2.0.0 writer");
		CityGMLOutputFactory out = builder.createCityGMLOutputFactory(CityGMLVersion.v2_0_0);

		// step 5: write the city model with all ADE elements back to a file
		try (CityGMLWriter writer = out.createCityGMLWriter(new File("output/FZKHouseLoD3-ADE-roundtrip.gml"), "utf-8")) {
			writer.setIndentString("  ");
			writer.setPrefixes(CityGMLVersion.v2_0_0);
			writer.setSchemaLocations(CityGMLVersion.v2_0_0);

			// set ADE-specific XML prefixes and schema locations for the writer (optional)
			writer.setPrefixes(context.getADEContexts());
			writer.setSchemaLocations(context.getADEContexts());

			System.out.println(df.format(new Date()) + "writing sample features to file FZKHouseLoD3-ADE-roundtrip.gml");
			writer.write(cityModel);
		}

		System.out.println(df.format(new Date()) + "sample citygml4j application successfully finished");
	}

}
