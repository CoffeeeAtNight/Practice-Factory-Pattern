package nation

import startUnit.IStartUnit
import startUnit.StartUnitFactory
import startUnit.StartUnitTypes

class Orc: INation {
    override fun chooseStartUnit(): IStartUnit {
        return StartUnitFactory().createStartUnit(StartUnitTypes.BOARRIDER)
    }
}