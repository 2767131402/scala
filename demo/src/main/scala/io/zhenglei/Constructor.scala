package io.zhenglei

/**
 * 主构造器
 * 辅构造器：将参数传递给主构造器
 */
object Constructor {

  class Person(val name: String = "张三", val age: Int = 23) {
    println("主构造器....")
  }

  //辅助构造器测试
  class Customer(val name: String = "张三", val address: String = "北京") {
    def this(arr: Array[String]) {
      this(arr(0), arr(1))
      println("辅助构造器....")
    }
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person()
    println(s"p1:${p1.name},${p1.age}")
    val p2 = new Person("李四", 18)
    println(s"p1:${p2.name},${p2.age}")
    val p3 = new Person(age = 30)
    println(s"p1:${p3.name},${p3.age}")

    val c1 = new Customer()
    println(s"c1:${c1.name},${c1.address}")
    val c2 = new Customer(Array("李四","上海"))
    println(s"c2:${c2.name},${c2.address}")
  }
}
