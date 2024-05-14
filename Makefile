generateJarFiles: generateAllCode
	jar cf oog.jar src/oog/*
	jar cf ooge.jar src/event/*

generateAllCode: generateEventFront generateOggFront generateOggMacros

generateOggFront:
	java -jar lib/sablecc.jar -d src/ building_files/oog.sablecc

generateEventFront:
	java -jar lib/sablecc.jar -d src/ building_files/event.sablecc

generateOggMacros:
	java -jar lib/objectmacro.jar -d src -p oog.macros building_files/oog.objectmacro

deleteGenerated:
	rm -fr src/event/syntax
	rm -fr src/oog/syntax
	rm -fr src/oog/macros
	rm -fr oog.jar
	rm -fr ooge.jar
