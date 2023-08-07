import nation.NationFactory
import nation.NationTypes

fun main() {
    val nationFactory = NationFactory()

    val playerOne = Player()
    playerOne.nation = nationFactory.createNation(NationTypes.HUMAN)

    val playerTwo = Player()
    playerTwo.nation = nationFactory.createNation(NationTypes.ORC)

    println(playerOne.nation)
    println(playerTwo.nation)
}