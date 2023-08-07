package nation

class NationFactory {
    fun createNation(nationTypes: NationTypes): INation {
        return when(nationTypes) {
            NationTypes.HUMAN -> Human()
            NationTypes.ORC -> Orc()
        }
    }
}