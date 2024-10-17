package org.jetbrains.scala
package Exercice1
/* Écrivez un programme en Python qui
définit une classe appelée Forme avec un
 constructeur qui donne de la valeur à la
 largeur(x) et à la hauteur(y). Définir
 la méthode aire() dans les deux sous-classes
Triangle et Rectangle, qui calculent l’aire.
Dans la méthode principale main, définissez
deux variables, un triangle et un rectangle,
puis appelez la fonction aire() dans ces
deux variables.
Notez que:
l’aire du triangle est = largeur * hauteur / 2
l’aire du rectangle est = largeur * hauteur.
 */

class Forme (val larg:Int, val haut:Int){
  var largeur = larg;
  var hauteur = haut;
}

class Rectangle1(larg:Int, haut:Int) extends Forme(larg, haut){
  def aire() : Int={
    largeur*hauteur;
  }
}

object Main2 {
  def main(args : Array[String]): Unit = {
    val r1 = new Rectangle1(2,3);
    print(r1.aire());
  }
}
