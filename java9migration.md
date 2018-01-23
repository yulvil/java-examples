
# Guides

[Java Platform, Standard Edition Oracle JDK 9 Migration Guide](https://docs.oracle.com/javase/9/migrate/toc.htm#JSMIG-GUID-7744EF96-5899-4FB2-B34E-86D49B2E89B6)

[JDK 9 Outreach](https://wiki.openjdk.java.net/display/Adoption/JDK+9+Outreach)

[3rd party libraries status](https://wiki.openjdk.java.net/display/quality/Quality+Outreach)

[Maven - Older projects with module-info](https://maven.apache.org/plugins/maven-compiler-plugin/examples/module-info.html)

# JAXB

Module java.xml.bind (JAXB) is deprecated and subject to removal
* https://docs.oracle.com/javase/9/docs/api/java.xml.bind-summary.html

Version 2.3.0 is not ready for Java9
* https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
```
jaxb-api-2.3.0.jar                                                                                                                                                                                                                              
Warning: jaxb-api-2.3.0.jar is a multi-release jar file.                                                                                                                                                                                        
All versioned entries are analyzed. To analyze the entries for a specific                                                                                                                                                                       
version, use a newer version of jdeps (JDK 9 or later) "--multi-release" option.
```

Version 2.3.1 should be release soon (as of 2017-12-14)
* https://github.com/javaee/jaxb-v2

Import using maven instead
```
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>
```
