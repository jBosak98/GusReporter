generateWSDL:
	wsimport ../resources/schema.wsdl -Xnocompile

axisGenerate:
	/usr/local/share/axis2-1.7.9/bin/wsdl2java.sh -uri ../resources/schema.wsdl 

createAllWSDL:
	 wsimport -b ../resources/wsdl/schema.wsdl -B-XautoNameResolution  -extension -J-Djavax.xml.accessExternalSchema=all -J-Djavax.xml.accessExternalDTD=all -keep -verbose -XadditionalHeaders -Xnocompile https://raw.githubusercontent.com/freshmindpl/wyszukiwarkaregon/master/wsdl/UslugaBIRzewnPubl.xsd

