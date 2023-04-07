fun main(){
	val output=operation(4,5 ,{x,y ->
		println("BlaBlaBla")
		var temp= x*x
		temp+y
		})
}
fun operation(a:Int,b:Int,operate: (Int,Int)->Int):Int{
	return operate(a,b)
}