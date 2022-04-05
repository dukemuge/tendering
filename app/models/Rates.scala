package models

  case class Rates(lowerLimit: Double,upperLimit:Double, country: String,price:Double,providerName:String)



  object Rates{
      val availableRates=  List(Rates(0,100,"NL",50,"A"),
        Rates(0,100,"NL",50,"A"),
        Rates(101,250,"NL",110,"A"),
        Rates(251,500,"NL",170,"A"),
        Rates(501,750,"NL",290,"A"),
        Rates(751,1000,"NL",650,"A"),
        Rates(0,100,"BE",75,"A"),
        Rates(101,250,"BE",160,"A"),
        Rates(251,500,"BE",240,"A"),
        Rates(501,750,"BE",480,"A"),
        Rates(751,1000,"BE",700,"A"),
        Rates(0,100,"DE",75,"A"),
        Rates(101,250,"DE",160,"A"),
        Rates(251,500,"DE",240,"A"),
        Rates(501,750,"DE",480,"A"),
        Rates(751,1000,"DE",700,"A"))

  }