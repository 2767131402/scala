package io.zhenglei

object 匿名内部类 {

  //定义抽象类
  abstract class Person {
    def sayHelo()
  }

  def show(p: Person) = println("hello word")

  def main(args: Array[String]): Unit = {
    new Person {
      override def sayHelo(): Unit = println("匿名内部类的使用")
    }.sayHelo()

    //匿名内部类 可以作为方法的参数传入
    val p:Person = new Person {
      override def sayHelo(): Unit = println("匿名内部类的使用")
    }
    show(p)

  }

}
