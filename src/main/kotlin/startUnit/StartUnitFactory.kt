package startUnit

class StartUnitFactory {
    fun createStartUnit(startUntType: StartUnitTypes): IStartUnit {
        return when(startUntType) {
            StartUnitTypes.KNIGHT -> Knight()
            StartUnitTypes.BOARRIDER -> BoarRider()
        }
    }
}