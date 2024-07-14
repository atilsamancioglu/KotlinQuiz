// 1) Aşağıdaki sonuc değişkeninin veri tipi nedir?

	val sonuc = 3 + 10.2 + 50
	println(sonuc)

//2) Aşağıdaki işlemin sonucu kaç yazdırılacaktır?

	val islem = 5 + 8 * 12
	println(islem)


// 3) Aşağıdaki print hangi değeri yazdıracaktır?

	val myList = arrayListOf(2,5,10,-20,-1,40,20,1,1,1,2,4)
    	val myIx = 10 - (2*3)
    	println(myList[myIx])

// 4) Kotlin'de gerekli olduğu takdirde iç içe listeler (nested list) oluşturabiliriz. İlk 3 satır kodu incelediğinizde 4. satırdaki print'in hangi değeri yazdırmasını beklersiniz?

    	val myList = arrayListOf(2,5,10)
    	val mySecondList = arrayListOf(4,8,6)
	val myNestedList = arrayListOf(myList,mySecondList)
	println(myNestedList[0][2])


// 5) Aşağıdaki print hangi çıktıyı yazdıracaktır?

	val mySet = HashSet<String>()
        mySet.add("kotlin")
        mySet.add("Kotlin")
        mySet.add("Kotlin")
        mySet.add("Android")
        mySet.add("kotlin")

        mySet.forEach {
            println(it)
        }


// 6) Aşağıdaki print hangi çıktıyı yazdıracaktır?

        val myMap = hashMapOf<String, Int>()
        myMap.put("Atlas",20)
        myMap.put("Atıl",30)
        myMap.put("Zeynep",40)
        val myPerson = "Atlas"

        println("${myPerson}'ın yaşı ${myMap[myPerson]}'dır")


// 7) Aşağıdaki print hangi çıktıyı yazdıracaktır?

        val myMap = hashMapOf<String, Int>()
        myMap.put("Atlas",20)
        myMap.put("Atıl",30)
        myMap.put("Zeynep",40)
        val myPerson = "Atlas"

        println("${myPerson}'ın yaşı ${myMap[myPerson]}'dır")

// 8) Aşağıdakilerden hangisi Kotlin için doğru fonksiyon tanımlama yöntemidir?

	 // a) function myFunction() {}
	 // b) fun myFunction() {}
	 // c) def myFunction() {}
	 // d) func myFunction() {}

// 9) If kontrolleri için aşağıdaki syntax'ten hangisi doğru tanımlamadır?

	// a) if (x > y) { println("x is greater") }
	// b) if x > y then { println("x is greater") }
	// c) if x > y: { println("x is greater") }
	// d) if (x > y) then { println("x is greater") }

// 10) Aşağıdaki tanımlamalardan hangisi Kotlin için değeri tekrar değişmeyecek bir yapı oluşturmanın doğru yoludur?

	// a) let myVar: Int
	// b) var myVar: Int
	// c) val myVar: Int
	// d) const myVar: Int
