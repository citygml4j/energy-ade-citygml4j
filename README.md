# Energy ADE module for citygml4j

This is a citygml4j module for the **Energy Application Domain Extension** (Energy ADE) for CityGML.

:information_source: The Energy ADE module is intended to be used with [citygml4j v2](https://github.com/citygml4j/citygml4j/tree/citygml4j-v2)
and works fine in this context. However, note that citygml4j v2 is in _maintenance mode_ and that the
[current release](https://github.com/citygml4j/energy-ade-citygml4j/releases/latest) of the Energy ADE module
_cannot be used_ with the latest [citygml4j v3](https://github.com/citygml4j/citygml4j) development. There are
currently _no plans to migrate_ the Energy ADE module to citygml4j v3.

## About the module
The Energy ADE extends CityGML by features and properties necessary to perform energy simulations and to store and
exchange the corresponding results. This module adds support for parsing and writing Energy ADE enriched CityGML
datasets to citygml4j. The support is tailored to the **Karlsruhe Institute of Technology (KIT) profile of the
Energy ADE version 1.0**.

* **Energy ADE specification and material: http://www.citygmlwiki.org/index.php/CityGML_Energy_ADE**
* **Where to file issues: https://github.com/citygml4j/energy-ade-citygml4j/issues**

## How to use the module
This module uses the `ADEContext` interface mechanism of citygml4j. Simply register the module with the citygml4j
library to build an Energy ADE application and to read and write Energy ADE datasets.

Registering the Energy ADE module with citygml4j only requires one additional line of code compared to a regular citygml4j
program. Be careful to register the `ADEContext` before creating a `CityGMLBuilder` object.

```java
CityGMLContext context = CityGMLContext.getInstance();

// register i-UR module
context.registerADEContext(new EnergyADEContext());

CityGMLBuilder builder = context.createCityGMLBuilder();
...
```

The Energy ADE module can also be loaded dynamically, for instance, using the Java Service Provider interface.

Once loaded, citygml4j will automatically (de)serialize Energy ADE v1.0 content according to the KIT profile from CityGML
datasets into the model classes defined in the package `org.citygml4j.ade.energy.model`, which extend the predefined
citygml4j model classes. Simply use these classes to build your Energy ADE specific application logic.

## Latest release
The latest stable release of energy-ade-citygml4j is 1.0.4.

Download the energy-ade-citygml4j 1.0.4 release binaries
[here](https://github.com/citygml4j/energy-ade-citygml4j/releases/download/v1.0.4/energy-ade-citygml4j-1.0.4.zip).
Previous releases are available from the [releases section](https://github.com/citygml4j/energy-ade-citygml4j/releases).

## Maven artifact
energy-ade-citygml4j is also available as [Maven](http://maven.apache.org/) artifact from the
[Maven Central Repository](https://search.maven.org/search?q=energy-ade-citygml4j).
To add energy-ade-citygml4j to your project with Maven, add the following
code to your `pom.xml`. You may need to adapt the energy-ade-citygml4j version number.

```xml
<dependency>
  <groupId>org.citygml4j</groupId>
  <artifactId>energy-ade-citygml4j</artifactId>
  <version>1.0.4</version>
</dependency>
```

Here is how you use energy-ade-citygml4j with your Gradle project:

```gradle
repositories {
  mavenCentral()
}

dependencies {
  implementation 'org.citygml4j:energy-ade-citygml4j:1.0.4'
}
```

## Building from source
The Energy ADE module uses [Gradle](https://gradle.org/) as build system. To build the module from source, clone the
repository to your local machine and run the following command from the root of the repository.

    > gradlew build

The script automatically downloads all required dependencies for building the module. So make sure you are connected
to the internet. The build process runs on all major operating systems and only requires a Java 8 JDK or higher to run.

If the build was successful, you will find the JAR file of the Energy ADE module under `energy-ade-citygml4j/build/libs`.

## Publications
- [Agugiaro, G. et al.: The Energy Application Domain Extension for CityGML: enhancing interoperability for urban energy
simulations, Open Geospatial Data, Software and Standards (2018) 3:2](https://doi.org/10.1186/s40965-018-0042-y)
- [Benner, J. et al.: Virtual 3D City Model Support for Energy Demand Simulations on City Level - The CityGML Energy
Extension, Proceedings REAL CORP Conference 2016, Hamburg, 22 - 24 June 2016](http://conference.corp.at/archive/CORP2016_20.pdf)
- [Nouvel, R. et al.: Genesis of the CityGML Energy ADE, Proceedings of the CISBAT International Conference 2015 – 
Lausanne – Switzerland](http://infoscience.epfl.ch/record/213436/files/9_NOUVEL1109.pdf)

## License

The Energy ADE module is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
See the `LICENSE` file for more details.