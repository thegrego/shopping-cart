package shop.cart

import org.scalatest.FlatSpec

class ShoppingCartSpec extends FlatSpec {
  "Total price for aplles and orange" should "be 2.05" in {
    val shoppingCart = new ShoppingCart
    val fruits = List("Apple", "Apple", "Orange", "Apple")

    assert(shoppingCart.price(fruits) === 2.05)
  }

  "Total price after offers for apples and oranges" should "be 2.2" in {
    val fruits = List("Apple", "Apple",  "Apple", "Orange", "Orange", "Orange", "Orange", "Orange")
    val shoppingCart = new ShoppingCart
    val offers: Map[String, Tuple2[Int, Int]] = Map("Apple" -> (2, 1), "Orange" -> (3, 2))
    assert(shoppingCart.price(fruits, offers) === 2.2)
  }

  "Total price after offers for apples and oranges" should "be 1.1" in {
    val fruits = List("Apple", "Orange", "Orange")
    val shoppingCart = new ShoppingCart
    val offers: Map[String, Tuple2[Int, Int]] = Map("Apple" -> (2, 1), "Orange" -> (3, 2))
    assert(shoppingCart.price(fruits, offers) === 1.1)
  }
}
