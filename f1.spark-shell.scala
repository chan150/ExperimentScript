val file = sc.textFile("ba.m10.n9.txt")
val t = file.map{x=>val s = x.split("\\s+"); (s(0).toLong, s(1).toLong)}
val t2 = t.filter(x=> x._1 <1000).map(x=> (math.log(x._1), math.log(x._2)))
t2.map(x=>x._1+"\t"+x._2).saveAsTextFile("ba.m10.n9.2.txt")
val file = sc.textFile("ba.m100.n9.txt")
val t = file.map{x=>val s = x.split("\\s+"); (s(0).toLong, s(1).toLong)}
val t2 = t.filter(x=> x._1 <5000).map(x=> (math.log(x._1), math.log(x._2)))
t2.map(x=>x._1+"\t"+x._2).saveAsTextFile("ba.m100.n9.2.txt")
val file = sc.textFile("ba.m1000.n9.txt")
val t = file.map{x=>val s = x.split("\\s+"); (s(0).toLong, s(1).toLong)}
val t2 = t.filter(x=> x._1 <25000).map(x=> (math.log(x._1), math.log(x._2)))
t2.map(x=>x._1+"\t"+x._2).saveAsTextFile("ba.m1000.n9.2.txt")
