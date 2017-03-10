package misc

import common._

object TD7 {
  /**
   * Nom  :
   * Sujet:
   */

  /**
   * P01
   *
   * Ecrivez une fonction P01 qui supprime les éléments consécutifs dupliqués.
   * Si une liste contient plusieurs éléments égaux répétés, ils doivent êtres remplacés par une seule occurrence de l’élément.
   * L’ordre des éléments ne doit pas être modifié.
   *
   * Exemple :
   *
   * scala> P01(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * P02
   *
   * Ecrivez une fonction P01 qui regroupe les éléments consécutifs dupliqués dans des sous-liste.
   * Si une liste contient des éléments répétés, ils doivent être placé dans des sous-listes séparées.
   *
   * Exemple :
   *
   * scala> P02(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * P03
   *
   * Implémentez une méthode de compression telque
   * Les éléments consécutifs dupliqués sont encodés comme des tuples (N, E), où N est le nombre d’occurrences de l’élément E.
   *
   * Exemple :
   *
   * scala> P03(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * P04
   *
   * Implémentez une méthode qui extraie une partie d’une liste.
   * Soit deux indices I et K, retournez une sous-liste comprenant les éléments entre (et incluant)
   * le Ième et le Kème (exclu). Commencez à comptez à 0.
   *
   * Exemple :
   *
   * scala> P04(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   * res0: List[Symbol] = List('d, 'e, 'f, 'g)
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * P05
   *
   * Implémentez une méthode qui faites une rotation de liste N fois à gauche.
   *
   * Exemples:
   *
   * scala> P05(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
   *
   * scala> P05(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * P06
   * Implémentez une méthode qui décode une liste telle que celles retournées par la fonction du problème P03.
   *
   * Exemple :
   *
   * scala> P06(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
   * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
   *
   */
  
  /**
   * Explications:
   * 
   */

  
  
  /**
   * B01
   * On utilisant la fonction foldLeft ou foldRight
   * Ecrivez une methode encode qui transforme
   * List(1, 2, 2, 2, 2, 2, 3, 2, 2) en List((1, 1), (2, 5), (3, 1), (2, 2))
   */
  
  /**
   * B02
   * On utilisant la fonction foldLeft ou foldRight et fill
   * Ecrivez une methode decode 
   * transforme List((1, 1), (2, 5), (3, 1), (2, 2)) en List(1, 2, 2, 2, 2, 2, 3, 2, 2) 
   */
  
}
