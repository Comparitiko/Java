/*
  5. ¿Compilará y funcionará el siguiente código? 
  En caso afirmativo, explica qué mostrará por pantalla.
  En caso negativo, explica por qué no funciona.

  ---------------------------------------------
  int a=’a’;
  System.out.println(a);
  
  No funciona => Se le esta asignando un caracter a una variable que es un entero
  ---------------------------------------------
  int PI=3.14;
  System.out.println(PI);

  No funciona => Se le esta asignando un numero con decimales a una variable que es un entero
  ---------------------------------------------
  double PI=3,14;
  System.out.println(PI);

  No funciona => Se le esta esta pasando a la variable PI 3,14 en vez de 3.14
  ---------------------------------------------
  boolean adivina=(1==4);
  System.out.println(adivina);

  Funciona => mostrara por pantalla un false porque 1 no es igual a 4
  ---------------------------------------------
  boolean adivina=(97==’a’==97);
  System.out.println(adivina);

  No funciona => No se pueden comparar un numero con un string
  ---------------------------------------------
  boolean adivina=(97==’a’==true);
  System.out.println(adivina);

  No funciona => No se pueden comparar un numero con un string
  ---------------------------------------------
 */