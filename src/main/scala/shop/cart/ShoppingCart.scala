package shop.cart

class ShoppingCart {
  def price(fruits: List[String], offers: Map[String, Tuple2[Int, Int]] = Map("" -> (1, 1))) =
    fruits
      .groupBy(x => x)
      .map(
        fruit => fruit match {
          case ("Apple", list) => offer(list.size, offers.get("Apple"), 0.6)
          case ("Orange", list) => offer(list.size, offers.get("Orange"), 0.25)
          case _ => 0
        }
      ).sum

  private def offer(amount: Int, offerDetails: Option[Tuple2[Int, Int]], price: Double): Double = {
    val (offerRate, priceRate) = offerDetails.getOrElse((1, 1))
    amount / offerRate * priceRate * price + amount % offerRate * price
  }
}
