package io.zhenglei

/**
 * scala中避免 一个类中既有静态变量又有成员变量：为了实现静态和非静态的分离
 * 伴生对象的使用:
 * 伴生类和伴生对象中的内容可以相互调用(private[this] 除外)
 */
object GeneralsDemo {

  //定义伴生类
  class Generals{
    def toWar() = println(s"张三拿着${Generals.name}出去了")
    //伴生类 获取不到伴生对象的 names 属性，因为names 修饰词是 private[this] ：只能在本类中使用
  }
  //定义伴生对象
  object Generals{
    private val name = "大刀"
    private[this] val names = "小刀"
  }

  def main(args: Array[String]): Unit = {
    val c = new Generals()
    c.toWar()
  }
}
