//to compile: scalac ScalaTutorial.scala
// or scala ScalaTutorial.scala

// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//         while(i <= 10){
//             println(i)
//             i += 1
//         }
//     }
// }

// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//         do {
//             println(i)
//             i += 1
//         } while ( i <= 20)
//     }
// }


// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//         for (i <- 1 to 10)
//         println(i)
//     }
// }


// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//         val randLetters = "KJDHFSIUHFBFDUYSIUFHWOEIFH"
//         for(i <-0 until randLetters.length)
//             println(randLetters(i))

//     }
// }


// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//         val aList = List(1,2,3,4,5)
//         for(i <- aList){
//         println("List Item " + i)
//         }      
//     }
// }


// object ScalaTutorial{
//     def main(args: Array[String]){
//         var i = 0
//           var evenList = for { i <- 1 to 20
//             // You can put as many conditons here separated with semicolons
//             // as you need
//             if (i % 2) == 0
//             } yield i

//     println("Even List")
//     for(i <- evenList)
//       println(i)  
//     }
// }

object ScalaTutorial{
    def main(args: Array[String]){
        var i = 0
           for (i <- 1 to 5; j <- 6 to 10){
                println("i: " + i)
                println("j: " + j)
         }
    }
}


