/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
	val name: String = "maya s"
    println(name)
    
    val names: Array<String> = arrayOf("maya","farhan","abhinesh","navya")  // array is homogeneous but it can also be heterogeneous by using <any>
    println(names.joinToString(" , ")) // println doesn't print the contents directly.Use joinToString()
    
     val nums: Array<Int> = arrayOf( 1, 2, 3, 4)  
    println(nums.contentToString()) // println doesn't print the contents directly.Use contentToString()
    
     val mixed: Array<Any> = arrayOf("maya","farhan", 1 ,"abhinesh", 3.14 , true ,"navya") 
    println(mixed.joinToString(" , ")) // println doesn't print the contents directly.Use joinToString()
    
}
