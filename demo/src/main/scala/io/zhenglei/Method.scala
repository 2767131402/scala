package io.zhenglei

/**
 * 定义成员方法
 */
object Method {

  //格式：
  //def 方法名(参数1:数据类型,参数2:数据类型):[return type]={

  //}

  class Customer {
    var name = ""
    var age = 0

    def preHandller(msg: String): String = {
      return name + "____" + age
    }

    //大括号可以省略不写
    def printLine(msg: String) = {
      println(msg)
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Customer()
    p.name = "张三"
    p.age = 23
    p.printLine("哈哈哈哈")
    val data = p.preHandller(null)
    println(data)

  }

}
