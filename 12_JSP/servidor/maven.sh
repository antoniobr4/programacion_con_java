mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate -DarchetypeArtifactId="maven-archetype-webapp" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4" -DgroupId="com.antoniobr4" -DartifactId="$1"
mkdir $1/vscode
cp ../.vscode/*.* $1/vscode
mv $1/vscode $1/.vscode

#Creo la estrcutura de carpeta que falta para las clases Java
mkdir -p $1/src/main/java/modules

#Creo las carpetas assets para imagenes y estilos css
mkdir -p $1/src/main/webapp/assets/css
mkdir -p $1/src/main/webapp/assets/img

#Abrimos vs code desde la carpeta del proyecto
cd $1
code .


