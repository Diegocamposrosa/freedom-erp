

# Baixando, sincronizando e compilando o código fonte do Freedom ERP (Windows) ? #
(cc-by-sa) - Jonatas dos Anjos - jonataz @ gmail . com

## 1 - Baixe e instale o Java JDK6 do site da sun em: ##

```
http://java.sun.com/javase/downloads/widget/jdk6.jsp
```

![https://sites.google.com/site/freedomimgs/home/page_down_java.png](https://sites.google.com/site/freedomimgs/home/page_down_java.png)


### Click em (Continue) ###

![https://sites.google.com/site/freedomimgs/home/page_log_java.png](https://sites.google.com/site/freedomimgs/home/page_log_java.png)

### Irá aparece a tela acima, basta fecha-la e download começará, quando terminar basta instala-lo! ###

## 2 - Baixe o Eclipse SDK e salve-o na pasta C:\opt\: ##

```
http://eclipse.c3sl.ufpr.br/eclipse/downloads/drops/R-3.5.1-200909170800/eclipse-SDK-3.5.1-win32.zip

Descompacte-o dentro da pasta!

Execute o arquivo C:\opt\eclipse\eclipse.exe

```

### Irá aparace a opção para selecionar o Workspace ###

![https://sites.google.com/site/freedomimgs/home/workspace.png](https://sites.google.com/site/freedomimgs/home/workspace.png)

```
Coloque Workspace: 
C:\opt\eclipse\workspace

Com o Eclipse aberto vá em:

Window > Preferences > Java > Installed JRE

Selecione o jre6 e click em (Edit)
Alterer o JRE name para: jdk1.5.x
```

![https://sites.google.com/site/freedomimgs/home/installed_jre.png](https://sites.google.com/site/freedomimgs/home/installed_jre.png)


## 3 - Instalado o Mylyn no Eclipse: ##

```
Vá em:  Help > Install New Software

Em Work with: http://download.eclipse.org/tools/mylyn/update/e3.4 (ENTER)

Selecione as 3 opções:

(x) Mylyn Features
(x) Mylyn Integration
(x) Mylyn Plug-in Development
```

### Click em:  ( Next > ) ###

![https://sites.google.com/site/freedomimgs/home/mylyn.png](https://sites.google.com/site/freedomimgs/home/mylyn.png)

### ( Next > ) ###

```
(x) I accept the terms of the licence agreements
```
> ### ( Finish ) ###

### Após concluir a instalação do Mylyn é preciso reiniciar o Eclipse: ###

```
Click em ( Yes )
```

## 4 - Instalando o Subclipse no Eclipse: ##

```
Vá em:  Help > Install New Software

Em Work with: http://subclipse.tigris.org/update_1.6.x (ENTER)

Selecione as 3 opções:

(x) Core SVNKit Library
(x) Optional JNA Library (recommended)
(x) Subclipse

```

### Click em: ( Next > ) ###

![https://sites.google.com/site/freedomimgs/home/subclipse.png](https://sites.google.com/site/freedomimgs/home/subclipse.png)

### ( Next > ) ###

```
(x) I accept the terms of the licence agreements
```
> ### ( Finish ) ###

### Irá aparecer um aviso de segurança! ###

### ( ok ) para continuar. ###

### Após concluir a instalação do Subclipse é preciso reiniciar o Eclipse ###

### ( Yes ) ###

## 5 - Adicionando o repositório e baixando o código fonte ##

```
Vá em: File > New > Other SVN > Checkout Projects from SVN
```

### (Next >) ###
```
[x] Create a new repository location                                         
```

### (Next >) ###

```
Url: http://freedom-erp.googlecode.com/svn/trunk
```

### (Next >) ###

### Selecione os seguintes projetos: ###
```
freedom
freedom-ecf
freedom-fw1
freedom-infra
freedom-nfe
```

### (Finish) ###

![https://sites.google.com/site/freedomimgs/home/repositorio.png](https://sites.google.com/site/freedomimgs/home/repositorio.png)


## 6 - Compilando o Freedom (gerando os jar´s) ##

```
Vá no projeto: freedom > lib > jardesc 

Selecione todos os arquivos .jardesc

Click com botão direito do mouse e vá em Create JAR.

Quando terminar de gerar os JAR´s aparecerá um aviso, é só clickar em ( ok ) e pronto!
```


![https://sites.google.com/site/freedomimgs/home/compilando.png](https://sites.google.com/site/freedomimgs/home/compilando.png)



## 7 - Colocando os arquivos para produção ##

### Dentro de C:\opt crie a pasta freedom com as seguintes subpastas: ###

```
C:\opt\freedom
             |- bin
             |- lib
             |- ini
             |- log
             |- icones

Copie todas os arquivos .bat dentro de C:\opt\eclipse\workspace\freedom\lib\exec para C:\opt\freedom\bin 

Os arquivos .jar dentro de C:\opt\eclipse\workspace\freedom\lib (incluido o javax.comm.properties) e dentro C:\opt\eclipse\workspace\freedom-fw1\lib para a pasta C:\opt\freedom\lib

Copie e renomeie o arquivo C:\opt\eclipse\workspace\freedom\freedomwin.ini para C:\opt\freedom\ini\freedom.ini

Copie os arquivos .ico de C:\opt\eclipse\workspace\freedom\icones\novos\ico para C:\opt\freedom\icones

```


[cc-by-sa ](.md) - Jonatas dos Anjos - jonataz @ gmail . com