#Como instalar a UDF de criação de usuários no Firebird,

# Introduction #

Oque é uma UDF ?

Uma função definida pelo usuário (UDF) é meramente uma função escrita em qualquer linguagem de programação capaz de gerar uma biblioteca compartilhada. No Windows, essas bibliotecas são mais conhecidas pelo nome de Dynamic Link Libraries (DLL's).

No nosso caso são criados os procedimentos: AddUser, CheckUser, ChangePassword e DeleteUser para cadastro de usuários no Security.fdb

# Details #

  1. "Baixe o projeto Freedom-ERP;
  1. Os arquivos de instalação da UDF são encontrados na pasta src.org.freedom.udf e são específicos para as plataformas Windows e Linux ;
  1. Copie os arquivos stp\_udf\_win.sql, stp\_udf.dll e udfinstall.bat (Windows) para a sub-pasta UDF do Firebird (exemplo: c:\opt\firebird\UDF). Copie os arquivos stp\_udf\_lin.sql, stp\_udf.so e udfinstall.sh (Linux) para a sub-pasta UDF do Firebird (exemplo: /opt/firebird/UDF) ;
  1. Execute o script de instalação udfinstall.bat (Windows) ou udfinstall.sh (Linux);
  1. Caso você tenha instalado o Firebird em outra pasta, altere o script de instalação para apontar para a pasta correta."

Texto adaptado de citação Robson Sanchez em http://groups.google.com/group/freedomerp/browse_thread/thread/3da6eee156e31e28

Referencias externas: http://www.firebase.com.br/fb/artigo.php?id=236