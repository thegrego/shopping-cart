package shop.cart

class ShoppingCart {
  def price(fruits: List[String]) = fruits.map(
    fruit => fruit match {
      case "Apple" => 0.6
      case "Orange" => 0.25
      case _ => 0
    }
  ).sum

}
