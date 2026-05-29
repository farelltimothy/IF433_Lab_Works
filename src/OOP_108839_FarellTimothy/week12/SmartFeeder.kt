package OOP_108839_FarellTimothy.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException() //sudah true
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    return availableGram - requestedGram
}