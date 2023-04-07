fun main(){
	print(operation(2,5))
	greeting("Good Morning")
	greetings("Good Morning","Sherry")
	greetingss(greet="Good Morning",name="Sherry")
	greetingsss()
}
fun operation(a:Int, b:Int):Int{
	return a+b
}
fun greeting(greet:String){
	println("Hello $greet")
}
fun greetings(name:String="Soumi",greet:String="Good Evening"){
	print("Hello $name , $greet")
}
fun greetingss(name:String="Anuj",greet:String="Hello"){
	print("Hello $name , $greet")
}
fun greetingsss(name:String="Ayush",greet:String="Hey"){
	print("Hello $name , $greet")
}