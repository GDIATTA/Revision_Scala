package org.jetbrains.scala
package Exercice1
import scala.io.StdIn.readLine
import scala.util.{Try, Success, Failure}

object Exerc {
  val greeting = "Hello, world!";
  def main(args: Array[String]): Unit= {
    println("Bonjour Codeur");
  }
  /*Créez un programme qui crée et initialise
  un tableau, puis inversez ce tableau sans
  utiliser un tableau supplémentaire.
   */
  {
    var nbelt =0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer le nb elt : ");
        nbelt = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un entier valid!");
      }
    }
    val tab = new Array[Int](nbelt);
    for(i <- 0 until nbelt){
      validInput =false;
      while(!validInput){
        try{
          tab(i)=readLine().toInt;
          validInput = true;
        }catch {
          case _:NumberFormatException =>
            println("Entrer un entier valid!");
        }
      }
    }
    var lastind = 0;
    var firstind = nbelt-1;
    var interm = 0;
    while(lastind < firstind){
      interm = tab(lastind);
      tab(lastind) = tab(firstind);
      tab(firstind) = interm;
      lastind+=1;
      firstind-=1
    }
    for(i <- 0 until nbelt){
      println(tab(i));
    }
  }


  /*Créez un programme Python qui crée et
  initialise un tableau,puis supprimez les
   éléments en double dans ce tableau.

  {
    var nbelt =0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer le nb elt : ");
        nbelt = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un entier valid!");
      }
    }
    val tab = new Array[Int](nbelt);
    for(i <- 0 until nbelt){
      validInput =false;
      while(!validInput){
        try{
          tab(i)=readLine().toInt;
          validInput = true;
        }catch {
          case _:NumberFormatException =>
            println("Entrer un entier valid!");
        }
      }
    }
    var i = 0;
    var actual = nbelt;
    while(i < actual){
      var j = i+1;
      while(j < actual){
        if(tab(i)== tab(j)){
          for (k <- j until actual -1){
            tab(k)=tab(k+1);
          }
          actual -=1;
        }
        else {
          j += 1;
        }
        }
      i +=1;
      }

    for(i <-0 until actual) {
      println(tab(i))
    }
  }
   */


  /* Créez un programme Python qui crée et
  initialise un tableau, puis trouve la fréquence
  de chaque élément de ce tableau.
  {
    var nbelt =0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer le nb elt : ");
        nbelt = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un entier valid!");
      }
    }
    val tab = new Array[Int](nbelt);
    for(i <- 0 until nbelt){
      validInput =false;
      while(!validInput){
        try{
          tab(i)=readLine().toInt;
          validInput = true;
        }catch {
          case _:NumberFormatException =>
            println("Entrer un entier valid!");
        }
      }
    }
    for(i <- 0 until nbelt){
      var cpt = 1;
      for(j <-i+1 until nbelt){
        if(tab(i)==tab(j)) {
          cpt+=1;
        }
      }
      println("ELt " +tab(i)+ " apparaisse : " +cpt);
    }
  }
   */



  /* Écrivez un programme Python pour déclarer
   un tableau, puis saisissez ses éléments à
    partir de l'utilisateur et recherchez
    l'élément le plus grand et le deuxième
    dans ce tableau.

  {
    var nblet = 0;
    var validInput = false;
    while(!validInput){
      try {
        print("Entrer le nb elt : ");
        nblet = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un nbr entier valid!");
      }
    }
    val tab = new Array[Int](nblet);
    for (i <- 0 until nblet){
      validInput=false;
      while(!validInput){
        try {
          print("Entrer un elt i : ");
          tab(i)=readLine().toInt;
          validInput=true;
        }catch {
          case _:NumberFormatException =>
            println("Entrer un entier valid!");
        }
      }

    }
    var max1=tab(0);
    var max2=tab(0);
    var inter = 0;
    for(i <- 1 until nblet){
      if(max1 < tab(i)){
        inter = max1;
        max1 = tab(i);
        max2 = inter;
      }
    }
    println(max1);
    println(max2);

  }
   */
  /* Écrivez un programme Python pour déclarer un tableau,
   puis saisissez ses éléments par l'utilisateur et affichez
    tous les éléments négatifs.
  {
    var nbelt = 0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer le nbre elt : ");
        nbelt = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un nbr entier valid !");
      }
      val tab = new Array[Int](nbelt);
      for(i <- 0 until nbelt){
        tab(i)=readLine().toInt;
      }
      for(i <- 0 until nbelt){
        if(tab(i) < 0){
          println(tab(i));
        }
      }
    }

  }
   */
  /* Écrivez un programme Python pour déclarer
  et initialiser un tableau, puis saisissez ses
   éléments à partir de l'utilisateur et affichez
    le tableau.
  {
    var nbelt =0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer le nombre d'élément du tableau : ");
        nbelt = readLine().toInt;
        validInput =true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un nombre entier valid!");
      }
    }
    val tab = new Array[String](nbelt);
    for (i <- 0 until nbelt){
      tab(i)= readLine();
    }
    for (i <- 0 until nbelt ){
      println(tab(i));
    }

  }
   */

  /*
  Écrivez un programme Python, entrez deux nombres de l'utilisateur et
   trouvez le plus grand diviseur commun en utilisant la boucle for.
  {
    var nb1 = 0;
    var nb2 = 0;
    var validInput = false;
    while (!validInput) {
      try {
        println("Entrer un nombre entier nb1 :");
        nb1 = readLine().toInt;
        println("Entrer un nombre entier nb2 :");
        nb2 = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Veuillez entrer des nombres entiers");
      }
    }
    var nb3 = Math.min(nb1,nb2);
    var pgcd=0;
    for (i <- 1 to nb3){
      if(nb1%i==0 && nb2%i==0){
        pgcd=i;
      }
    }
    println(pgcd);
  }
  }
  */
  /*
  {
    var val1 =0;
    var validInput = false;
    while(!validInput){
      try{
        println("Entrer un nombre : ");
        val1 = readLine().toInt;
        validInput = true;
      }catch {
        case _: NumberFormatException =>
          println("Veuillez entrer un nombre entier.");
      }
    }
    if(val1 <0){
      println(-val1);
    }
    else{
      println(val1);
    }
  }
  }
   */
  /*
  {
    var nt = 0;
    var validInput = false;
    while(!validInput){
      try {
      print("Veuillez entrer un nombre entier compris entre 0 et 20: ")
      nt = scala.io.StdIn.readInt() // Read input as integer
      if (nt >= 0 && nt <= 20) {
        validInput = true
      } else {
        println("Le nombre doit être compris entre 0 et 20.")
      }
    } catch {
      case _: NumberFormatException =>
        println("Veuillez entrer un nombre entier valide.") // Handle non-integer input
    }
  }
    if (nt > 10){
      println("Validé");
    }
    else{
        println("Perdu");
      }
  }
  }
   */
  /*
  {
    var nb1: Int = 0
    var nb2: Int = 0
    var nb3 = 0;
    var validInput = false

    // Loop until valid integers are provided
    while (!validInput) {
      try {
        // Accepting integer input
        print("Entrer nb1 : ")
        nb1 = readLine().toInt
        print("Entrer nb2 : ")
        nb2 = readLine().toInt
        print("Entrer nb3 : ");
        nb3 = readLine().toInt;
        validInput = true  // Exit loop if both inputs are valid integers
      } catch {
        case _: NumberFormatException =>
          println("Veuillez entrer des nombres entiers.")  // Handles non-integer input
      }
    }

    // Multiply the two numbers
    var max = nb1;
    if (nb2 > max && nb2 > nb3){
      print(nb2);
    }
    else if (nb3 > max && nb3 > nb2){
      print(nb3);
    }
    else{
      print(max);
    }
  }
   */

}
