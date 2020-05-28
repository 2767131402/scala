package io.zhenglei

/**
 * 方法转函数：
 * val 变量 = 方法名+空格+下划线
 */
object Method2Function {

  //定义函数
  val sum = (x: Int, y: Int) => x + y

  //定义方法
  def summation(x: Int, y: Int) = x + y

  def main(args: Array[String]): Unit = {
    val s = sum(1, 2)
    println(s)

    //方法转函数
    val sn = summation _
    val sn_sum = sn(2,3)
    println(sn_sum)
  }

}
