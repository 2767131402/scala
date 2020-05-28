package io.zhenglei.demo

object For extends App {

  val arrs = 1 to 10
  for(i <- arrs){
    print(i)
  }

  for(i <- 1 to 10 if i%3==0){
    println(i)
  }

  // yield 将返回值构建成一个集合再返回
  val v = for(i <- 1 to 10) yield i*10
  println(v)
}
