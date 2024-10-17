package org.jetbrains.scala
package Exercice1
import java.io._
/* Écrire en Python un programme utilisant une
 classe rectangle dont le constructeur prend
 deux paramètres, largeur et hauteur et qui
 offre les fonctions suivantes :
1) calcul du périmètre
2) calcul de la surface
3)  affichage.
 */
class Rectangle(val x:Int, val y:Int) {
  var a=x;
  var b=y;
  def perimetre(): Int={
    (a+b)*2;
  }
  def surface(): Int = {
    a*b;
  }
  def affich(): Unit={
    print("La longueur : " +a);
    print("La largeur : " +b);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val p1 = new Rectangle(2,3);
    println(p1.perimetre());
    println(p1.surface());
    p1.affich();
  }
}
