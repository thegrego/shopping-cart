package shop.cart

import org.scalatest.FlatSpec

class ShoppingCartSpec extends FlatSpec {
  "Total price for aplles and orange" should "be 2.05" in {
    val fruits = List("Apple", "Apple", "Orange", "Apple")
    val shoppingCart = new ShoppingCart

    assert(shoppingCart.price(fruits) === 2.05)
  }

}
