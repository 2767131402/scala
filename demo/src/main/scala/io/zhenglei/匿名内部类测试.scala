package io.zhenglei

object 匿名内部类测试 {

  abstract class Animals {
    //动物类的两个属性，名字和年龄
    var name = ""
    var age = 0

    //定义公共方法--跑步
    def run = println("动物会跑步...")

    //定义抽象方法--吃
    def eat()
  }

  class Cat extends Animals {
    //重写方法
    override def eat(): Unit = println("猫吃鱼...")

    //定义 独有本领

    def eatHourse = println("猫抓老鼠")
  }

  class Dog extends Animals {
    //重写方法
    override def eat(): Unit = println("狗吃肉...")

    //定义 独有本领
    def lookHome = println("狗看家")
  }

  def main(args: Array[String]): Unit = {
    val c = new Cat()
    c.name = "Tom"
    c.age = 10
    println(c.name, c.age, c.eat(), c.eatHourse)

    val d = new Dog()
    d.name = "Dog"
    d.age = 11
    println(d.name, d.age, d.eat(), d.lookHome)
  }
}
