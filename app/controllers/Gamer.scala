package controllers

import play.api.mvc.{Action, Controller}
import  models.Gamers
/**
 * Created by Azik12 on 13.03.2015.
 */
object Gamer extends Controller{
  def showGamers = Action {
    Ok(views.html.gamer(Gamers.findAllGamers))
  }
}

