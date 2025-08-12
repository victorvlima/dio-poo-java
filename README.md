# dio-poo-java
Desafio de Projeto - Programação Orientada a Objetos com Java

🐧 Instalando JDK no Ubuntu - Guia Completo
Vou mostrar todas as formas de instalar o JDK no Ubuntu:

📦 Método 1: OpenJDK via APT (Recomendado)
Instalação do OpenJDK 21 (LTS mais recente):
bash
Copiar

# Atualizar repositórios
sudo apt update

# Instalar OpenJDK 21
sudo apt install openjdk-21-jdk

# Verificar instalação
java -version
javac -version
Outras versões disponíveis:
bash
Copiar

# OpenJDK 17 (LTS)
sudo apt install openjdk-17-jdk

# OpenJDK 11 (LTS)
sudo apt install openjdk-11-jdk

# OpenJDK 8 (LTS)
sudo apt install openjdk-8-jdk

# Listar todas as versões disponíveis
apt search openjdk-.*-jdk

# Ctrl+Shift+X → Pesquisar "Extension Pack for Java" → Install
Extension Pack for Java

# Spring Boot Extension Pack (se for usar Spring)
code --install-extension Pivotal.vscode-spring-boot

# GitLens (controle de versão avançado)
code --install-extension eamodio.gitlens

# Bracket Pair Colorizer (colorir chaves/parênteses)
code --install-extension CoenraadS.bracket-pair-colorizer

# Auto Rename Tag
code --install-extension formulahendry.auto-rename-tag

# Material Icon Theme (ícones bonitos)
code --install-extension PKief.material-icon-theme

# SonarLint (análise de código)
code --install-extension SonarSource.sonarlint-vscode

# Checkstyle (padrões de código)
code --install-extension shengchen.vscode-checkstyle

# SpotBugs (detecção de bugs)
code --install-extension spotbugs.spotbugs