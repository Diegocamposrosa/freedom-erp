# Introdução #
> Detalha a instalação:


# Java 1.5 ou superior #
## Debian/Ubuntu ##

Em sistemas linux é muito comum o uso da maquina virtual java OpenJDK porem o Freedom rodando com a OpenJDK pode apresentar algum comportamento anormal. Deste modo segue o procedimento de instalação da maquina virtual da sun:


No ubuntu 10.04 a Canonical retirou os packages da Sun do repositório principal, Multiverse, para incentivar o uso do OpenJDK. De modo que devemos adicionar o Lucid antes de prosseguir com a instalação.

```
sudo add-apt-repository "deb http://archive.canonical.com/ lucid partner"
```

Em seguida atualize com o comando update seus repositórios que faz com que o apt-get verifique todos os repositórios disponíveis e baixe a lista com os pacotes disponíveis em cada um. Baixando assim a lista do repositório que acabamos de adicionar.
```
sudo apt-get update
```

Em seguida instale o Java
```
sudo apt-get install sun-java6-jdk
```

Aceite os termos e tudo pronto.

Ainda pode ocorrer de vc ter duas versões instaladas, rode o comando:
```
sudo update-alternatives --config java 
```

E selecione a maquina virtual da Sun.


# Firebird 1.5.x #

## Instalação do Firebird disponivel na aba downloads do code ##

http://freedom-erp.googlecode.com/files/ubuntu.zip

instale todos os .deb


ou:
## Instalação do Firebird Super Server v1.5.6 (Último da Serie 1.5). com NPTL ##

### O que é o NPTL? ###

The Native POSIX Thread Library (NPTL) is a software feature that enables the Linux kernel to run programs written to use POSIX Threads efficiently.

  * In tests, NPTL succeeded in starting 100,000 threads on a IA-32 in two seconds. In comparison, this test under a kernel without NPTL would have taken around 15 minutes. [1](1.md)[2](2.md) [wikipedia](http://en.wikipedia.org/wiki/Native_POSIX_Thread_Library)
  * NPTL, também conhecido como Native POSIX Thread Library, é o novo sistema de threading do kernel 2.6. O NPTL promete melhor compatibilidade com o padrão POSIX, maior escalabilidade e maior desempenho na criação e destruição de threads, colocando o Linux em pé de igualdade com os Unix comerciais em termos de alto desempenho (e custando muuuuuuuuito menos! :-) [Viva o Linux](http://www.vivaolinux.com.br/artigo/NPTL-ExecShield-e-outros-palavroes-que-fazem-seus-programas-crasharem/?pagina=1)

### Seu sistema tem NTPL? ###

Facil:


```
getconf GNU_LIBPTHREAD_VERSION
saida algo como: *NPTL 2.10.1*
```

### Instalação ###
  1. Instalando a dependência libstdc++5 para o Firebird.
```
wget http://ftp.br.debian.org/debian/pool/main/g/gcc-3.3/libstdc++5_3.3.6-18_i386.deb

p/ 64 bits:

wget http://ftp.br.debian.org/debian/pool/main/g/gcc-3.3/libstdc++5_3.3.6-18_amd64.deb
 
sudo dpkg -i libstdc++5_3.3.6-18_i386.deb
```
  1. Instalando o Firebird Super Server v1.5.6 (Último da Serie 1.5).
```
wget http://ufpr.dl.sourceforge.net/project/firebird/firebird-linux-i386/1.5.6-Release/FirebirdSS-1.5.6.5026-0.nptl.i686.tar.gz
tar -zxvf FirebirdSS-1.5.6.5026-0.nptl.i686.tar.gz
cd FirebirdSS-1.5.6.5026-0.i686
```

  1. IMPORTANTE: Para **UBUNTU** -> Abra o arquivo **scripts/postinstall.sh** com seu editor preferido
    * Vá para a linha 82 e **delete o "-M"**

  1. Finalizando:
```
sudo ./install.sh
Firebird super 1.5.6.5026-0.i686 Installation
Press Enter to start installation or ^C to abort  [ENTER]
Extracting install data
Starting Firebird server: server has been successfully started
Please enter new password for SYSDBA user:

Install completed
```

# FreedomERP Compilado p/ Linux #