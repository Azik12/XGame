package models

/**
 * Created by Azik12 on 13.03.2015.
 */
case class Gamers(id: Int, Nick: String, Herois: String, Level: Int)
object Gamers {
  var gamers = List(
  Gamers (1, "Alex_24", "Ursa" ,50),
  Gamers (2, "Dandy", "Jager" ,60),
  Gamers (3, "Bilbou", "Kupol" ,70),
  Gamers (4, "Azik12", "Shaman" ,50),
  Gamers (5, "Luna", "Invoker" ,30),
  Gamers (6, "POpI", "Naix" ,50),
  Gamers (7, "Shuter", "Shtorm", 80)
  )
  def findAllGamers = gamers.sortBy(_.Nick)

  def addGamers(id: Int, Nick: String, Herois: String, Level: Int) = {
    val maxId = gamers.map(_.id).max
    gamers = Gamers (maxId, Nick, Herois, Level)::gamers
  }

  def remove(id: Int)={
    gamers = gamers.filter(_.id != id)
  }
}

