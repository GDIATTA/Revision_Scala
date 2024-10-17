package org.jetbrains.scala
package Exercice1
import scala.io.StdIn.readLine

/* Réaliser en Python  une classe point permettant
 de manipuler un point d'un plan.on prévoira :
1) un point est définit par ses coordonnées x et
 y (des membres privés)
2) les constructeurs
3) une fonction membre déplace effectuant une
translation définie par ses deux arguments dx
et dy (double)
4)une fonction membre affiche se contentant
d'afficher les coordonnées cartésiennes du point.
5)une fonction membre saisir se contentant de
saisir les coordonnées cartésiennes du point.
6)une fonction membre distance effectuant
calculant la distance entre deux point.
7)une fonction membre milieu donnant le milieu
d'un segment.
8)un petit programme d'essai (main) gérant la
 classe point.
 */

class Point (val xc:Int, val yc:Int){
  var x = xc;
  var y = yc;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
  }

  def affich(): Unit = {
    print(x, y);
  }
  def saisir(): Unit = {
    var x =0;
    var y= 0;
    var validInput = false;
    while(!validInput){
      try{
        print("Entrer x : ");
        x = readLine().toInt;
        print("Entrer y : ");
        y = readLine().toInt;
        validInput = true;
      }catch {
        case _:NumberFormatException =>
          println("Entrer un entier valid!");
      }
    }
  }
  def distance(p: Point): Double = {
    val x1 = (x-p.x)*(x-p.x);
    val y1 = (y-p.y)*(y-p.y);
    math.sqrt(x1+y1);
  }
  def milieu(p: Point): Point ={
    val p1 = new Point(0,0);
    p1.x = (x+p.x)/2;
    p1.y = (y+p.y)/2;
    p1;
  }


}

object Main1 {
  def main(args : Array[String]): Unit = {
    val p = new Point(1,1);
    var x = new Point(5,5);
    var c = new Point(0,0);
    p.affich();
    p.move(5,5);
    p.affich();
    print("La distance px est :" +p.distance(x));
    c=p.milieu(x);
    print("Le milieu de px est : " +c.x,c.y);
  }
}
