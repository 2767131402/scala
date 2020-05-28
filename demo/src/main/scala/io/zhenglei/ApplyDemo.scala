package io.zhenglei

/**
 * apply 避免 new 对象，写法简洁优雅
 */
object ApplyDemo {

  class Person(val name: String = "", val age: Int = 0) {}

  object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)
  }

  def main(args: Array[String]): Unit = {
    val p = Person("张三", 23)
    println(p.name, p.age)
  }

}
