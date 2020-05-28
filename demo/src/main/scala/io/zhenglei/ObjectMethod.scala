package io.zhenglei

/**
 * 在单例对象中定义成员方法
 */
object ObjectMethod {

  //定义成员方法
  def printLine(msg: String) = {
    println("=" * 5 + msg + "=" * 5)
  }

  def main(args: Array[String]): Unit = {
    ObjectMethod.printLine("测试哈哈哈")
  }
}
