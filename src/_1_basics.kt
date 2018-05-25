fun main(args : Array<String>) {
    println("Fish left: $basicOperations_fishLeft")
    println("Needed Aquariums: ${basicOperations_neededAquariums()}")
}

val basicOperations_fishLeft = 2.plus(71).plus(233).minus(13)

fun basicOperations_neededAquariums() : Int {
    var neededAquariums = basicOperations_fishLeft / 30
    val oneMoreAquarium = basicOperations_fishLeft % 30 > 0
    if (oneMoreAquarium)
        neededAquariums++
    return neededAquariums
}
