/*
  5. ¿Compilará y funcionará el siguiente código? 
  En caso afirmativo, explica qué mostrará por pantalla.
  En caso negativo, explica por qué no funciona.

  ---------------------------------------------
  int a='a';
  System.out.println(a);
  
  Funciona => Devuelve el codigo ASCII del caracter 'a'
  ---------------------------------------------
  int PI=3.14;
  System.out.println(PI);

  Funciona => Mostrara por pantalla un 3 porque  al ser tipo int no coge los decimales
  ---------------------------------------------
  double PI=3,14;
  System.out.println(PI);

  No funciona => Se le esta esta pasando a la variable PI 3,14 en vez de 3.14
  ---------------------------------------------
  boolean adivina=(1==4);
  System.out.println(adivina);

  Funciona => mostrara por pantalla un false porque 1 no es igual a 4
  ---------------------------------------------
  boolean adivina=(97=='a'==97);
  System.out.println(adivina);

  No funciona => No se pueden comparar un numero con un caracter con un numero a la vez sin poner un AND
  ---------------------------------------------
  boolean adivina=(97=='a'==true);
  System.out.println(adivina);

  Funciona => Mostrara por pantalla true
  ---------------------------------------------
 */