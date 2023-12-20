# Use uma imagem base do OpenJDK
FROM openjdk:11

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie os arquivos Maven para o contêiner
COPY target/URLPhraseAnalyzer.jar /app/app.jar

# Comando para executar o aplicativo quando o contêiner iniciar
CMD ["java", "-jar", "app.jar"]
