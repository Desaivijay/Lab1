// Vijaybhai Virambhai Desai
// Student ID:-  A00264568
// Program can convert diffrent values of mesurment by users choice

fun main()
{

	println("Select the type of convesion you like to perform\nA:Kilometers to Miles \nB:Miles to Kilometers \nC:Centimeters to Inches \nD:Inches to Centimeters \nE:Kilograms to Pounds \nF:Pounds To Kilograms ")//gave the usere options to select from

    val conversionMethod = readLine() //Got the value from the usere
    if(conversionMethod == "A"){
        println("enter the kilometeres to convert")//this saction will convert Kilometers in to Miles
        val KmToMi  = readLine()!!.toDouble()
        val result = KmToMi * 0.62
        println("value $KmToMi is $result")
    }
    if(conversionMethod == "B"){
        println("enter the Miles to convert")
        val MiToKm  = readLine()!!.toDouble()//this saction will convert Miles in to Kilometers
        val result = MiToKm * 1.61
        println("value $MiToKm is $result")
    }
    if(conversionMethod == "C"){
        println("enter Centimeters  to convert")//this saction will convert Centimeters in to Inches
        val CmToIn  = readLine()!!.toDouble()
        val result = CmToIn * 0.39
        println("value $CmToIn is $result Inches")
    }
    if(conversionMethod == "D"){
        println("enter the Inches to convert")//this saction will convert Inches in to Centimeters
        val InToCm  = readLine()!!.toDouble()
        val result = InToCm * 2.54
        println("value $InToCm is $result Centimeters")
    }
    if(conversionMethod == "E"){
        println("enter the Kilograms to convert")//this saction will convert Kilograms in to Pounds
        val KgToLbs  = readLine()!!.toDouble()
        val result = KgToLbs * 2.2
        println("value $KgToLbs is $result pounds")
    }
    if(conversionMethod == "F"){
        println("enter the Pounds to convert")//this saction will convert Pounds in To Kilograms
        val LbsToKg  = readLine()!!.toDouble()
        val result = LbsToKg * 0.45
        println("value $LbsToKg is $result Kilograms")
    }else{
    print("wrong input please select one of the given option")//if the user enters undefined charactour
    }

}
