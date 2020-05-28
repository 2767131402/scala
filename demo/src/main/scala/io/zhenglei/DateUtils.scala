package io.zhenglei

import java.text.SimpleDateFormat
import java.util.Date

/**
 * 定义工具类
 * 1. 构造方法私有
 * 2. 成员全部是静态变量
 */
object DateUtils {

  var sdf: SimpleDateFormat = null

  //日期转字符串
  // scala 不用return 返回值，方法最后一行会被自动返回
  def date2Stirng(date: Date, format: String) = {
    sdf = new SimpleDateFormat(format)
    sdf.format(date)
  }

  //字符串转日期
  def string2Date(date: String, format: String) = {
    sdf = new SimpleDateFormat(format)
    sdf.parse(date)
  }

  def main(args: Array[String]): Unit = {
    println(DateUtils.date2Stirng(new Date(), "yyyy-MM-dd"))
    println(DateUtils.string2Date("2020-01-01", "yyyy-MM-dd"))
  }

}
