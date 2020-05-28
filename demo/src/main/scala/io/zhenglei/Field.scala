package io.zhenglei

/**
 * 成员变量的使用
 */
object Field {

  //定义person类
  class Person {
    //定义四字段
    //方式1
    //val name:String = ""
    //方式2
    //var name = ""
    //方式3 下划线给属性赋默认值，下划线只能用于 var
    var name:String = _
    var age = 0
  }

  def main(args: Array[String]): Unit = {
    //创建Person类
    val p = new Person()
    // 赋值
    p.name = "张三"
    p.age = 23

    println(p.name+"____"+p.age)
  }
}
